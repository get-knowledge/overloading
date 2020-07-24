package com.gobeyond.java8;

public class LambdaExpression {

	public static void main(String a[]) {

		// without using lambda Expression
		new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("::Call the run method using lambdaExp ::");

			}
		}).start();

		// using lambda Expression
		new Thread(() -> {
			System.out.println("::Call the run method using lambdaExp ::");
		}).start();

	}

}
