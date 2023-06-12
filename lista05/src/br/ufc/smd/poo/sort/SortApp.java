package br.ufc.smd.poo.sort;

import br.ufc.smd.poo.sort.model.*;
import java.util.Arrays;

public class SortApp {

	public static void main(String[] args) {
		int [] myarray = {0, 5, 2};
		Sort s = new Sort();
		s.sort(myarray);
		System.out.println("Array after sorting: " + Arrays.toString(myarray));
		System.out.println("");
		int [] myarray2 = {0, 5, 2};
		MergeSort ms = new MergeSort();
		ms.sort(myarray2);
		System.out.println("Array after sorting: " + Arrays.toString(myarray2));
		System.out.println("");
	}

}
