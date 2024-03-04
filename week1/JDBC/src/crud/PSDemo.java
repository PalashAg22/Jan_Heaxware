package crud;

import java.sql.*;
public class PSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBUtility.getDBConnection();
		String q = "Insert into dept values(?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(q);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
