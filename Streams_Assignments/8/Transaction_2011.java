package com.domain.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.streams.Trader;
import com.capgemini.streams.Transaction;

public class Transaction_2011 {

	public static void main(String[] args) {
		
		List<Transaction>list = new ArrayList<>();
		list.add(new Transaction(new Trader("Harshitha","karnataka"),2011,3800));
		list.add(new Transaction(new Trader("Simmy","pune"),2011,3000));
		list.add(new Transaction(new Trader("Shubhangi","Delhi"),2014,2500));
		list.add(new Transaction(new Trader("pooja","Pune"),2011,4000));
		list.add(new Transaction(new Trader("Mounika","Kolkata"),2013,1900));
		
		List<Trader> list2 =list.stream()
				.filter(t->t.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.map(Transaction::getTrader)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);	
	}

}
