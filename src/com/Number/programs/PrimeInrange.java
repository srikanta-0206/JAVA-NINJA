package com.Number.programs;

public class PrimeInrange {
public static void prime(int n){
	PrimeNumber p = new PrimeNumber();
	for (int i=2;i<=n;i++){
		if (p.isPrime(i)){
			System.out.println(i);
		}
	}

}
public static void main(String[] args) {
prime(10);
}
}
