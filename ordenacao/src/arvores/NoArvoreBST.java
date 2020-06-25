package arvores;

public class NoArvoreBST<T extends Comparable<T>> extends NoArvoreBinaria<T> {

	public NoArvoreBST(T info) {
		super(info);
	}

	public NoArvoreBST<T> buscar(T buscado) {
		if (this.getInfo().equals(buscado)) {
			return this;
		}
		if (buscado.compareTo(this.getInfo()) < 0) { // se buscado for menor que info
			// esquerda
			if (this.getEsq() != null) {
				return ((NoArvoreBST<T>) this.getEsq()).buscar(buscado);
			}
		} else {
			// direita
			if (this.getDir() != null) {
				return ((NoArvoreBST<T>) this.getDir()).buscar(buscado);
			}
		}
		return null; // buscado não encontrado
	}

	public void inserir(T info) {
		if (info.compareTo(this.getInfo()) < 0) { // se buscado for menor que info
			// esquerda
			if (this.getEsq() == null) {
				this.setEsq(new NoArvoreBST<T>(info));
			}
			else {
				((NoArvoreBST<T>) this.getEsq()).inserir(info);
			}
		} else {
			// direita
			if (this.getDir() == null) {
				this.setDir(new NoArvoreBST<T>(info));
			}
			else {
				((NoArvoreBST<T>) this.getDir()).inserir(info);
			}
		}		
	}
}
