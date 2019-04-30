package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.RemoveFromCartQuery;
import model.Cart;
import model.Customer;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet(description = "Deletes a record for a particular SKU", urlPatterns = { "/doRemoveFromCart" })
public class RemoveFromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveFromCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customer customer = (Customer) request.getSession(false).getAttribute("customer");
		int productID = Integer.parseInt(request.getParameter("productID"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
	
		Cart cart = new Cart(); 
		
		cart.setCustomer_customerID(customer.getCustomerID());
		cart.setProduct_productID(productID);
		cart.setQuantity(quantity);
		
		//create Query object
		RemoveFromCartQuery rfcq = new RemoveFromCartQuery("wigglypiggly", "sperryman", "Sp224693!");
		
		//use Query to delete record
		rfcq.doRemoveFromCart(cart);
		
		//pass execution to 
		String url = "/doReadCart";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
