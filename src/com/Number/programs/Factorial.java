package com.Number.programs;

public class Factorial {

public static int factorial(int n){
	int fact=1;
	for (int i=1;i<=n;i++){
		fact = fact*i;
		
	}
	return fact;

}public static int sum (int a,int b ){
	return a+b;
}
public static int sum(int a,int b ,int c){
	return a+b+c;
}


public static void main(String[] args) {
	int a = 7;
int z=10;
int xa=10;
	System.out.println(	factorial(a)+ " "+ sum(a,z)+" "+sum(a,z,xa));
}
}
