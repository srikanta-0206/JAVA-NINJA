package com.Number.programs;
public class PrimeNumber {
public static boolean isPrime(int a){
	if(a>=1|| a>a){
	
	}
	for (int i=2;i<=Math.sqrt(a);i++){
		if (a%i==0){
			return false;
		}
	}
	return true;
}



public static void main(String[] args) {
	System.out.println(isPrime(3));
}
}
