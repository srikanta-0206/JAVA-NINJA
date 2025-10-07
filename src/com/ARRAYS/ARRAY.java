package com.ARRAYS;

import java.util.Scanner;

public class ARRAY {
public static void main(String[] args) {
//	int marks[] = new int[70];
//	int numbers[] = {1,2,3,4,};
//	int sasa[] = {4,5,6};
//	String fruits[] = {"appel","mango"};
//	System.out.println(fruits);
	
	
//	int marks [] = new int [100];
//	Scanner sc = new Scanner(System.in);
//	marks[0] = sc.nextInt();
//	marks[1] = sc.nextInt();
//	marks[2] = sc.nextInt();
//
//	System.out.println(marks[0] );
//	System.out.println(marks[1]);
//	System.out.println(marks[2]);
//
//	marks[2] = marks[2]+30;
//	System.out.println(marks[2]);
//
//	System.out.println(marks.length);
	
	
	
	
	int marks[] = {10,20,30};
	update(marks);

}

public static void update(int marks[]){
	for (int i =0;i<marks.length;i++){
		marks[i]=marks[i]+1;
	}
	for (int i =0;i<marks.length;i++){
		System.out.println(marks[i]);
	}
}
}
