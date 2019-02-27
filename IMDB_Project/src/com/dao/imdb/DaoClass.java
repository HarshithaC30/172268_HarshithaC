package com.dao.imdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.proj.imdb.ConnectionFactory;

public class DaoClass {
	
	public  boolean register(String Name,String Email,String Phone,String Password,String Gender) throws SQLException {

		System.out.println(Name + Email + Phone);
		Connection con = ConnectionFactory.getConnection();
		System.out.println(con);
		String qry = "insert into Newusers(Name ,Email, Phonenumber, Password, Gender) values(?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(qry);
		pstmt.setString(1, Name);
		pstmt.setString(2, Email);
		pstmt.setString(3, Phone);
		pstmt.setString(4, Password);
		pstmt.setString(5, Gender);
		
		pstmt.executeUpdate();
		return true;
	}
	
	public boolean validate(String UIName,String UIPassword) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		System.out.println(con);
		String qry1="select name,password from Newusers";
		
		
		
			PreparedStatement pstmt = con.prepareStatement(qry1);
//			pstmt.setString(1, Name);
//			pstmt.setString(2, Password);
			ResultSet result = pstmt.executeQuery(qry1);
			System.out.println(result);
			while(result.next())
			{
				String name = result.getString("name");
				String password = result.getString("password");
				System.out.println(name+" db "+password);
				if(UIName.equals(name) && UIPassword.equals(password))
				{
					return true;
				}
				
			}	
	
		return false;
		
		
		}

	
	/*
	 * public static void main(String[] args) throws SQLException {
	 * //ystem.out.println(new DaoClass().register("vidhya", "cvs@gmail.com",
	 * "1234567", "abc", "F")); System.out.println(new DaoClass().validate("vidhya",
	 * "abc")); }
	 */

}
