package com.lambda.assign;

import java.util.ArrayList;
import java.util.List;

public class UpperCase {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Harshitha");
		l.add("Mounika");
		l.add("Simmy");
		l.add("Shubhangi");
		
		l.replaceAll(e -> e.toUpperCase());
		l.forEach(System.out::println);
	}

}
