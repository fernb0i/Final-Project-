package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;

public class LoginQuery {

	private Connection connection;
	private PreparedStatement ps;
	
	public LoginQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/"+dbName;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			ps = connection.prepareStatement("select * from customer where username=? and password=?");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Customer authenticateCustomer(String username, String password) {
		Customer customer = null;
		try {
			//add parameters to the prepared statement
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			//turn row into new customer
			if (rs.next()) {
				customer = new Customer(rs.getInt("customerID"),"b","c","d","e",rs.getString("username"),rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customer;
	}
}
