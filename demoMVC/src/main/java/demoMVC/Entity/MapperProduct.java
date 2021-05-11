//package demoMVC.Entity;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.springframework.jdbc.core.RowMapper;
//
//public class MapperProduct implements RowMapper<Product>{
//
//	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Product product = new Product();
//		product.setIdP(rs.getInt("product_id"));
//		product.setNameP(rs.getString("name_product"));
//		product.setDiscriptionP(rs.getString("discription_product"));
//		// TODO Auto-generated method stub
//		return product;
//	}
//}
