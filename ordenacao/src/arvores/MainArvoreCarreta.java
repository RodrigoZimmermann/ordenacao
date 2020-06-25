package arvores;

public class MainArvoreCarreta {

	public static void main(String[] args) {
		Carreta a = new Carreta("MJT-7432", "Fusca", 1912, "Pedro");
        Carreta b = new Carreta("MIT-8008", "Celta", 1999, "Douglas");
        Carreta c = new Carreta("MEI-4665", "Gol", 2002, "Carlos");
        Carreta d = new Carreta("MIO-6668", "Fusca", 1915, "Aline");
        Carreta e = new Carreta("DIO-3333", "Celta", 1999, "Fausto");
        Carreta f = new Carreta("PAO-6472", "C3", 2007, "Carolina");
        Carreta g = new Carreta("CAO-2890", "C4", 2012, "Kelvin");
        Carreta h = new Carreta("UVA-3939", "BMW", 2015, "Zé");
        Carreta i = new Carreta("OVO-0000", "Gol", 2000, "Joshua");
        Carreta j = new Carreta("ABC-1234", "Ferrari", 2015, "Marta");

        ArvoreBST<Veiculo> arvore = new ArvoreBST<Veiculo>();

        arvore.inserir(a);
        arvore.inserir(b);
        arvore.inserir(c);
        arvore.inserir(d);
        arvore.inserir(e);
        arvore.inserir(f);
        arvore.inserir(g);
        arvore.inserir(h);
        arvore.inserir(i);
        arvore.inserir(j);
        arvore.retirar(d);

        System.out.println(arvore.toStringOrdered());
	}

}
