package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Dept;
import presentation.Client;

public class IDeptImp implements IDept{

	static Connection conn=null;
	
	public IDeptImp() {
		conn = DBUtility.getDBConnection();
	}
	@Override
	public int insert(Dept dep) {
		// TODO Auto-generated method stub
		String insert = "insert into user values(?,?,?,?,?,?,?,?)";
		int count=0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, dep.getName());
			pstmt.setString(2, dep.getUsername());
			pstmt.setString(3, dep.getPassword());
			pstmt.setString(4, dep.getAddress());
			pstmt.setString(5, dep.getState());
			pstmt.setString(6, dep.getCountry());
			pstmt.setString(7,dep.getEmail());
			pstmt.setString(8, dep.getRole());
			count = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int update(Dept dep) {
		// TODO Auto-generated method stub
		String query = "update fsd set name=?, role=? where username=?";
		int count=0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dep.getName());
			pstmt.setString(2, dep.getRole());
			pstmt.setString(3, dep.getUsername());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return count;
	}

	@Override
	public int deleteOne(String username,String password) {
		// TODO Auto-generated method stub
		String del = "delete from user where username=username and password=password";
		int count=0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(del);
			count = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public Dept selectOne(String uname) {
		// TODO Auto-generated method stub
		String sOne = "select name,username,password,address,state,country,email,role from user where username=?";
		
		Dept dep=null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sOne);
			pstmt.setString(1, uname);
			ResultSet rs1 = pstmt.executeQuery();
			rs1.next();
			dep = new Dept(rs1.getString("name"),rs1.getString("username"),"*****",
					rs1.getString("address"),rs1.getString("state"),rs1.getString("country")
					,rs1.getString("email"),rs1.getString("role"));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dep;
	}

	@Override
	public List<Dept> selectAll() {
		// TODO Auto-generated method stub
		List<Dept> list = new ArrayList<Dept>();
		String sAll = "select * from user";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sAll);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Dept(rs.getString("name"),rs.getString("username"),"*****",
					rs.getString("address"),rs.getString("state"),rs.getString("country")
					,rs.getString("email"),rs.getString("role")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
