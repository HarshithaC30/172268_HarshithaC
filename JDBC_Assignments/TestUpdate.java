package com.jdbc.examples;

public class TestUpdate {

	public static void main(String[] args) {
		try {
			System.out.println(new EmployeeDAO().update(1005,"John")+" row update successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
