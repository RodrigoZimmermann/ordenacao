package arvores;

public class Veiculo implements Comparable<Veiculo> {
	private String placa;
	private String modelo;
	private int ano;
	private String proprietario;
	//private static Comparator<Veiculo> comparador;

	public Veiculo(String placa, String modelo, int ano, 
					String proprietario) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.proprietario = proprietario;
	}

	/*
	public static void setComparador(Comparator<Veiculo> comparador) {
		Veiculo.comparador = comparador;
	}
	*/

	public String toString() {
		return String.format("\nVeículo %s, placa %s, ano %s, de %s", this.modelo, this.placa, this.ano,
				this.proprietario);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public int compareTo(Veiculo outro) {
		return this.getPlaca().compareTo(outro.getPlaca());
		//return comparador.compare(this, outro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo v = (Veiculo) obj;
		return this.getPlaca().equals(v.getPlaca());
	}
}