package pruebas.mvcEjemplo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import org.mvc.Controller;

import pruebas.mvcEjemplo.beans.Color;
import pruebas.mvcEjemplo.beans.Persona;
import pruebas.mvcEjemplo.model.ColorModel;
import pruebas.mvcEjemplo.model.PersonaModel;

@SuppressWarnings("serial")
@WebServlet({ "/persona", "/persona/", "/persona/*" })
public class PersonaController extends Controller {

	public void crearGet() {
		List<Color> colores = (new ColorModel()).getTodos();
		datos.put("colores", colores);
		view("persona/crearGet.jsp");
	}

	public void crearPost() throws IOException {
		String nombre = request.getParameter("nombre");
		String sexo = request.getParameter("sexo");
		Persona persona = new Persona(nombre, sexo);

		if (request.getParameter("color") != null) {
			Long idColorFavorito = Long.parseLong(request.getParameter("color"));
			Color colorFavorito = (new ColorModel()).getColorPorId(idColorFavorito);
			persona.setColorFavorito(colorFavorito);
		}
		new PersonaModel().crearPersona(persona);
		datos.put("persona", persona);
		view("persona/crearPost.jsp");
	}

	public void listarGet() {
		List<Persona> personas = new PersonaModel().getTodos();
		datos.put("personas", personas);
		view("persona/listarGet.jsp");
	}

	public void borrarGet() {
		Long idPersona = Long.parseLong(request.getParameter("id"));
		PersonaModel pm = new PersonaModel();
		Persona persona = pm.getPersonaPorId(idPersona);
		persona.getColorFavorito().getPersonas().remove(persona);
		pm.borrar(persona);
		listarGet();
	}

	public void indexGet() {
		crearGet();
	}
}
