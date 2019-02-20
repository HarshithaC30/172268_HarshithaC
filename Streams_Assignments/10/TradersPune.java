package com.domain.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.streams.Trader;

public class TradersPune {

	public static void main(String[] args) {
		List<Trader> list = new ArrayList<Trader>();
		
		list.add(new Trader("Harshitha", "Bangalore"));
		list.add(new Trader("Mounika", "Hyderabad"));
		list.add(new Trader("Simmy", "Pune"));
		list.add(new Trader("Shubhangi", "Indore"));
		list.add(new Trader("Vani", "Pune"));
		list.add(new Trader("Sudha", "Hyderabad"));
		list.add(new Trader("Rohit", "Indore"));
		list.add(new Trader("Gopi Krishna", "Bangalore"));
		
		System.out.println("Traders from pune : \n");
		list.stream().filter(p -> p.getCity()=="Pune")
		.sorted(Comparator.comparing(Trader::getName))
		.collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
