package pruebas.hibernate.programas;

import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;
import pruebas.hibernate.pojos.Persona;

public class Prueba extends Model {

	public void crearPersona(String nombre, String apellido, int edad) {
		Transaction t = this.ss.beginTransaction();
		ss.save(new Persona(nombre, apellido,edad));
		t.commit();
	}

	public void recuperarPersona(Long id) {
		Persona p = ss.load(Persona.class, id);
		System.out.println(p);
	}
	
	@SuppressWarnings("unchecked")
	public List<Persona> recuperarPersonas() {
		return ss.createQuery("from Persona").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> recuperarNombreEdadPersonas() {
		return ss.createQuery("select p.nombre, p.edad from Persona p").list();
	}
	

	public Prueba() {
		/*
		crearPersona("A-nombre","A-apellido",10);
		crearPersona("B-nombre","B-apellido",20);
		crearPersona("C-nombre","C-apellido",30);
		crearPersona("D-nombre","D-apellido",40);
		*/
		for (Object[] p:recuperarNombreEdadPersonas()) {
			for (Object dato:p) {
				System.out.print(dato+" ");
			}
			System.out.println();
			//System.out.println(p[0]+"("+p[1]+")");
		}
	}

	public static void main(String[] args) {
		new Prueba();
	}

}
