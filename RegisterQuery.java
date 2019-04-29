package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Customer;

public class RegisterQuery {

	public Connection connection; 
	
	
	public RegisterQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/"+dbName;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doRegister(Customer customer) {
		String query = "insert into customer (fName, lName, phoneNum, email, username, password) values (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, customer.getfName());
			ps.setString(2, customer.getlName());
			ps.setString(3, customer.getPhoneNum());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getUsername());
			ps.setString(6, customer.getPassword());
			
			ps.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
