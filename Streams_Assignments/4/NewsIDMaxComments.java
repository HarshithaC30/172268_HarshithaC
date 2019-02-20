package com.domain.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.capgemini.streams.News;

public class NewsIDMaxComments {

	public static void main(String[] args) {
			
			List<News> list=new ArrayList<>();
			list.add(new News(1,"poo","The budget is very tight","Yeah True"));
			list.add(new News(1,"poo","The budget is very tight","Yeah True"));
			list.add(new News(1,"poo","The budget is very tight","Yeah True"));
			list.add(new News(2,"sonu","No budget for trip sorry","Thats ok"));
			list.add(new News(3,"acchu","KGF was having high budget"," yeah high budget in sandel hood"));
			list.add(new News(3,"dimple","budget for year ","The budget is 23LAKH CRORES"));
			list.add(new News(2,"sonchi","sports budget","for ipl India invests alot of budget "));
			list.add(new News(1,"ammu","budget for thiti movie","Thiti movie was having very less budget"));
	Map<Integer, List<News>> newsId1 = list.stream() .collect(Collectors.groupingBy(News::getNewsID)); 
			
	        
	       
		
			Map<Object,Long> map=list.stream().collect(Collectors.groupingBy(News::getNewsID,Collectors.counting()));
	     
	        long maxval=(Collections.max(map.values()));
	        for(Entry<Object, Long> entry:map.entrySet())
	        {
	        	if(entry.getValue()==maxval)
	        	{
	        		System.out.println(entry.getKey());
	        	}
	        }
	}

}
