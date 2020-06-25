package arvores;

public class ArvoreBST<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

	public void inserir(T info) {
		if (this.vazia()) {
			this.setRaiz(new NoArvoreBST<T>(info));
		} else {
			((NoArvoreBST<T>) this.getRaiz()).inserir(info);
		}
	}

	public NoArvoreBST<T> buscar(T info) {
		if (this.vazia()) {
			return null;
		}
		return ((NoArvoreBST<T>) this.getRaiz()).buscar(info);
	}

	public void retirar(T info) {
		NoArvoreBST<T> aRetirar = this.buscar(info);
		if (aRetirar != null) {
			this.retirar(aRetirar);
		}
	}

	private void retirar(NoArvoreBST<T> aRetirar) {
		if (aRetirar == this.getRaiz()) {
			if (aRetirar.getEsq() == null && aRetirar.getDir() == null) { // é nó folha
				this.setRaiz(null);
			} else {
				if (aRetirar.getEsq() == null || aRetirar.getDir() == null) { // tem 1 filho
					if (aRetirar.getEsq() != null) { // filho está à esquerda
						this.setRaiz(aRetirar.getEsq());
					} else { // filho está à direita
						this.setRaiz(aRetirar.getDir());
					}
				} else {// tem 2 filhos
					NoArvoreBST<T> sucessor = this.sucessor(aRetirar);
					T infoSucessor = sucessor.getInfo();
					this.retirar(sucessor);
					this.getRaiz().setInfo(infoSucessor);
				}
			}
		} else { // aRetirar não é raiz
			NoArvoreBST<T> pai = this.buscarPai(aRetirar);
			if (aRetirar.getEsq() == null && aRetirar.getDir() == null) { // é nó folha
				if (pai.getDir() == aRetirar) {
					pai.setDir(null);
				} else {
					pai.setEsq(null);
				}
			} else {
				if (aRetirar.getEsq() == null || aRetirar.getDir() == null) { // tem 1 filho
					NoArvoreBST<T> filho;
					if (aRetirar.getEsq() != null) { // filho está à esquerda
						filho = (NoArvoreBST<T>) aRetirar.getEsq();
					} else { // filho está à direita
						filho = (NoArvoreBST<T>) aRetirar.getDir();
					}
					if (pai.getDir() == aRetirar) {
						pai.setDir(filho);
					} else {
						pai.setEsq(filho);
					}
				} else {// tem 2 filhos
					NoArvoreBST<T> sucessor = this.sucessor(aRetirar);
					T infoSucessor = sucessor.getInfo();
					this.retirar(sucessor);
					aRetirar.setInfo(infoSucessor);
				}
			}
		}
	}

	private NoArvoreBST<T> buscarPai(NoArvoreBST<T> filho) {
		if (this.vazia() || filho == null || this.getRaiz() == filho) {
			return null;
		}
		NoArvoreBST<T> pai = (NoArvoreBST<T>) this.getRaiz();
		while (pai != null) {
			if (pai.getDir() == filho || pai.getEsq() == filho) {
				return pai;
			}
			if (pai.getInfo().compareTo(filho.getInfo()) > 0) { // está à esquerda
				pai = (NoArvoreBST<T>) pai.getEsq();
			} else { // está à direita
				pai = (NoArvoreBST<T>) pai.getDir();
			}
		}

		return null;
	}

	public T encontrarMenor() {
		if (this.vazia()) {
			return null;
		}
		NoArvoreBST<T> noAtual = (NoArvoreBST<T>) getRaiz();
		while (noAtual.getEsq() != null) {
			noAtual = (NoArvoreBST<T>) noAtual.getEsq();
		}
		return noAtual.getInfo();
	}

	public T encontrarMaior() {
		if (this.vazia()) {
			return null;
		}
		NoArvoreBST<T> noAtual = (NoArvoreBST<T>) getRaiz();
		while (noAtual.getDir() != null) {
			noAtual = (NoArvoreBST<T>) noAtual.getDir();
		}
		return noAtual.getInfo();
	}

	public NoArvoreBST<T> sucessor(NoArvoreBST<T> no) {
		if (no.getDir() != null) {
			NoArvoreBST<T> sucessor = (NoArvoreBST<T>) no.getDir();
			while (sucessor.getEsq() != null) {
				sucessor = (NoArvoreBST<T>) sucessor.getEsq();
			}
			return sucessor;
		} else {
			NoArvoreBST<T> pai = no;
			do {
				pai = buscarPai(pai);
			} while (pai != null && no.getInfo().compareTo(pai.getInfo()) > 0);
			return pai;
		}
	}

	public NoArvoreBST<T> antecessor(NoArvoreBST<T> no) {
		if (no.getEsq() != null) {
			NoArvoreBST<T> antecessor = (NoArvoreBST<T>) no.getEsq();
			while (antecessor.getDir() != null) {
				antecessor = (NoArvoreBST<T>) antecessor.getDir();
			}
			return antecessor;
		} else {
			NoArvoreBST<T> pai = no;
			do {
				pai = buscarPai(pai);
			} while (pai != null && no.getInfo().compareTo(pai.getInfo()) < 0);
			return pai;
		}
	}

	public String toStringOrdered() {
		if (this.vazia()) {
			return "";
		} else {
			return this.getRaiz().imprimeCentral();
		}
	}

	public String toStringOrdered2() {
		if (this.vazia()) {
			return "";
		} else {
			NoArvoreBST<T> no = this.buscar(encontrarMenor());
			String str = "";
			do {
				str += " " + no.getInfo().toString();
				no = this.sucessor(no);
			} while (no != null);
			return str;
		}
	}
}
