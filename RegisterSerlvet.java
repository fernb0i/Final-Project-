package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;

/**
 * Servlet implementation class RegisterSerlvet
 */
@WebServlet({ "/RegisterSerlvet", "/doRegister" })
public class RegisterSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterSerlvet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//get inputs 
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int phoneNumber = Integer.parseInt(request.getParameter("phoneNum"));
		String emailAddress = request.getParameter("email");
		
		//create new Customer object
		Customer newCust = new Customer();
		
		//set values to request object
		request.setAttribute("newCust", newCust);
	
		//send control to next component
		RequestDispatcher rd = request.getRequestDispatcher("/products.jsp");
		rd.forward(request,response);
	}
}