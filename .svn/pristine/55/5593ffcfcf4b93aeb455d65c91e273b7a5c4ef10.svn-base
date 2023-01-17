package t8.ej07.model;

import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;
import t8.ej07.beans.Ciudad;

public class CiudadModel extends Model {
	public void guardarCiudad(Ciudad ciudad) throws Exception {
		Transaction t =  ss.beginTransaction();
		ss.save(ciudad);
		t.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Ciudad> getTodas() {
		return ss.createQuery("from Ciudad").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Ciudad> getCiudadesFiltradas(String filtro) {
		String patronFiltro = "%"+filtro+"%";
		return ss.createQuery("from Ciudad where nombre like :filtro")
				.setParameter("filtro", patronFiltro)
				.list();
	}
	
	public Ciudad getCiudadPorId(Long id) {
		return ss.get(Ciudad.class, id);
	}

	public void borrar(String id) {
		Transaction t = ss.beginTransaction();
		Ciudad ciudad = (Ciudad)ss.load(Ciudad.class, Long.parseLong(id));
		ss.delete(ciudad);
		t.commit();		
	}
	public void borrarBAK(String id) {
		Transaction t = ss.beginTransaction();
		Ciudad ciudad = (Ciudad)ss.load(Ciudad.class, Long.parseLong(id));
		ss.delete(ciudad);
		t.commit();		
	}
}
