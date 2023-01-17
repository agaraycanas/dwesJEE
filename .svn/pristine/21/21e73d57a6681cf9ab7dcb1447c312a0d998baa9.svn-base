package pruebas.mvcEjemplo.model;

import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;

import pruebas.mvcEjemplo.beans.Persona;

public class PersonaModel extends Model {
	public void crearPersona(Persona persona) {
		Transaction t = ss.beginTransaction();
		ss.save(persona);
		t.commit();
		// ss.update(persona);
		ss.close();
	}

	public List<Persona> getTodos() {
		@SuppressWarnings("unchecked")
		List<Persona> personas = ss.createQuery("from Persona").list();
		ss.close();
		return personas;
	}

	public void borrar(Persona persona) {
		Transaction t = ss.beginTransaction();
		ss.delete(persona);
		t.commit();
		ss.close();

	}

	public Persona getPersonaPorId(Long id) {
		return ss.load(Persona.class, id);
	}
}
