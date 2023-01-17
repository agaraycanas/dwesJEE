package t8.ej07.model;

import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;
import t8.ej07.beans.Empleado;

public class EmpleadoModel extends Model {
	public void guardarEmpleado(Empleado empleado) throws Exception {
		Transaction t =  ss.beginTransaction();
//		ss.save(empleado); //TODO DEBUG
		ss.persist(empleado);
		t.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Empleado> getTodas() {
		return ss.createQuery("from Empleado").list();
	}
	
	
	@SuppressWarnings("unchecked")
	public Empleado getEmpleadoByName(String nombre) {
		Empleado empleado = null;
		List<Empleado> empleados = 
				ss.createQuery("from Empleado e "
				+ "where nombre = :nombre")
				.setParameter("nombre", nombre)
				.list();
		if (empleados.size()>0) {
			empleado = empleados.get(0);
		}
		return empleado;
				
	}
	
	@SuppressWarnings("unchecked")
	public List<Empleado> getEmpleadosFiltrados(String filtro) {
		String patronFiltro = "%"+filtro+"%";
		return ss.createQuery("from Empleado e "
				+ "where "
				+ "nombre like :filtro or "
				+ "apellido1 like :filtro or "
				+ "apellido2 like :filtro or "
				+ "telefono like :filtro or "
				+ "ciudad.nombre like :filtro or "
				+ "		(select count(*) "
				+ "		from e.lps "
				+ "		where nombre like :filtro)>0"
				)
				.setParameter("filtro", patronFiltro)
				.list();
	}

	
	
	public boolean credencialesUsuarioCorrectas(String nombre, String pwd) {
		return ss.createQuery("from Empleado e "
				+ "where "
				+ "nombre like :nombre and "
				+ "password = :pwd")
				.setParameter("nombre", nombre)
				.setParameter("pwd", pwd)
				.list()
				.size()>0;
	}
}
