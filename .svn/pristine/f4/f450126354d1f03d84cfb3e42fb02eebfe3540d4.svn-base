package pruebas.mvcEjemplo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import org.mvc.Controller;

import pruebas.mvcEjemplo.beans.Color;
import pruebas.mvcEjemplo.model.ColorModel;

@SuppressWarnings("serial")
@WebServlet({ "/color", "/color/", "/color/*" })
public class ColorController extends Controller {

	public void crearGet() {
		view("color/crearGet.jsp");
	}

	public void crearPost() throws IOException {
		String nombre =request.getParameter("nombre");
		Color color=new Color(nombre);
		new ColorModel().crearColor(color);
		datos.put("color", color);
		view("color/crearPost.jsp");
	}
	
	public void listarGet() {
		List<Color> colores = new ColorModel().getTodos();
		datos.put("colores", colores);
		view("color/listarGet.jsp"); 
	}
	
	public void borrarGet() {
		Long id = Long.parseLong(request.getParameter("id"));
		new ColorModel().borrar(id);
		listarGet();
	}
	
	public void indexGet() {
		crearGet();
	}
}
