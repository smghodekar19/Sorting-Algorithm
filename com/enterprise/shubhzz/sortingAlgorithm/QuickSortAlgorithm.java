package com.enterprise.shubhzz.sortingAlgorithm;

import java.util.Arrays;


//Quick sort algorigthm is based on divide and conquer stategy algorithm
//One pivot element is found and arrays are sorted like all elements smaller than pivot on left side and bigger on right side.
//Further both side array is sorted based on similar pattern.

// Below used to find pivot element and apply sort on 2 different parts of array.
public class QuickSortAlgorithm {
 public static void sort(int[] array, int high, int low) {
	 if(low < high) {
		 int pivot = getPartition(array, high, low);
		 sort(array, pivot-1, low);
		 sort(array, high, pivot+1);
	 }
	
	 
 }
// used to get partition element index based on which array will be divided
 public static int getPartition(int[] array, int high, int low) {
	 int pivot = array[high];
	 int i = low-1;
	 
	 for(int j = low; j<= high-1; j++) {
		 if(array[j] < pivot) {
			 i++;
			 swap(array, i,j);
		 }
	 }
	 swap(array, i+1, high);
	 return i+1;
	 
	 
 }
//  for swapping purpose
 public static void swap(int[] array, int i, int j) {
	 int temp = array[j];
	 array[j] = array[i];
	 array[i] = temp;
 }
 
 public static void main(String[] args) {
		int[] array = {45,32,56,34,76,345,766,89,45,67,64,34,54,51,86};
//		Arrays.stream(array).boxed().forEach(System.out::println);;
		QuickSortAlgorithm.sort(array, array.length-1, 0);
		Arrays.stream(array).boxed().forEach(System.out::println);;
	}
}
