package com.test.arrays;

public class ArrayRotate {
	
	//Using auxiliray array for rotation
	private static void auxArrRotation(int[] arr, int d) {
		int len = arr.length;
		int[] auxArr = new int[d];
		for(int i =0; i<d; i++) {
			auxArr[i] = arr[i];
		}
		for(int i=d; i<len; i++) {
			arr[i-d] = arr[i];
		}
		for(int i=0; i<d; i++) {
			arr[len-d+i] = auxArr[i];
		}
	}
	
	public static void main(String[] args) {
		// Given size (d) rotation of array arr
		int[] arr = {1,2,3,4,5,6,7,8};
		int d = 3; 
		
		//Call Apporach1 
		auxArrRotation(arr, d);	
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}