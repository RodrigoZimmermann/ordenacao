
package arvores;

public class MainArvores {

	public static void main(String[] args) {

		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);

		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);

		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

		arvore.setRaiz(no1);
		System.out.println("Buscado 1. Localizado ->" + no1.pertence(1).getInfo());
		System.out.println(arvore.toString());
		System.out.println("-----");

		ArvoreBST<String> abc = new ArvoreBST<>();

		abc.inserir("renata");
		abc.inserir("pedro");
		abc.inserir("felipe");
		abc.inserir("henrique");
		abc.inserir("gabriel");
		abc.inserir("djonathan");
		abc.inserir("saul");
		abc.inserir("xuxa");
		System.out.println("Buscado gabriel. Localizado ->" + abc.buscar("gabriel").getInfo());
		System.out.println("Buscado xuxa. Localizado ->" + abc.buscar("xuxa").getInfo());
		System.out.println("Buscado marcel. Localizado ->" + abc.buscar("marcel"));
		System.out.println(abc.toString());
		abc.retirar("felipe");
		System.out.println(abc.toString());
		abc.retirar("djonathan");
		System.out.println(abc.toString());
		abc.retirar("saul");
		System.out.println(abc.toString());
		
		
		ArvoreBST<Integer> exemplo = new ArvoreBST<>();
        
        exemplo.inserir(63);
        exemplo.inserir(27);
        exemplo.inserir(80);
        exemplo.inserir(13);
        exemplo.inserir(51);
        exemplo.inserir(70);
        exemplo.inserir(92);
        exemplo.inserir(26);
        exemplo.inserir(33);
        exemplo.inserir(58);
        exemplo.inserir(82);
        exemplo.inserir(57);
        exemplo.inserir(60);
        System.out.println(exemplo.toString());
        System.out.println(exemplo.toStringOrdered());
        System.out.println(exemplo.toStringOrdered2());
        NoArvoreBST<Integer> no = exemplo.buscar(70);
        System.out.println(exemplo.antecessor(no).getInfo());
	}

}