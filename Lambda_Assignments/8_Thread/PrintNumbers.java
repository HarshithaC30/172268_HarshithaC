package com.lambda.assign;

public class PrintNumbers {

	public static void main(String[] args) {
		 Runnable r= ()->{
         for(int i=0;i<11;i++) 
         {
       	  System.out.println(i);
         }
         };
         
         Thread t=new Thread(r); 
         t.start();
         	try {
         		Thread.sleep(5000);
         	} catch (InterruptedException e) {
         		System.out.println("interrupted exception in thread");
         	}
         	for(int i=11;i<20;i++) 
         	{
         		System.out.println(i);
         	}
	}

}
