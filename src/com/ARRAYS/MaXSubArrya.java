package com.ARRAYS;

public class MaXSubArrya {
public static void max(int arr[]){
	int largest=Integer.MIN_VALUE;
	int sum=0;
	for (int i=0;i< arr.length;i++){
		for (int j=i;j<arr.length;j++){
			int curr = 0;
			for (int k=i;k<=j;k++){
				curr += arr[k];
				if(curr> largest){
					largest=curr;
				}
			}
		}
	}
	System.out.println(largest+ " "+ "is the largest ");
}
public static void main(String[] args) {
	int arr[] = {2,4,6,8,10};
	max(arr);
}
}
