package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.ReadCartQuery;
import dbHelpers.ReadProductsQuery;
import model.Customer;

/**
 * Servlet implementation class ReadProductsServlet
 */
@WebServlet("/doReadCart")
public class ReadCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// create a readQuery helper
		ReadCartQuery rcq = new ReadCartQuery("wigglypiggly", "sperryman", "Sp224693!");
		Customer customer = (Customer) request.getAttribute("customer");
				
		// get html table
		rcq.doRead(customer);
		String table = rcq.getHTMLTable();
		
		// pass execution to products.jsp
		request.setAttribute("table", table);
		String url = "cart.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
