package t8.ej07.controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

import t8.ej07.beans.Lp;
import t8.ej07.model.LpModel;

@SuppressWarnings("serial")
@WebServlet({"/t8/ej07/lp","/t8/ej07/lp/","/t8/ej07/lp/*"})
public class T8E7LpController extends Controller {
	public void crearGet() {
		view("t8/ej07/lp/crearGet.jsp");
	}
	
	public void crearPost() {
		String nombre = request.getParameter("nombre");
		Lp lp = new Lp(nombre);
		LpModel model = new LpModel();
		datos.put("nombreLp", nombre);
		try {
			model.guardarLp(lp);
			request.getRequestDispatcher("/t8/ej07/lp/listar").forward(request, response);
		}
		catch (Exception e) {
			view("t8/ej07/lp/crearPostERROR.jsp");
		}
	}
	
	public void listarGet() {
		String filtro = request.getParameter("filtro");
		
		LpModel model = new LpModel();
		List<Lp> lps = model.getLpFiltrados(filtro==null?"":filtro);
		datos.put("lps",lps);
		view("t8/ej07/lp/listarGet.jsp");
	}
	
	public void listarPost() {
		this.listarGet();
	}
	
	public void borrarPost() {
		LpModel m = new LpModel();
		m.borrar(request.getParameter("id_lp"));
		view("t8/ej07/lp/listarGet.jsp");
	}

}
