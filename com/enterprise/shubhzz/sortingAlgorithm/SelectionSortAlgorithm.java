package com.enterprise.shubhzz.sortingAlgorithm;

import java.util.Arrays;

// its similar algorithm with bubble sort with similar time and space complexity
// minimum element is found from array and kept at first position and further similar is continued
public class SelectionSortAlgorithm {
 public static void sort(int[] array) {
	 int n = array.length;
	 for(int i=0; i< n-1; i++) {
		 int min_index= i;
		 
		 for(int j=i+1; j< n; j++) {
			 if(array[j] < array[min_index]) {
				 min_index = j;
			 }
		 }	 
			 int temp = array[i];
			 array[i] = array[min_index];
			 array[min_index] = temp;
		 
	 }
 }
 
 public static void main(String[] args) {
		int[] array = {45,32,56,34,76,345,766,89,45,67,64,34,54,51,86};
//		Arrays.stream(array).boxed().forEach(System.out::println);;
		SelectionSortAlgorithm.sort(array);
		Arrays.stream(array).boxed().forEach(System.out::println);;
	}
}
