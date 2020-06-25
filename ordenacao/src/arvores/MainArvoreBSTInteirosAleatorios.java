package arvores;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class MainArvoreBSTInteirosAleatorios {

	public static void main(String[] args) {
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantos elementos?"));
		ArvoreBST<Integer> arvore = new ArvoreBST<>();
		int[] vetor = new int[qtde];
		Random r = new Random();
		int valor;
		
		for (int i=0; i < qtde;i++) {
			valor = r.nextInt(100_000);
			arvore.inserir(valor);
			vetor[i] = valor;
		}
		System.out.println(Arrays.toString(vetor));
		System.out.println(arvore.toString());
		
		int posicao;
		for (int i=0; i < qtde;i++) {
			posicao = r.nextInt(qtde);
			while (vetor[posicao] == -1) {
				posicao = r.nextInt(qtde);
			}
			arvore.retirar(vetor[posicao]);
			System.out.println("Removido "+vetor[posicao]+" -> "+arvore.toString());
			vetor[posicao] = -1;
		}
		
	}

}
