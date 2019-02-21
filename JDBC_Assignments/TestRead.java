package com.jdbc.examples;

public class TestRead {

	public static void main(String[] args) {
		try {
			System.out.println(new EmployeeDAO().read(1005));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
