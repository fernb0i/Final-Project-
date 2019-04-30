package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddToCartQuery;
import dbHelpers.RegisterQuery;
import model.Cart;
import model.Customer;
import model.Product;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name = "RegisterCustomerServlet", urlPatterns = { "/doAddToCart" })
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
		Customer customer = (Customer) request.getSession(false).getAttribute("customer");
		int productID = Integer.parseInt(request.getParameter("productID"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));

		
		//set up a product object
		Cart cart = new Cart(); 
		
		cart.setCustomer_customerID(customer.getCustomerID());
		cart.setProduct_productID(productID);
		cart.setQuantity(quantity);
		
		//set up a RegisterQuery object
		AddToCartQuery atcq = new AddToCartQuery("wigglypiggly", "sperryman", "Sp224693!");
		
		//pass the customer to addQuery to add to the database
		atcq.doAddToCart(cart);
		
		//
		
		String url = "doRead";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		

	}

}
