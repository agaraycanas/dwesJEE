package t8.ej07.beans;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ciudad {
	private Long id;
	private Collection<Empleado> empleados;
	private String nombre;

	public Ciudad() {
		this.empleados = new ArrayList<Empleado>();
	}

	public Ciudad(String nombre) {
		super();
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	@Column(unique = true)
	public String getNombre() {
		return nombre;
	}

	@OneToMany(cascade = {CascadeType.ALL}, fetch=FetchType.LAZY)
	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmpleados(Collection<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void addToEmpleados(Empleado empleado) {
		this.empleados.add(empleado);
	}

	@Override
	public String toString() {
		return "CIU:" + this.nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Ciudad))
			return false;
		Ciudad other = (Ciudad) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
