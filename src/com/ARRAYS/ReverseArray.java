package com.ARRAYS;

public class ReverseArray {


public static void Reverse(int arr[]) {
	int start = 0, end = arr.length - 1;
	while (start < end) {
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
		start++;
		end--;
	}
}

public static void main(String[] args) {
	int a[] = {4, 3, 2, 10};
	Reverse(a);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}