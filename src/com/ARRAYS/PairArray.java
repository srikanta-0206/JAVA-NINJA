package com.ARRAYS;

public class PairArray {
public static void ne (int arr[]){
	int n = arr.length;
	int tp=0;
	for (int i=0; i<n;i++){
		for (int j=i+1;j<n;j++){
			System.out.print("(" +arr[i]+","+ arr[j]+")");
			tp++;
		}
		System.out.println();
	}
	System.out.println("total pair"+" "+ tp);
}
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	ne(arr);
}
}
