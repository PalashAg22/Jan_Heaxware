package test_nor_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test_nor_jdbc.entity.Company;
import test_nor_jdbc.entity.product;

public class IDaoImpl implements IDao{

	private static Connection connection;
	
	public IDaoImpl () {
		connection = DBUtil.getDBConnection();
	}
	@Override
	public void addCompany(Company company) {
		// TODO Auto-generated method stub
		String query = "insert into company values(?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1,company.getCompany_name());
			ps.setString(2,company.getCompany_product());
			ps.setInt(3, company.getCompany_pid());
			int count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addProduct(product product) {
		// TODO Auto-generated method stub
		String uery = "insert into product values(?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(uery);
			ps.setString(1, product.getProduct_name());
			ps.setInt(2, product.getPrice());
			ps.setInt(3, product.getCompany_pid());
			int count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		String query = "select * from company";
		List<Company> comp = new ArrayList<Company>();
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Company company = new Company(rs.getString(1),rs.getString(2),rs.getInt(3));
				comp.add(company);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return comp;
	}

	@Override
	public List<product> getAllProduct() {
		String query = "select * from product";
		List<product> product = new ArrayList<product>();
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				product prod = new product(rs.getString(1),rs.getInt(2),rs.getInt(3));
				product.add(prod);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product;
	}

	@Override
	public product getProductById(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

}
