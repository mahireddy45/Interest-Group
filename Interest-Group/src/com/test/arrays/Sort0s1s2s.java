package com.test.arrays;

public class Sort0s1s2s {

	//Take three variables low, mid, high
	//low is used to maitain 0s
	//mid is used to maintain 1s
	//high is used to maintain 2s trak logic with mid
	public static void sortNumbers(int[] a) {
		int low = 0;
		int mid = 0;
		int high = a.length-1;
		int temp = 0;
		while(mid<=high) {
			switch(a[mid]) {
			case 0:
				temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++; mid++;
				break;
			case 1:
				mid++;
				break;
			case 2: 
				temp = a[high];
				a[high] = a[mid];
				a[mid] = temp;
				high--;
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 0, 1, 2};
		sortNumbers(arr);
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
