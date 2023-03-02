package iesfranciscodelosrios.tratamientoXML.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Contacto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contacto implements Serializable{
	private String nombre;
	private String telefono;
	private String mail;
	
	public Contacto(String nombre, String telefono, String mail) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.mail = mail;
	}
	public Contacto() {
		this("","","");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", mail=" + mail + "]";
	}
}
