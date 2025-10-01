package com.strings.practice;

//12) WAJP to Print Unique Characters
//Logic: Count frequency, print only those with count=1.
//Example:
//Input: "JAVADEV"
//Output: "JVDE"
//
//		      ---
public class String012 {
public static void main(String[] args) {
	String s = "JAVADEV";
	String res = "";
	for (int i=0;i<s.length();i++){
		char current = s.charAt(i);
		int count=0;
		for (int j=0;j<s.length();j++){
			 if(current==s.charAt(j)&& i!=j){
				 count++;
			}
		}
		if (count==0){
			res+=current;
		}
	}
	System.out.println(res);
}
}
