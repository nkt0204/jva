package demoMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demoMVC.Entity.Product;

@Repository
public class HomeDao {
	
	@Autowired
    JdbcTemplate jdbcTemplate;

	public List<Product> findAll() {
        List<Product> persons = jdbcTemplate.query("SELECT * FROM trn_person", new BeanPropertyRowMapper(Product.class));
        return persons;
    }
	
	public static void main(String[] args) {
		HomeDao a = new HomeDao();
		List<Product> lista = new ArrayList<Product>();
		
		lista = a.findAll();
		
		
	}
}
