package com.lambda.assign;

public class Test {

	public static void main(String[] args) {
		 FuncInter1 add = (int x, int y) -> x + y; 
		 FuncInter1 sub = (int x, int y) -> x - y; 
		 FuncInter1 mul = (int x, int y) -> x * y; 
		 FuncInter1 div = (int x, int y) -> x / y; 
		
		  System.out.println("Addition is " + add.operation(6, 3));
		  System.out.println("Subtraction is " + sub.operation(5, 3));
		  System.out.println("Multiplication is " + mul.operation(10, 4));
		  System.out.println("Division is " + div.operation(25, 5));
		 

	}


}
