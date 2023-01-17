package pruebas.mvcEjemplo.beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Color {
	private String nombre;
	private Long id;
	
	private Collection<Persona> personas;
	
	
	@OneToMany(cascade = {CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="colorFavorito")
	public Collection<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(Collection<Persona> personas) {
		this.personas = personas;
	}
	
	
	public Color(String nombre) {
		super(); 
		this.nombre = nombre;
		this.personas=new ArrayList<Persona>();
	}
	public Color() {
		this.personas=new ArrayList<Persona>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
