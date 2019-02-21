package com.jdbc.examples;

import java.util.Calendar;

public class TestInsert {
	public static void main(String[] args) {
		try {
			System.out.println(new EmployeeDAO().insert(new Employee(1005, "Sachin", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
