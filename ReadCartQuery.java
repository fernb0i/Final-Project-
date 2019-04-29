package dbHelpers;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cart;
import model.Customer;
import model.Product;

public class ReadCartQuery {
	
	private Connection connection;
	private ResultSet results;
	private PreparedStatement ps;
	
	public ReadCartQuery(String dbName, String uname, String pwd) {
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
	
	public void doRead(Customer customer) {
		String query = "select name, price, quantity from cart join product on product.productID = cart.product_productID where customer_customerID = ?";
		
		try {
			ps = this.connection.prepareStatement(query);
			ps.setInt(1, customer.getCustomerID());
			
			this.results= ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getHTMLTable() {
		String table = "";
		table += "<table border=1>";
		table += "<tr>";
		table += "<th>";
		table += " Name ";
		table += "</th>";
		table += "<th>";
		table += " Price ";
		table += "</th>";
		table += "<th>";
		table += " Quantity ";
		table += "</th>";
		table += "</tr>";

		
		
		try {
			while(this.results.next()) {
				Cart cart = new Cart();
				
				
				
				
				table +="<tr>";
				table +="<td>";
				table += results.getString("name");
				table +="</td>";
				table +="<td>";
				table += results.getInt("price");
				table +="</td>";
				table +="<td>";
				table += results.getInt("quantity");
				table +="</td>";

				table +="</tr>";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}

}
