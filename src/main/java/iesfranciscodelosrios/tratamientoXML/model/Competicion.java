package iesfranciscodelosrios.tratamientoXML.model;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Competiciones")
@XmlAccessorType(XmlAccessType.FIELD)
public class Competicion {
	private String nombre;
	private Set<Prueba> pruebas;
	public Competicion() {}
	public Competicion(String nombre, Set<Prueba> pruebas) {
		this.nombre = nombre;
		this.pruebas = pruebas;
	}
	public Competicion(String nombre) {
		this(nombre, new HashSet<>());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Prueba> getPruebas() {
		return pruebas;
	}
	public void setPruebas(Set<Prueba> pruebas) {
		this.pruebas = pruebas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Competicion other = (Competicion) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Competicion [nombre=" + nombre + ", pruebas=" + pruebas + "]";
	}
}
