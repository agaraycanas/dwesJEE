package t7.ej08;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static t7.ej07.utilidades.HelperHtml.*;

@SuppressWarnings("serial")
@WebServlet("/t7/ej08")
public class T7E08Main extends HttpServlet {
	private Map<String,String> paises;

	public T7E08Main() {
		super();
		paises = new HashMap<>();
		paises.put("ES", "España");
		paises.put("FR", "Francia");
		paises.put("IT", "Italia");
		paises.put("PT", "Portugal");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		o.println(generaFormulario());
	}

	private String generaFormulario(String nombre, String password, String pais) {
		String html="";
		html += (
				"<h2>Introduce datos</h2>"
				+ "<form method=\"post\">"
				+ "\t NOMBRE <input type=\"text\" name=\"nombre\" value=\""+ nombre +"\"><br/> \n"
				+ "\t CLAVE <input type=\"password\" name=\"password\" value=\""+ password +"\"><br/> \n"
				+ "\t PAIS "
				);

		List<String> paisesSeleccionados = new ArrayList<>();
		paisesSeleccionados.add(pais);

		html += (generaSelect("pais", paises, paisesSeleccionados, false) + "<br/>");
		html +=  (
				"<input type=\"submit\" ><br/> \n"
				+ "</form>"
				);
		return html;
	}
	
	private String generaFormulario() {
		return generaFormulario("", "", "ES");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		String pais = request.getParameter("pais");
		
		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		if (datosOK(nombre,password,pais)) {
			o.println("NOMBRE: " + nombre + "<br/>");
			o.println("CLAVE: " + password + "<br/>");
			o.println("PAIS: " + paises.get(pais) + "<br/>");
		}
		else {
			o.println("<h3>DATOS INCORRECTOS</h3>"
					+ "<p>El nombre no puede estar vacío y la clave ha de tener entre 6 y 12 caracteres</p>");
			o.println(generaFormulario(nombre,password,pais));
			
		}
	}

	private boolean datosOK(String nombre, String password, String pais) {
		boolean ok = true;
		ok = ok && (nombre!=null && password!=null && pais!=null); // Datos no nulos
		ok = ok && (!nombre.equals("")); // Nombre no vacío
		ok = ok && (password.length()>=6 && password.length()<=12); // Password entre 6 y 12 caracteres
		return ok;
	}

}
