package pruebas.mvc.controller;

import javax.servlet.annotation.WebServlet;
import org.mvc.Controller;
import pruebas.mvc.beans.Persona;
import pruebas.mvc.model.PersonaModel;

/**
 * Servlet implementation class TestController
 */
@SuppressWarnings("serial")
@WebServlet({ "/test", "/test/", "/test/*" })
public class TestController extends Controller {
	public void indexGet() {
		PersonaModel personaModel = new PersonaModel();
		personaModel.getPersonasPorNombre("Pepe");
		datos.put("persona",new Persona("Pepe","Pérez"));
		view("pruebas/mvc/test.jsp");
	}
	
	public void crearGet() {
		view("/");
	}
}
