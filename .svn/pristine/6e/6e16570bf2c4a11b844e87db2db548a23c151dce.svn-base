package t7.ej20;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import org.mvc.Controller;

@SuppressWarnings("serial")
@WebServlet({ "/t7/ej20", "/t7/ej20/", "/t7/ej20/*" })
public class Ej20Controller extends Controller {
	public void saludarGet() throws IOException, ServletException {
		request.getRequestDispatcher("/view/t7/ej20/saludarGet.jsp").forward(request, response);
	}

	public void saludarPost() throws IOException, ServletException {
		request.setAttribute("nombre",request.getParameter("nombre"));
		request.getRequestDispatcher("/view/t7/ej20/saludarPost.jsp").forward(request, response);
	}

	public void despedirseGet() throws IOException, ServletException {
		request.getRequestDispatcher("/view/t7/ej20/despedirseGet.jsp").forward(request, response);
	}

	public void despedirsePost() throws IOException, ServletException {
		request.setAttribute("nombre",request.getParameter("nombre"));
		request.getRequestDispatcher("/view/t7/ej20/despedirsePost.jsp").forward(request, response);
	}

	public void indexGet() throws IOException, ServletException {
		this.saludarGet();
	}

}
