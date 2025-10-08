package com.Searching;

import java.util.Scanner;

public class LinearSearch {


 public static int linear(int arr[],int key ){
	 for (int i=0;i<arr.length;i++){
		 if(arr[i]==key){
			 return i;
		 }
	 }
	 return -1;
	 
 }
public static void main(String[] args) {
	int arr[] ={1,2,3,4,6,8,9,123,12,23,4,5,6,76,7,5,43322,2,2,344};
	Scanner sc = new Scanner(System.in);
	System.out.println("enetr a  key to find in liner search");
	int key  = sc.nextInt();
	int index = linear(arr,key);
	if (index==-1){
		System.out.println("not found");
	}
	else {
		System.out.println("found at"+" "+ index);
	}
	
}
}
