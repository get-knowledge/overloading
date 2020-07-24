package com.gobeyond.java8;

//Can you create your own functional interface

 interface Printable{
	
	void print();
	default void printColor() {
		System.out.println("Printing Color copy");
	}
	 
}


public class FunctionalInterface {

	public static void main(String a[]) {
		
		FunctionalInterface f = new FunctionalInterface();
		f.printForm(()->{
			System.out.println(":::Impliment Functional Interface:::");
		});
		
	}
	
	public void printForm(Printable p) {
		
		p.print();
	}
	
}
