package t7.ej10;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookies")
public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/t7/ej09/form.html").include(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String pwd = request.getParameter("pwd");

		String salidaHTML = "";

		if (credencialesOk(nombre, pwd)) {
			salidaHTML += "<h2>Bienvenido " + nombre + "</h2>\n";
			if (existeCookie(nombre, request.getCookies())) {
				Long ultimaEntrada = getTiempo(nombre,request.getCookies());
				salidaHTML += "Tu última visita fue hace " + (System.currentTimeMillis()-ultimaEntrada)/1000 
						+ " segundos\n";
			} else {
				salidaHTML += "Hacía tiempo que no te veía\n";
			}
			Cookie c=new Cookie(nombre, Long.toString(System.currentTimeMillis()));
			c.setMaxAge(60);
			response.addCookie(c);

		} else {
			salidaHTML += "<h2>Nombre o contraseña incorrectos</h2>\n";
		}

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println(salidaHTML);
	}

	private Long getTiempo(String nombre, Cookie[] cookies) {
		Long tiempo = 0L;
		for (Cookie c: cookies) {
			if (c.getName().equals(nombre)) {
				tiempo = Long.parseLong(c.getValue());
			}
		}
		return tiempo;
	}

	private boolean existeCookie(String nombre, Cookie[] cookies) {
		boolean sol = false;
		if (cookies != null) {
			for (Cookie c : cookies) {
				sol = sol || c.getName().equals(nombre);
			}
		}
		return sol;
	}

	private boolean credencialesOk(String nombre, String pwd) {
		Map<String, String> bd = new LinkedHashMap<String, String>();
		bd.put("pepe", "pp");
		bd.put("ana", "a");
		return !nombre.equals("") && bd.keySet().contains(nombre)
				&& bd.get(nombre).equals(pwd);
	}
}
