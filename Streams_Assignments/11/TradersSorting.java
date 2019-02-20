package com.domain.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.capgemini.streams.Trader;

public class TradersSorting {

	public static void main(String[] args) {
		List<Trader> list = new ArrayList<Trader>();
		
		list.add(new Trader("Harshitha", "Bangalore"));
		list.add(new Trader("Mounika", "Hyderabad"));
		list.add(new Trader("Simmy", "Orissa"));
		list.add(new Trader("Shubhangi", "Indore"));
		list.add(new Trader("Vani", "Guntur"));
		list.add(new Trader("Sudha", "Hyderabad"));
		list.add(new Trader("Rohit", "Indore"));
		list.add(new Trader("Gopi Krishna", "Bangalore"));
		
		System.out.println("String of all Traders names sorted alphabetically");
		Stream<String> list11 = list.stream().sorted(Comparator.comparing(Trader::getName)).map(Trader::getName);
		list11.forEach(System.out::println);
	}

}
