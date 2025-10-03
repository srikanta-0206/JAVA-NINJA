package com.Number.programs;

public class Factorial {

public static int factorial(int n){
	int fact=1;
	for (int i=1;i<=n;i++){
		fact = fact*i;
		
	}
	return fact;

}


public static void main(String[] args) {
	int a = 7;

	System.out.println(	factorial(a));
}
}
