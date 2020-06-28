/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author Rodrigo Luís Zimmermann e Matheus Felipe da Silva Sychocki
 * @param <T>
 */
public class Selection<T> implements Sort {

    @Override
    public void sort(Comparable[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j].toString().length() < vetor[minIndex].toString().length()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = (T)vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = (Comparable) temp;
            }
        }
    }
}