package com.gobeyond.java8;

interface MyInterface {

	void display();
}

public class MethodReference {

	public void myDisplay() {
		System.out.println(":::: Implement display() :::");
	}

	public static void main(String a[]) {

		MethodReference mr = new MethodReference();

		MyInterface mi = mr::myDisplay;

		mi.display();

	}
}
