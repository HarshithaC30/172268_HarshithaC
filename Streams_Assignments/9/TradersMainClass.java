package com.domain.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.capgemini.streams.Trader;

public class TradersMainClass {

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
		
		System.out.println("Unique Cities : \n");
		Stream<String> list1 = list.stream().map(Trader::getCity).distinct();
		list1.forEach(System.out::println);
		
	}

}
