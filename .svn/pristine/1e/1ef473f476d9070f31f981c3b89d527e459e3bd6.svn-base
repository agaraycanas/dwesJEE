package pruebas.mvcEjemplo.model;

import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;

import pruebas.mvcEjemplo.beans.Color;

public class ColorModel extends Model {
	public void crearColor(Color color) {
		Transaction t = ss.beginTransaction();
			ss.save(color);
		t.commit();
		ss.close();
	}

	@SuppressWarnings("unchecked")
	public List<Color> getTodos() {
			List<Color> colores =ss.createQuery("from Color").list();
		ss.close();
		return colores;
	}

	public void borrar(Long id) {
		Transaction t = ss.beginTransaction();
			ss.delete(ss.load(Color.class, id));
		t.commit();
		ss.close();
	}

	public Color getColorPorId(Long idColor) {
			Color color = ss.load(Color.class, idColor);
		ss.close();
		return color;
	}
}
