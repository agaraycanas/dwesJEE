package t7.ej05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class T7E05Main
 */
@WebServlet("/t7/ej05/*")
public class T7E05Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[][] variables = { { "AUTH_TYPE", request.getAuthType() },
				{ "CONTENT_LENGTH", String.valueOf(request.getContentLength()) },
				{ "CONTENT_TYPE", request.getContentType() }, { "DOCUMENT_ROOT", getServletContext().getRealPath("/") },
				{ "PATH_INFO", request.getPathInfo() }, { "PATH_TRANSLATED", request.getPathTranslated() },
				{ "QUERY_STRING", request.getQueryString() }, { "REMOTE_ADDR", request.getRemoteAddr() },
				{ "REMOTE_HOST", request.getRemoteHost() }, { "REMOTE_USER", request.getRemoteUser() },
				{ "REQUEST_METHOD", request.getMethod() }, { "SCRIPT_NAME", request.getServletPath() },
				{ "SERVER_NAME", request.getServerName() }, { "SERVER_PORT", String.valueOf(request.getServerPort()) },
				{ "SERVER_PROTOCOL", request.getProtocol() },
				{ "SERVER_SOFTWARE", getServletContext().getServerInfo() },
				{ "REQUEST_URL", request.getRequestURL().toString() },
				{ "BASE_URL",request.getRequestURL().toString().substring(0, request.getRequestURL().toString().length() - request.getRequestURI().length()) + request.getContextPath() + "/"}};

		// Creación de la página html de respuesta
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("</head>");
		out.println("<body> \n");
		out.println("<h1>" + "Variables de Servidor" + "</h1> \n");
		out.println("<table border=\"1\"> \n");
		out.println("<tr> \n");
		out.println("<th>Variable</th><th>Valor</th>");
		for (int i = 0; i < variables.length; i++) {
			String Nombre = variables[i][0];
			String Valor = variables[i][1];
			if (Valor == null) {
				Valor = "<i>No especificado</i>";
			}
			out.println("<tr><td>" + Nombre + "</td><td>" + Valor + "</td></tr>");
		}
		out.println("</table></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
