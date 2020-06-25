package arvores;

public class NoArvoreBinaria<T> {
	// Atributos
	private T info;
	private NoArvoreBinaria<T> esq;
	private NoArvoreBinaria<T> dir;

	// Construtores
	public NoArvoreBinaria(T info) {
		this.info = info;
	}

	public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
		this.info = info;
		this.esq = esq;
		this.dir = dir;
	}
	
	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public NoArvoreBinaria<T> getEsq() {
		return esq;
	}

	public void setEsq(NoArvoreBinaria<T> esq) {
		this.esq = esq;
	}

	public NoArvoreBinaria<T> getDir() {
		return dir;
	}

	public void setDir(NoArvoreBinaria<T> dir) {
		this.dir = dir;
	}

	public NoArvoreBinaria<T> pertence(T info) {
		if (this.info.equals(info)) {
			return this;
		}

		NoArvoreBinaria<T> retorno = null;
		if (esq != null) {
			retorno = esq.pertence(info);
			if (retorno != null) {
				return retorno;
			}
		}

		if (dir != null) {
			retorno = dir.pertence(info);
		}

		return retorno;
	}

	public String imprimePre() {
		// trata a raiz
		String str = "<" + this.info;
		// vai � esquerda
		if (esq != null) {
			str += esq.imprimePre();
		}
		else {
			str += "<>";
		}
		// vai � direita
		if (dir != null) {
			str += dir.imprimePre();
		}
		else {
			str += "<>";
		}
		return str + ">";
	}
	
	public String imprimeCentral() {
		String str = "";
		// vai � esquerda
		if (esq != null) {
			str += esq.imprimeCentral();
		}

		// trata a raiz
		str += " "+this.info.toString();
		// vai � direita
		if (dir != null) {
			str += dir.imprimeCentral();
		}

		return str;
	}
}
