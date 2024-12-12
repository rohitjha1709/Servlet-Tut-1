package servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet{
	
	private ServletConfig servletconfig;
	
//Lifecycle Methods
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.servletconfig=arg0;
		System.out.println("Initializing Servlet");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		System.out.println("Service Request");
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Destroying Servlet");
	}
	
// Non Lifecycle Methods
	@Override
	public ServletConfig getServletConfig() {
			return this.servletconfig;
	}

	@Override
	public String getServletInfo() {
	
		return "This servlet is created by Rohit Jha";
	}

}
