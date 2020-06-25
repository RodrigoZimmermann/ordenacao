package arvores;

public class MainArvoreVeiculos {
	public static void main(String[] args) {
		ArvoreBST<Veiculo> veiculos = new ArvoreBST<>();
		
		Veiculo a = new Veiculo("MJT-7432", "Fusca", 1912, "Pedro");
		Veiculo b = new Veiculo("MIT-8008", "Celta", 1999, "Douglas");
		Veiculo c = new Veiculo("MEI-4665", "Gol", 2002, "Carlos");
		Veiculo d = new Veiculo("MIO-6668", "Fusca", 1915, "Aline");
		Veiculo e = new Veiculo("DIO-3333", "Celta", 1999, "Fausto");
		Veiculo f = new Veiculo("PAO-6472", "C3", 2007, "Carolina");
		Veiculo g = new Veiculo("CAO-2890", "C4", 2012, "Kelvin");
		Veiculo h = new Veiculo("UVA-3939", "BMW", 2015, "Zé");
		Veiculo i = new Veiculo("OVO-0000", "Gol", 2000, "Joshua");
		
		//Veiculo.setComparador(new ComparadorVeiculoModelo());		
		
		veiculos.inserir(a);
		veiculos.inserir(b);
		veiculos.inserir(c);
		veiculos.inserir(d);
		veiculos.inserir(e);
		veiculos.inserir(f);
		veiculos.inserir(g);
		veiculos.inserir(h);
		veiculos.inserir(i);
		veiculos.inserir(new Veiculo("ABC-1234", "Ferrari", 2015, "Marta"));
		

		System.out.println(veiculos.toString());
		System.out.println(veiculos.toStringOrdered());

		Veiculo v = veiculos.sucessor(veiculos.buscar(a)).getInfo();
		System.out.println("Sucessor de "+a+" é " +v);
		v = veiculos.antecessor(veiculos.buscar(e)).getInfo();
		System.out.println("Antecessor de "+e+" é " +v);
	}
}
