package com.strings.practice;
//7) WAJP to Convert Uppercase to Lowercase
//Logic: Use toLowerCase() function.
//Example:
//Input: "HELLO"
//Output: "hello"

//        ---
public class String007 {
    public static void main(String[] args) {
	    String sstr = "hello";
	    String s = "";
	   for (int i=0;i<sstr.length();i++){
		   char a = sstr.charAt(i);
		   if (a>='a'&&a<='z'){
			   s+=(char)(a-32);
		   }
		 
			  
	   }
	    System.out.println(s);
    }
}


