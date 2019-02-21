package com.jdbc.examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO {
	public int insert(Employee emp) throws Exception {
		String query="insert into emp values(?,?,?,?,?,?,?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, emp.getEmpNo());
		pStatement.setString(2, emp.getEname());
		pStatement.setString(3, emp.getJob());
		pStatement.setInt(4, emp.getMgr());
		pStatement.setDate(5, emp.getHireDate());
		pStatement.setDouble(6, emp.getSal());
		pStatement.setDouble(7, emp.getCommission());
		pStatement.setInt(8, emp.getDeptNo());
		int output=pStatement.executeUpdate();
		return output;
		
	}
	
	public Employee read(int empNo) throws Exception {
		String query="select * from emp where empNo= ?";
		Employee emp=null;
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
			emp=new Employee();
			emp.setEname(resultSet.getString("ename"));
			emp.setEmpNo(resultSet.getInt("empno"));
			emp.setJob(resultSet.getString("job"));
			emp.setHireDate(resultSet.getDate("hiredate"));
			emp.setDeptNo(resultSet.getInt("deptno"));
			emp.setMgr(resultSet.getInt("mgr"));
			emp.setSal(resultSet.getInt("sal"));
			emp.setCommission(resultSet.getInt("comm"));
			
		}
		return emp;
	}
	
	public int delete(int empNo)throws Exception {
		Connection conn=ConnectionFactory.getConnection();
		String sql="delete from emp  where empno=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,empNo);
		int x=ps.executeUpdate();
		return x;
		
		
		
	}
	
	public int update(int empNo,String empName)throws Exception {
		Connection conn=ConnectionFactory.getConnection();
		String sql="update emp set ename=? where empno=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,empName);
		ps.setInt(2,empNo);
		int x=ps.executeUpdate();
		return x;
		
	}
}
