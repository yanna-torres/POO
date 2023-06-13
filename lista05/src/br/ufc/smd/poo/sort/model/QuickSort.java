package br.ufc.smd.poo.sort.model;

public class QuickSort extends Sort {

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(array, inicio, fim);
			quickSort(array, inicio, posicaoPivo - 1);
			quickSort(array, posicaoPivo + 1, fim);
		}
	}

	private static int separar(int[] array, int inicio, int fim) {
		int pivo = array[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (array[i] <= pivo)
				i++;
			else if (pivo < array[f])
				f--;
			else {
				int troca = array[i];
				array[i] = array[f];
				array[f] = troca;
				i++;
				f--;
			}
		}
		array[inicio] = array[f];
		array[f] = pivo;
		return f;
	}

}