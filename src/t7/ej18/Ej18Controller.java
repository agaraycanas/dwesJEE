package t7.ej18;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import org.mvc.Controller;

@SuppressWarnings("serial")
@WebServlet({ "/t7/ej18", "/t7/ej18/", "/t7/ej18/*" })
public class Ej18Controller extends Controller {
	public void saludarGet() throws IOException {
		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		o.println("<form  action=\""+this.baseURL+"t7/ej18/saludar\" method=\"post\">");
		o.println("Introduce un nombre<input type=\"text\" name=\"nombre\">");
		o.println("<input type=\"submit\">");
		o.println("</form>");
	}

	public void saludarPost() throws IOException {
		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		String nombre = request.getParameter("nombre");
		o.println("<h1>Hola "+nombre +"</h1>");
	}

	/*
	public void indexGet() throws IOException {
		this.saludarGet();
	}
	*/

}
