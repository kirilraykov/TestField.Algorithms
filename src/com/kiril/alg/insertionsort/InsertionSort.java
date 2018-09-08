package com.kiril.alg.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = insertionSort(new int[] {53, 78, 2, 7, 8, 167, 843, 8373});

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	// creates sorted and unsorted portions(at the begginig the sorted portion is the first element)
	// compare the next element from the unsorted portion to every element in the sorted
	// if an element from the sorted is smaller than the current element, swap them
	// the algorithms works from right to left
	
	public static int[] insertionSort(int a[]){
		for(int i = 1; i < a.length; i++){
			int element = a[i]; //element variable contains data we are brining over to the sorted area
			int j = i-1; //variable points to the index position of the last value in the sorted area
			
			while(j >= 0 && a[j] > element){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}
}
