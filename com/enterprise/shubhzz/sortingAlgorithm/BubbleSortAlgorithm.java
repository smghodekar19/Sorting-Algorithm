package com.enterprise.shubhzz.sortingAlgorithm;

import java.util.Arrays;

//Bubble sort is easiest sorting algorithm with O(n2) time complexity 
//which focuses on swapping of adjacent elements if not in order, by keeping most significant element of right most or left most and adjacently keeping further
//it has space complexity of O(1) as it doesn't uses any extra space


public class BubbleSortAlgorithm {
	
	public static int[] sort(int[] array, SortCriterion sortCriterion) {
		
		Boolean isAsc = false;
		if (sortCriterion == sortCriterion.ASC) {
			isAsc = true;
		}
		
		for(int i=0; i< array.length-1; i++) {
			for(int j=i; j< array.length; j++) {
				if(isAsc ? array[i] > array[j] : array[i] < array[j] ) {
					//swapping of elements
//					System.out.println("Before" + array[i] + " : " + array[j]);
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
//					System.out.println("After" + array[i] + " : " + array[j]);
				}
			}
		}
		
		return array;
	}
public static void main(String[] args) {
	int[] array = {45,32,56,34,76,345,766,89,45,67,64,34,54,51,86};
//	Arrays.stream(array).boxed().forEach(System.out::println);;
	int[] sortedArray = BubbleSortAlgorithm.sort(array, SortCriterion.DESC);
	
	Arrays.stream(sortedArray).boxed().forEach(System.out::println);;
}
}
