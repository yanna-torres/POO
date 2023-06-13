package br.ufc.smd.poo.sort;

import java.util.Random;

import br.ufc.smd.poo.sort.model.*;

public class SortApp {

	public static void main(String[] args) {
		int [] a1 = generateRandomArray(100000);
		int [] a2 = generateRandomArray(100000);
		int [] a3 = generateRandomArray(100000);
		
		Sort bubbleSort = new Sort();
		Sort mergeSort = new MergeSort();
		Sort quickSort = new QuickSort();
		
		long bubbleSortStartTime = System.currentTimeMillis();
		bubbleSort.sort(a1);
		long bubbleSortEndTime = System.currentTimeMillis();
		long bubbleSortTime = bubbleSortEndTime - bubbleSortStartTime;

		
		long mergeSortStartTime = System.currentTimeMillis();
		mergeSort.sort(a2);
		long mergeSortEndTime = System.currentTimeMillis();
		long mergeSortTime = mergeSortEndTime - mergeSortStartTime;
		
		long quickSortStartTime = System.currentTimeMillis();
		quickSort.sort(a3);
		long quickSortEndTime = System.currentTimeMillis();
		long quickSortTime = quickSortEndTime - quickSortStartTime;
		
		System.out.println("Bubble sort time: " + bubbleSortTime + " milliseconds");
		System.out.println("Merge sort time: " + mergeSortTime + " milliseconds");
		System.out.println("Quick sort time: " + quickSortTime + " milliseconds");
		
			
	}

	private static int[] generateRandomArray(int size) {
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i ++) {
			array[i] = random.nextInt(1000);
		}
		return array;
	}
}