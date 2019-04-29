package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import model.Products;

public class ProductsQuery {
	
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet results;
	
	public ProductsQuery(String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/"+dbName;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			ps = connection.prepareStatement("select * from products where productID=?");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//read all products from database
	public void doRead (Products products) {
		String query = "select * from products";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			this.results=ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//update products in database when they are added or removed from the cart
	public void doUpdate (Products products) {
		String query = "update products set quantity = quantity - cartProducts.quantity where cartProducts.productID=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
		
			ps.setInt(1, products.getProductID());
			ps.setInt(2, products.getProductQuantity());
			
			ps.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
