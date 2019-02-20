package com.domain.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.streams.News;

public class Budget {

	public static void main(String[] args) {
		List<News> list=new ArrayList<>();
		list.add(new News(1,"Gopi","The budget is very tight","Yeah True"));
		list.add(new News(2,"Mouni","No budget for trip sorry","Thats ok"));
		list.add(new News(3,"Shubha","KGF was having high budget"," yeah high budget in sandel hood"));
		list.add(new News(3,"Vani","budget for year ","The budget is 23LAKH CRORES"));
		list.add(new News(2,"Sudha","sports budget","for ipl India invests alot of budget "));
		list.add(new News(1,"Harsh","budget for thiti movie","Thiti movie was having very less budget"));
	List<News> list1=list.stream().filter(n->n.getComment().contains("budget")).collect(Collectors.toList());
	long l=list1.stream().count();
	System.out.println("The word budget in comments are "+l + " times");
	}

}
