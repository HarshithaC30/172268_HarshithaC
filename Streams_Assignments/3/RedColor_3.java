package com.domain.streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import com.capgemini.streams.Fruit;

public class RedColor_3 {

	public static void main(String[] args) {
		
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("Staberries", 53,100,"Pink") );
		list.add(new Fruit("Apple", 105,150,"Red") );
		list.add(new Fruit("Grapes", 62,60,"Black") );
		list.add(new Fruit("Apricots", 101,100,"Brown") );
		list.add(new Fruit("Peaches", 60,120,"Peach") );
		list.add(new Fruit("Blackberries", 100,50,"Black") );
		
		List<String> list3=list.stream()
	    		.filter(p->p.getColor()=="Red")
	    		.sorted(Comparator.comparing(Fruit::getPrice))
	    		.map(Fruit::getName)
	    		.collect(Collectors.toList());
	    list3.forEach(System.out::println);

	}

}
