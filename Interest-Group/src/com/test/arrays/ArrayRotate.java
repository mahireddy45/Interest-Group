package com.test.arrays;

public class ArrayRotate {
	
	//Using auxiliary array of size d for rotation
	//Space Complexity O(d)
	//Time Complexity O(n)
	private static void auxArrRotation(int[] arr, int d, int len) {
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
	
	//Approach 2: 
	//Rotate one by one 
	//Time Complexity: O(d*n)
	private static void rotateOneByOne(int[] arr, int d, int len) {
		for(int i=0; i<d; i++) {
			int temp = arr[0];
			int j;
			for(j=0; j<len-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
		}
	}
	
	//Approach 3: 
	//Reverse starting to d 
	//Reverse d to len-1
	//Reverse 0 to len-1
	//Time Complexity: O(n)
	private static void reverseLogicUsingArrRotation(int[] arr, int d, int len) {
		reverse(arr, 0, d-1);
		reverse(arr, d, len-1);
		reverse(arr, 0, len-1);
	}
	private static void reverse(int[] arr, int i, int d) {
		while(i<d) {
			int temp = arr[i];
			arr[i] = arr[d];
			arr[d] = temp;
			i++; d--;
		}
	}
	
	public static void main(String[] args) {
		// Given size (d) rotation of array arr
		int[] arr = {1,2,3,4,5,6,7,8};
		int d = 3; 
		int len = arr.length;
		//Apporach1 
		//auxArrRotation(arr, d, len);	
		
		//Apporach2
		//rotateOneByOne(arr, d, len);
		
		//Approach3
		reverseLogicUsingArrRotation(arr, d, len);
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}