package t7.ej04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/t7/ej04")
public class T7E04Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		o.println("EJERCICIO 4");
		o.println("<form method=\"post\">");
		o.println("NOMBRE<input type=\"text\" name=\"nombre\"><br/>");
		o.println("<input type=\"submit\" name=\"nombre\">");
		o.println("</form>");
		o.println("");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		o.println("Hola <b>"+request.getParameter("nombre")+"</b>");
	}

}
