package t8.ej07.model;

import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;

import t8.ej07.beans.Empleado;
import t8.ej07.beans.Lp;

public class LpModel extends Model {
	public void guardarLp(Lp lp) throws Exception {
		Transaction t =  ss.beginTransaction();
		ss.save(lp);
		t.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Lp> getTodos() {
		return ss.createQuery("from Lp").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lp> getLpFiltrados(String filtro) {
		String patronFiltro = "%"+filtro+"%";
		return ss.createQuery("from Lp where nombre like :filtro")
				.setParameter("filtro", patronFiltro)
				.list();
	}

	public Lp getLpPorId(Long id) {
		return ss.get(Lp.class, id);
	}

	public void borrar(String id) {
		Transaction t = ss.beginTransaction();
		Lp lp = (Lp)ss.load(Lp.class, Long.parseLong(id));
		for (Empleado e : lp.getEmpleados() ) {
			e.delFromLps(lp);
		}
		ss.delete(lp);
		t.commit();
	}
}
