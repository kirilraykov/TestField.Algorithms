package com.kiril.alg.binarysearch;

public class BinarySearch {

	public static int[] a = { 1, 6, 7, 8, 11, 77, 88, 356, 846 };

	public static void main(String[] args) {
		System.out.println(binarySearch(a, 77));
		System.out.println(linearSearchRecursive(a, 0, 77));
		System.out.println(binarySearchRecursive(a, 0, a.length-1, 77));
	}

	//binary search 
	public static int binarySearch(int a[], int x) {
		int first = 0;
		int last = a.length - 1;
		int mid;

		//break the array into two subarrays
		//comparing the mid point with the searched value
		//if the middle is bigger than the searched value,
		//create a subarray with boundries[0, mid-1]
		
		while (first <= last) {
			mid = (first + last) / 2;

			if (a[mid] == x)
				return mid;

			if (a[mid] > x)
				last = mid - 1;

			else
				first = mid + 1;
		}
		return -1;
	}
	
	
	//linear search recursive
	public static int linearSearchRecursive(int a[], int i, int x){
		if(i > a.length-1)
			return -1;
		else if(a[i] == x)
			return i;
		else
			return linearSearchRecursive(a, i + 1, x);
	}
	
	
	//binary search recursive
	public static int binarySearchRecursive(int a[], int first, int last, int x){
		int mid;
		
		if(first > last)
			return -1;
		else{
			mid = (first + last) / 2;
			if(a[mid] == x)
				return mid;
			else if(a[mid] > x)
				return binarySearchRecursive(a, first, mid-1, x);
			else
				return binarySearchRecursive(a, mid+1, last, x);
		}
		
	}

}
