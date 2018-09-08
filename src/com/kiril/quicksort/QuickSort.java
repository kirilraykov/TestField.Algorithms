package com.kiril.quicksort;

public class QuickSort {

	public static void main(String[] args) {
		int[] myArray = {53, 6, 83, 36, 8, 2, 578, 8159};
		quickSort(myArray, 0, myArray.length-1);

		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}

	}

	private static int[] quickSort(int[] a, int start, int end) {
		
		//get partition point and sort array till start < end
		if(start < end) {
			int pp = partition(a, start, end);
			quickSort(a, start, pp - 1);
			quickSort(a, pp + 1, end);
		}
		
		return a;
	}

	//return a partition point (sorted element in the middle of the array)
	public static int partition(int[] inputarray, int start, int end) {
		int x = end;
		int i = -1;

		//scan through the given array
		//comapring j with the pivot(last) element
		//if j is less the pivot, increment i and swap i with j
		for (int j = 0; j <= end; j++) {
			if (inputarray[j] <= inputarray[x]) {
				i++;
				int temp = inputarray[i];
				inputarray[i] = inputarray[j];
				inputarray[j] = temp;
			}
		}
		//when its done through the array
		//set or swap the pivot(last) element with the current i
		x = i;
		
		//return the partition point
		return x;
	}
}
