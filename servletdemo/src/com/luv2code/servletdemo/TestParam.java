package com.luv2code.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParam
 */
@WebServlet("/TestParam")
public class TestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  //set content type
		response.setContentType("text/html");
		//get printwriter
		PrintWriter out= response.getWriter();
		//read configuration param
		ServletContext context=getServletContext();
		String maxCartSize =  context.getInitParameter("max-shopping-car");
		String teamName=context.getInitParameter("project-team-name");
		//generate html 
		out.println("<html><body>");
		out.println("Maxcar:"+maxCartSize);
		out.println("<br/><br/>");
		out.println("Teamname:"+teamName);
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
