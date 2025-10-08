package com.Searching;

public class LargestNumber {

public static int largest(int arr[]){
	int largest = 0;
	for (int i=0;i<arr.length;i++){
	
		if(arr[i] > largest){
			largest = arr[i];
		}
	}
	return largest;

}

public static void main(String[] args) {
	int arr[] = {1,2,356,6,7,8879,6765,453,322,32,323,4,345,45,45};
	int lar = largest(arr);
	System.out.println(lar + " "+ " is largest ");
	
}
}
