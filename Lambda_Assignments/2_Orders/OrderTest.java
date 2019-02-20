package com.lambda.assign;

public class OrderTest {

	public static void main(String[] args) {
		OrderInterface o = (amt) ->  {
			if(amt>10000)
				System.out.println("Accepted");
			else
				System.out.println("Completed");
		};
		o.orders(1500);
	}

}
