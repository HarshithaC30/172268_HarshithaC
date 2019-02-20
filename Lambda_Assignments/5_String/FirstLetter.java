package com.lambda.assign;

import java.util.ArrayList;

public class FirstLetter {

	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList();
		word.add("Harshitha");
		word.add("Mounika");
		word.add("Simmy");
		word.add("Shubhangi");
		System.out.println("List : ");
		word.forEach(System.out::println);
		String list = word.stream().map(Apple ->
		Character.toString(Apple.charAt(0))).reduce(" ",(a,b) -> a+b);
		System.out.println(list);
		
	}

}
