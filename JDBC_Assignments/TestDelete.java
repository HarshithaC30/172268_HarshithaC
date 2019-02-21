package com.jdbc.examples;

public class TestDelete {

	public static void main(String[] args) {
		try {
			System.out.println(new EmployeeDAO().delete(1005)+" row deleted successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
