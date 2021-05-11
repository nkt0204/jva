package demoMVC.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demoMVC.ConnectDB.ConnectPostDB;
import demoMVC.Entity.Product;

public class Demo {
	public List<Product> GetAllUsers() {
		List<Product> listUsers = new ArrayList<Product>();
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM public.product";
		try {
			conn = ConnectPostDB.getConnectionSqlServer();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Product user = new Product();
				user.setIdP(rs.getInt("product_id"));
				listUsers.add(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stm.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listUsers;
	}
	
	public static void main(String[] args) {
		Demo a = new Demo();
		 List<Product> al = new ArrayList<Product>();
		 al = a.GetAllUsers();
		 for (Product product : al) {
			System.out.println(product.getIdP());
		}
	}
}
