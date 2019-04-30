/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cart;

/**
 * @author Admin
 *
 */
public class RemoveFromCartQuery {
	
	private Connection connection;
	
	public RemoveFromCartQuery(String dbName, String uname, String pwd) {
		
		String url = "jdbc:mysql://localhost:3306/"+dbName;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doRemoveFromCart(Cart cart) {
		// set up a String to hold query
		
		String subtractQuery = "delete from cart where product_productID = ? and customer_customerID = ?";
		String addQuery = "update product set inventory= inventory + ? where productID= ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(subtractQuery);
			
			
			ps.setInt(1, cart.getProduct_productID());
			ps.setInt(2, cart.getCustomer_customerID());
			
			ps.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PreparedStatement ps1 = connection.prepareStatement(addQuery);
			
			ps1.setInt(1, cart.getQuantity());
			ps1.setInt(2, cart.getProduct_productID());
			
			ps1.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}

}
}
