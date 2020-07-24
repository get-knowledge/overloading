package com.gobeyond.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfMap {

	public static void main(String a[]) {

		List<String> lstStr = new ArrayList<String>();

		lstStr.add("a");
		lstStr.add("b");
		lstStr.add("c");
		lstStr.add("d");
		lstStr.add("e");
		
		//In Java 8, stream().map() lets you convert an object to something else

		List<String> upperStr = lstStr.stream().map(String::toUpperCase).collect(Collectors.toList());

		 System.out.println(upperStr); //[A, B, C, D, E]
		
	}

}
