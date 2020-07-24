package com.gobeyond.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClassEx {

	public static void main(String a[]) {

		List<String> lstStr = new ArrayList<String>();

		lstStr.add("Rajeev");
		lstStr.add("Dhananjay");
		lstStr.add("Suraj");
		lstStr.add("Mukseh");
		lstStr.add("Lali");
		lstStr.add("Sajan");

		long countStr = lstStr.stream().filter(str -> str.length() < 6).count();

		System.out.println(":::::" + countStr);

		Stream.iterate(1, count -> count + 1)

				.filter(number -> number % 3 == 0).limit(6).forEach(System.out::println);

		// Multiple conditions in stream

		List<String> stStr1 = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

		stStr1.stream().filter(str -> str.length() < 6 && str.length() < 8).count();

		List<String> name = stStr1.stream().filter(str -> str.length() < 6 && str.length() < 8)
				.collect(Collectors.toList());
		
		System.out.println(":::::::::::"+name);

	}

}
