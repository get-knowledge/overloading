package com.gobeyond.logical.question;

public class ReaptingChar {
	
	
	public static void main (String a[]) {
		
		
		String str= "Helloworld";
		
		int NO_OF_CHAR = 256;
		
		char[]  charStr = str.toCharArray();
		
		boolean foundChar = false;
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=0; j<str.length(); j++) {
				
				if (charStr[i] == charStr[j]) {
					
					foundChar = true;
					count ++;
					
				}else {
					
					System.out.print(":::Non Reapting Char is Found ::"+charStr[i]);
				}
				
				
			}
			
		}
		
	}
	
	
	
	

}
