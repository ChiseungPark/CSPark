package com.ibm.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LibertyTest
 */

@WebServlet("/LibertyTest")
public class LibertyTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibertyTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		Integer count;
		String srvPath = "";
		String sessionID = "";
		String requestURI = "";
		HttpSession session = request.getSession();
		srvPath = request.getServletPath();
		sessionID = request.getRequestedSessionId();
		requestURI = request.getRequestURI();
		Object o = session.getAttribute("COUNT");

		if (o!=null){
			count = (Integer) o;
			count = count+1;
		}
		else{
			count =1;
		}
		session.setAttribute("COUNT", count);
		ServletOutputStream out = response.getOutputStream();
		response.setContentType("text/html");
		out.println("<html><head><title>Test</title></head>");
		out.println("IBM Liberty Test" +"<br>");
		out.println("<body>1. ==> The Servlet path =" + srvPath + "<br>");
		out.println("<font color=red>"+  "2. ==> The Server running =" + System.getProperty("wlp.server.name")+"</font><br>");
		out.println("<font color=red>"+  "3. ==> # of calls =" + count.toString() + "</font><br>");
		out.println("4. ==> Session ID=" + sessionID + "<br>");
		out.println("4. ==> Length of Session ID=" + sessionID.length() + "<br>");
		out.println("5. ==> Requested URI  =" + requestURI + "<br>");

		out.println("</body>");
		out.println("</html>");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
