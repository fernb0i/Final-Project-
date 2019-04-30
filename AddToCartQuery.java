package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cart;
import model.Customer;

public class AddToCartQuery {

	public Connection connection; 
	
	
	public AddToCartQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/"+dbName;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doAddToCart(Cart cart) {
		String addQuery = "insert into cart (customer_customerID, product_productID, quantity) values (?, ?, ?)";
		String subtractQuery = "update product set inventory= inventory - ? where productID=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(addQuery);
			
			ps.setInt(1, cart.getCustomer_customerID());
			ps.setInt(2, cart.getProduct_productID());
			ps.setInt(3, cart.getQuantity());
			
			ps.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PreparedStatement ps1 = connection.prepareStatement(subtractQuery);
			
			ps1.setInt(1, cart.getQuantity());
			ps1.setInt(2, cart.getProduct_productID());
			
			ps1.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
