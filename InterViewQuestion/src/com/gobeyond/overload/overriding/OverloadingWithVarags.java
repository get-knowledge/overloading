package com.gobeyond.overload.overriding;

public class OverloadingWithVarags {
	
	public void calculateArea(int ...i) {

		for(int x:i)
		System.out.println(" Area Calculated  "+x);

	}


	public void calculateArea(int j, int ...i) {

		for(int x:i)
		System.out.println(" Area Calculated "+x);
		
		System.out.println(" Area Calculated "+j);

	}

	
	public static void main(String a[]) {
		
		OverloadingWithVarags overload = new OverloadingWithVarags();
		
		overload.calculateArea(10);  //The method calculateArea(int[]) is ambiguous for the type OverloadingWithVarags
		overload.calculateArea(10);  //The method calculateArea(int[]) is ambiguous for the type OverloadingWithVarags
		
		
	}

}
