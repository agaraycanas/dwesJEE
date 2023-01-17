package t8.ej07.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

import org.mvc.Controller;

import t8.ej07.beans.Ciudad;
import t8.ej07.beans.Empleado;
import t8.ej07.beans.Lp;
import t8.ej07.model.CiudadModel;
import t8.ej07.model.EmpleadoModel;
import t8.ej07.model.LpModel;

@SuppressWarnings("serial")
@WebServlet({ "/t8/ej07/empleado", "/t8/ej07/empleado/", "/t8/ej07/empleado/*" })
public class T8E7EmpleadoController extends Controller {
	public void crearGet() {
		CiudadModel ciudadModel = new CiudadModel();
		LpModel lpModel = new LpModel();

		List<Ciudad> ciudades = ciudadModel.getTodas();
		List<Lp> lps = lpModel.getTodos();

		datos.put("lps", lps);
		datos.put("ciudades", ciudades);

		view("t8/ej07/empleado/crearGet.jsp");
	}

	public void crearPost() {
		String nombre = null ;
		String ape1 = null;
		String ape2 = null;
		String pwd = null;
		String tlf = null;
		Ciudad ciudad = null;
		List<Lp> lps = new ArrayList<Lp>();
		
		try {
			nombre = request.getParameter("nombre");
			ape1 = request.getParameter("ape1");
			ape2 = request.getParameter("ape2");
			pwd = request.getParameter("pwd");
			tlf = request.getParameter("tlf");
			ciudad = (new CiudadModel()).getCiudadPorId(Long.parseLong(request.getParameter("idCiudad")));
			
			LpModel lpModel = new LpModel();
			String[] lpsSeleccionados = request.getParameterValues("idLP[]");
			lpsSeleccionados = (lpsSeleccionados==null?new String[0]:lpsSeleccionados);
			for (String idLpString : lpsSeleccionados) {
				Long idLpLong = Long.parseLong(idLpString);
				Lp lp = lpModel.getLpPorId(idLpLong);
				lps.add(lp);
			}

			if (nombre==null || nombre.equals("")) {
				throw new Exception("El nombre no puede ser nulo");
			}
			if (ape1==null || ape1.equals("")) {
				throw new Exception("El primer apellido no puede ser nulo");
			}	
			if (pwd==null || pwd.equals("")) {
				throw new Exception("La contraseña no puede ser nula");
			}	

			Empleado empleado = new Empleado(nombre, ape1, ape2, pwd, tlf, ciudad, lps);

			EmpleadoModel model = new EmpleadoModel();
			try {
				model.guardarEmpleado(empleado);
				request.getRequestDispatcher("/t8/ej07/empleado/listar").forward(request, response); // TODO DEBUG
			} catch (Exception e) {
				System.err.println("Error al guardar objeto empleado");
				view("t8/ej07/empleado/crearPostERROR.jsp");
			}

		}
		catch (Exception e) {
			datos.put("mensaje",e.getMessage());
			view("t8/ej07/empleado/crearPostERROR.jsp");
		}


	}

	public void listarGet() {
		String filtro = request.getParameter("filtro");

		HttpSession sesion = request.getSession(true);
		String headerEmpleadoNombre = (String)sesion.getAttribute("headerEmpleadoNombre");
		String headerEmpleadoApe1 = (String)sesion.getAttribute("headerEmpleadoNombre");
		datos.put("headerEmpleadoNombre",headerEmpleadoNombre);
		datos.put("headerEmpleadoApe1",headerEmpleadoApe1);

		EmpleadoModel model = new EmpleadoModel();
		List<Empleado> empleados = model.getEmpleadosFiltrados(filtro == null ? "" : filtro);
		datos.put("empleados", empleados);
		view("t8/ej07/empleado/listarGet.jsp");
	}

	public void listarPost() {
		this.listarGet();
	}
	
	public void loginGet() {
		view("t8/ej07/empleado/loginGet.jsp");
	}
	
	public void loginPost() {
		String nombre = request.getParameter("nombre");
		String pwd = request.getParameter("pwd");
		EmpleadoModel m = new EmpleadoModel();
		if (m.credencialesUsuarioCorrectas(nombre,pwd)) {
			HttpSession ss = request.getSession(true);
			Empleado empleado = m.getEmpleadoByName(nombre);
			ss.setAttribute("empleadoId", empleado.getId());
			ss.setAttribute("empleadoNombre", empleado.getNombre());
			ss.setAttribute("empleadoApe1", empleado.getApellido1());
			view("t8/ej07/empleado/loginOK.jsp");
		}
		else {
			view("t8/ej07/empleado/loginERROR.jsp");
		}
	}
	
	
	public void logoutGet() {
		HttpSession ss = request.getSession(true);
		ss.removeAttribute("empleadoId");
		ss.removeAttribute("empleadoNombre");
		ss.removeAttribute("empleadoApe1");
		try {
			response.sendRedirect(baseURL+"t8/ej07/home");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
