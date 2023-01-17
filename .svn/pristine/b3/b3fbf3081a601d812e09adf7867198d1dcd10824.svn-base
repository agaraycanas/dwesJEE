package t7.ej07;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static t7.ej07.utilidades.HelperHtml.*;

import java.util.Map;

@WebServlet("/t7/ej07")
public class T7E07Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter o = response.getWriter();
		o.println("<h1>EJERCICIO 7 (Tema 7)</h1>");
		
		Map<String,String> datos = new HashMap<>();
		datos.put("C","Cine");
		datos.put("D","Deporte");
		datos.put("M","Música");
		datos.put("R","Restaurantes");
		
		List<String> seleccionados = new ArrayList<>();
		seleccionados.add("C");
		seleccionados.add("D");
		
		o.println("<h3>Prueba de helper de RadioButtons</h3>");
		o.println(generaRadio("aficionRadio", datos, "D"));
		
		o.println("<h3>Prueba de helper de Checkboxes</h3>");
		o.println(generaCheckBox("aficionCheck",datos,seleccionados));

		seleccionados.remove("C");
		o.println("<h3>Prueba de helper de Select Simple</h3>");
		o.println(generaSelect("aficionSelectS",datos,seleccionados,false));

		seleccionados.add("C");
		o.println("<h3>Prueba de helper de Select Múltiple</h3>");
		o.println(generaSelect("aficionSelectM",datos,seleccionados,true));
}


}
