package t7.ej11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Sesiones")
public class Sesiones extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view//t7/ej10/form.html").include(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String pwd = request.getParameter("pwd");

		String salidaHTML = "";

		if (credencialesOk(nombre, pwd)) {
			salidaHTML += "<h2>Bienvenido " + nombre + "</h2>\n";
			HttpSession sesion = request.getSession(true);

			//Recupero número de visitas del usuario autenticado
			
			Integer numVisitas = (Integer)(sesion.getAttribute(nombre));
			if (numVisitas==null) {
				salidaHTML="Primera vez de "+nombre;
				sesion.setAttribute(nombre, new Integer(1));
			}
			else {
				int i=numVisitas.intValue();
				sesion.setAttribute(nombre, new Integer(++i));
				salidaHTML="Visita número "+ i +" de "+nombre;
			}

		} else {
			salidaHTML += "<h2>Nombre o contraseña incorrectos</h2>\n";
		}

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println(salidaHTML);
	}

	private boolean credencialesOk(String nombre, String pwd) {
		Map<String, String> bd = new LinkedHashMap<String, String>();
		bd.put("pepe", "pp");
		bd.put("ana", "a");
		return !nombre.equals("") && bd.keySet().contains(nombre)
				&& bd.get(nombre).equals(pwd);
	}

}
