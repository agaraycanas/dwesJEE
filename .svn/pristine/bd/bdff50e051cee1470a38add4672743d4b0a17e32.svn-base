package t7.ej06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class T7E06Main
 */
@WebServlet("/t7/ej06")
public class T7E06Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		o.println("<form action=\"\" method=\"post\">");
		o.println("Nombre<input type=\"text\" name=\"nombre\">");
		o.println("<h3>Aficiones</h3>");

		o.println("<label for=\"idCantar\">Cantar</label>");
		o.println("<input id=\"idCantar\" type=\"checkbox\" name=\"aficion[]\" value=\"cantar\">");

		o.println("<label for=\"idBailar\">Bailar</label>");
		o.println("<input id=\"idBailar\" type=\"checkbox\" name=\"aficion[]\" value=\"bailar\">");

		o.println("<input type=\"submit\">");

		o.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String[] listaIdiomas = request.getParameterValues("aficion[]");

		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		if (nombre==null) {
			o.println("<h1>El nombre no puede ser nulo</h1>");
		}
		else { //Nombre no nulo
			o.println("Hola "+nombre);
			for (String idioma:listaIdiomas) {
				o.println(idioma+"<br/>");
			}
		}
	}

}
