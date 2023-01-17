package pruebas.mvcEjemplo.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Persona {
 
	private Long id;
	private String nombre;
	private String sexo;
	private Color colorFavorito;

	@ManyToOne(cascade = {CascadeType.ALL}, fetch=FetchType.LAZY, optional=true)
	@JoinColumn(nullable = true)
	public Color getColorFavorito() { 
		return colorFavorito;
		
	}

	public void setColorFavorito(Color colorFavorito) {
		this.colorFavorito = colorFavorito;
		colorFavorito.getPersonas().add(this);
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	
	} 

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Persona(String nombre, String sexo) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public Persona() {

	}

}
