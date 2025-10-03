package com.Number.programs;

public class BinaryToDecimal {

public static void BintoDec(int n){
	int dec = 0;
	int pow=0;
	
	while(n>0){
		int ld = n%10;
		dec = dec + ld * (int)Math.pow(2,pow);
		pow++;
		n= n/10;
	}
	System.out.println(dec);
}




public static void main(String[] args) {
BintoDec(101);
}
}
