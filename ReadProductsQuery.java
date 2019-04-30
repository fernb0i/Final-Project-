package dbHelpers;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import model.Product;

public class ReadProductsQuery {
	
	private Connection connection;
	private ResultSet results;
	private PreparedStatement ps;
	
	public ReadProductsQuery(String dbName, String uname, String pwd) {
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
	
	public void doRead() {
		String query = "select * from product";
		
		try {
			ps = this.connection.prepareStatement(query);
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
		table += " Item Name ";
		table += "</th>";
		table += "<th>";
		table += " Price ";
		table += "</th>";
		table += "<th>";
		table += " Inventory ";
		table += "</th>";
		table += "</tr>";

		
		
		try {
			while(this.results.next()) {
				Product product = new Product();
				
				product.setProductID(this.results.getInt("productID"));
				product.setName(this.results.getString("name"));
				product.setPrice(this.results.getInt("price"));
				product.setInventory(this.results.getInt("inventory"));
				
				table +="<tr>";
				
				table +="<td>";
				table += product.getName();
				table +="</td>";
				table +="<td>";
				table += product.getPrice();
				table +="</td>";
				table +="<td>";
				table += product.getInventory();
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
