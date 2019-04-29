package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.RegisterQuery;
import model.Customer;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name = "RegisterCustomerServlet", urlPatterns = { "/doRegister" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String fName = request.getParameter("fName");
		String lName= request.getParameter("lName");
		String phoneNum= request.getParameter("phoneNum");
		String email= request.getParameter("email");
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		//set up a customer object
		Customer customer = new Customer();
		customer.setfName(fName);
		customer.setlName(lName);
		customer.setPhoneNum(phoneNum);
		customer.setEmail(email);
		customer.setUsername(username);
		customer.setPassword(password);
		
		//set up a RegisterQuery object
		RegisterQuery rq = new RegisterQuery("wigglypiggly", "sperryman", "Sp224693!");
		
		//pass the customer to addQuery to add to the database
		rq.doRegister(customer);
		
		//
		
		String url = "/registered.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		

	}

}
