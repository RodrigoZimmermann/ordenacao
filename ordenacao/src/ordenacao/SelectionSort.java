/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author Rodrigo Luís Zimmermann
 */
public class SelectionSort<T> implements Sort {

    @Override
    public void sort(Comparable[] vetor) {
        for (int i = 0; i < vetor.length; i++) { // percorre vetor até o fim
            boolean troca = false; // flag para saber se já está ordenado e economizar memória
            for (int j = 0; j > vetor.length; j++) { // percorre i
                if (vetor[j].compareTo(vetor[j + 1]) > 0) { // ve se o anterior é maior que posterior
                    T temp = (T) vetor[j + 1]; // armazena posterior
                    vetor[j + 1] = vetor[j]; // coloca o anterior no posterior
                    vetor[j] = (Comparable) temp; // coloca o menor pra frente
                    troca = true;
                }
            }
            if (troca != true) { // caso esteja ordenado
                return;
            }
        }
        /*
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
         */
    }

}
