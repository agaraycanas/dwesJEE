package t8.ej07.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

import t8.ej07.beans.Ciudad;
import t8.ej07.model.CiudadModel;

@SuppressWarnings("serial")
@WebServlet({ "/t8/ej07/ciudad", "/t8/ej07/ciudad/", "/t8/ej07/ciudad/*" })
public class T8E7CiudadController extends Controller {
	public void crearGet() {
		view("t8/ej07/ciudad/crearGet.jsp");
	}

	public void crearPost() {
		String nombre = request.getParameter("nombre");
		Ciudad ciudad = new Ciudad(nombre);
		CiudadModel model = new CiudadModel();
		datos.put("nombreCiudad", nombre);
		try {
			model.guardarCiudad(ciudad);
			request.getRequestDispatcher("/t8/ej07/ciudad/listar").forward(request, response);
		} catch (Exception e) {
			view("t8/ej07/ciudad/crearPostERROR.jsp");
		}
	}

	public void listarGet() {
		String filtro = request.getParameter("filtro");

		CiudadModel model = new CiudadModel();
		List<Ciudad> ciudades = model.getCiudadesFiltradas(filtro == null ? "" : filtro);
		datos.put("ciudades", ciudades);
		view("t8/ej07/ciudad/listarGet.jsp");
	}

	public void listarPost() {
		this.listarGet();
	}

	public void borrarPost() {
		CiudadModel m = new CiudadModel();
		m.borrar(request.getParameter("id_ciudad"));
		try {
			request.getRequestDispatcher("/t8/ej07/ciudad/listar").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
