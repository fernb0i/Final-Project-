package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.LoginQuery;
import model.Customer;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/doLogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private HttpSession session;
	private String url;
	private int loginAttempts;
	private String errorMessage = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		//get current session
		session = request.getSession();
		
		//get number of logins
		if(session.getAttribute("loginAttempts") == null) {
			loginAttempts = 0;
		}
		
		//exceeded logins
		if(loginAttempts > 2) {
			String errorMessage = "Error: Number of Login Attempts Exceeded";
			request.setAttribute("errorMessage", errorMessage);
			url = "index.jsp";
		}else {
			//pull fields from form
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			//call loginquery helper
			LoginQuery lq = new LoginQuery("wigglypiggly", "sperryman", "Sp224693!");
			Customer customer = lq.authenticateCustomer(username, password);
			
			//usermatch
			if(customer != null) {
				//invalidate current session, then get new session
				session.invalidate();
				session = request.getSession(true);
				session.setAttribute("customer", customer);
				request.setAttribute("Customer", customer);
				url = "doRead";
			} else {
				errorMessage = "Error: Unrecognized Username or Password<br>Login attempts remaining: "+(3-(loginAttempts));
				request.setAttribute("errorMessage", errorMessage);
				session.setAttribute("loginAttempts", loginAttempts++);
				url="login.jsp";
			}
		}
		//forward requests
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request,response);
		
	}

}
