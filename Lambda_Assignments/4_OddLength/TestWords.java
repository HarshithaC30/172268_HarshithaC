package com.lambda.assign;

import java.util.*;

public class TestWords {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("i");
		l.add("we");
		l.add("one");
		l.add("four");
		
		l.removeIf(e -> (e.length()%2!=0));
		//l.forEach(System.out::println);
		l.forEach(i -> System.out.println(i));
	}
}
