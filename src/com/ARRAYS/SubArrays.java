package com.ARRAYS;

public class SubArrays {
public static void news(int arr[]){
    int n= arr.length;
	for (int i=0;i<n;i++){
		for (int j=i;j<n;j++){
			for (int k=i;k<=j;k++){
				System.out.print(arr[k]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
}
public static void main(String[] args) {
	int arr[] = {2,4,6,8};
	news(arr);
}
}
