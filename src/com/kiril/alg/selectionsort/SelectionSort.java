package com.kiril.alg.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] { 53, 6, 83, 36, 8, 2, 578, 8159, 15 });

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
	
	// scan begins from the 1st element(Assuming its smallest)
	// loop through the array and if it finds smaller element, set the new smallest to be this one 
	// and swaps the last smallest with the new-found smallest
	// next time it starts from the next element and goes through the same steps

	public static int[] selectionSort(int a[]) {
		int min;

		// assume the current a[i] is the smallest num
		for (int i = 0; i < a.length; i++) {
			min = i;

			// compare the current number to all the rest of the array
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[min])
					min = j;
			}
			// swap the elements
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		return a;
	}
	
}