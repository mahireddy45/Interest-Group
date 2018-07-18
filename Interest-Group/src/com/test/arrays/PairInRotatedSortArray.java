package com.test.arrays;

public class PairInRotatedSortArray {
	//Using partition logic find lowest elements one side and highest elements other side
	//Use circular queue logic 
	private static boolean findPai(int[] arr, int x) {
		int n = arr.length;
		int pivot = 0;
		for(int i=0; i<n-1; i++) {
			if(arr[i]>arr[i+1]) {
				pivot = i;
				break;
			}
		}
		int left =  pivot;
		int right = (pivot+1)%n;
		while(left != right) {
			if(arr[left]+arr[right] == x)
				return true;
			if(arr[left]+arr[right] > x)
				left = (n + left - 1)%n;
			else
				right = (right + 1)%n;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {11, 15, 26, 38, 9, 10};
		int x = 35;
		
		System.out.println(findPai(arr, x));
		
	}
}