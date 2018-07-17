package com.test.arrays;

import java.util.Arrays;
public class SortInWaveForm {
	//Approach 1: 
	//Sort an array and swap adjacent elements to get wave form
	private static void sortWave1(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i=0; i<n-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
		int n = arr.length;
		
		sortWave1(arr, n);
		
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
	}
}