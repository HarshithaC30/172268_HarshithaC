package com.lambda.assign;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class AppendStrings {

	public static void main(String[] args) {
			Map<String,String> map=new HashMap<String,String>();
			map.put("Harshitha","Bangalore");
			map.put("Simmy","Orrisa");
			map.put("Shubhangi","Indore");
			map.put("Mounika","Hyderabad");
			
			StringBuilder stringbuilder =new StringBuilder();
			Set<Map.Entry<String, String>> set=map.entrySet();
		
			for(Map.Entry<String,String> string:set) {
				stringbuilder=stringbuilder.append(string.getKey()+""+string.getValue()+"\n");
			}
			
			System.out.println(stringbuilder);
			
	}

}
