package com.strings.practice;

public class String011 {
public static void main(String[] args) {
	String str = "javadev";
	String result = "";
	for (int i=0;i<str.length();i++){
		char curr = str.charAt(i);
		int count = 0;
		for (int j =0;j<result.length();j++){
			if(curr==result.charAt(j)){
				count++;
				break;
			}
			}
		if (count==0){
			result+=curr;
		
		}
	}
	System.out.println(result);
}
}