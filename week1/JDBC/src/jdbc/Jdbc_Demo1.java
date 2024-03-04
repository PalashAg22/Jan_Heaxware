package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db","root","Palash!123@");
		
			String query = "Insert into Employees (Eid,Ename,Salary,Comm,Job,DOJ,Mid)values(1001,'martin',30840,0,'SDE','2024-01-09',101)";
			
			
//			Statement stmt = conn.createStatement();
//			int count = stmt.executeUpdate(query);
//			System.out.println("rows affectedd "+count);
//			
//			
//			String upd = "update Employees set Comm =? where eid=?";
//			int comm = 5000;
//			int eid = 1001;
//			PreparedStatement ps = conn.prepareStatement(upd);
//			ps.setInt(1,comm);
//			ps.setInt(2, eid);
//			int count1 = ps.executeUpdate();
//			System.out.println(count1);
			
			String sel = "select eid,ename from employees where Mid=? and Job=?";
			String del = "delete from dep where dno=?";
			PreparedStatement ps = conn.prepareStatement(del);
			ps.setInt(1, 70);
			//ps.setString(2, "Manager");
			ResultSet rs = ps.executeQuery(del);
			while(rs.next()) {
				System.out.println(rs.getInt("dno") +" "+ rs.getString("Dname")+" "+rs.getShort("Location"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
