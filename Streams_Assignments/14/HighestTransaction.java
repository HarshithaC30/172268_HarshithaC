package com.domain.streams;

import java.util.ArrayList;

import com.capgemini.streams.Trader;
import com.capgemini.streams.Transaction;

public class HighestTransaction {

	public static void main(String[] args) {
		Trader t1=new Trader("Vani","Delhi");
        Trader t2=new Trader("Shubhangi","Indore");
        Trader t3=new Trader("revanth","guntur");
        Trader t4=new Trader("gopi","new york");
        Trader t5=new Trader("Harshitha","Bangalore");
        Trader t6=new Trader("Simmy","Delhi");
        
        Transaction tr1=new Transaction(t1,2011,100000);
		Transaction tr2=new Transaction(t2,2002,100000);
		Transaction tr3=new Transaction(t3,2011,300000);
		Transaction tr4=new Transaction(t4,2009,50000);
		Transaction tr5=new Transaction(t5,2009,75000);
		Transaction tr6=new Transaction(t6,2011,30000);
		
		ArrayList<Transaction> list=new ArrayList<Transaction>();
		list.add(tr1);
		list.add(tr2);
		list.add(tr3);
		list.add(tr4);
		list.add(tr5);
		list.add(tr6);
		
		Integer maxValue = list.stream()
				.max((x,y) -> x.getValue().compareTo(y.getValue()))
				.map(Transaction::getValue).get();
		System.out.println(maxValue);
	}

}
