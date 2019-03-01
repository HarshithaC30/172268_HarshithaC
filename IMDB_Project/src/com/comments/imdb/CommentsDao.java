package com.comments.imdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.proj.imdb.ConnectionFactory;

public class CommentsDao {
	
	public String  insert(Comments comnts) throws SQLException
	{
		//System.out.println(comnts);
		System.out.println("inside insert");
		String qryc = "insert into comments values(?) ";
		Connection con = ConnectionFactory.getConnection();
		System.out.println(con);
		PreparedStatement pstmt = con.prepareStatement(qryc);
		pstmt.setString(2, comnts.getUsercomments());
		pstmt.setString(1, comnts.getName());
		pstmt.executeUpdate();
		return "successfully inserted";
		
	}
	
/*public static void main(String[] args) throws SQLException {
		System.out.println(new CommentsDao().insert(new Comments("excellent", "vidhya")));
	}*/

}
