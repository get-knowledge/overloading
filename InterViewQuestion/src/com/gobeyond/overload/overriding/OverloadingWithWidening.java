package com.gobeyond.overload.overriding;

public class OverloadingWithWidening {
	
	//byte --> char --> short --> int --> long --> float --> double
	
	public void calculateArea(short num) {

		System.out.println(" Area Calculated  "+num);

	}


	public void calculateArea(String num) {

		System.out.println(" Area Calculated "+num);

	}

	
	public static void main(String a[]) {
		
		OverloadingWithWidening overload = new OverloadingWithWidening();
		
		overload.calculateArea(10);  //The method calculateArea(short) in the type OverloadingWithWidening is not applicable for the arguments (int)
		
		overload.calculateArea("::DONE::");
		
	}
}
