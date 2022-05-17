package servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import crud.Lab2CrudInterface;
import danimals.danimals;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1/*")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletConfigInterface servletConfig;
	Lab2CrudInterface lab2Crud;
	
	public servlet1() {
		super();
		this.servletConfig = new ServletConfig();
		this.lab2Crud = servletConfig.getCrud();
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("["+lab2Crud.readDanimals()+"]");
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		int age = Integer.parseInt(request.getParameter("age"));
		float height = Float.parseFloat(request.getParameter("height"));
		float length = Float.parseFloat(request.getParameter("length"));
		lab2Crud.updateDanimals(new danimals(title,age,height,length));
	}
}
