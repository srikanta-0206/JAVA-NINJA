package com.Number.programs;

public class PrimeNumber {
public static boolean isPrime(int a){
boolean isPrime = true;
	for (int i=2;i<=a-1;i++){
		if (a%i==0){
			isPrime = false;
		}
	}
	return isPrime;
}



public static void main(String[] args) {
	System.out.println(isPrime(10));
}
}
