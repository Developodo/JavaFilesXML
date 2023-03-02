package iesfranciscodelosrios.tratamientoXML.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Agenda")
@XmlAccessorType(XmlAccessType.FIELD)
public class Agenda implements Serializable{
	private static final long serialVersionUID = 1L;
	@XmlElement(name="Contacto")
	private List<Contacto> contactos;

	public Agenda() {
		this.contactos=new ArrayList<>();
	}
	public Agenda(List<Contacto> contactos) {
		this.contactos = contactos;
	}
	public List<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}
	public boolean addContacto(Contacto c) {
		if(this.contactos==null) {
			this.contactos=new ArrayList<>();
		}
		return this.contactos.add(c);
	}
	@Override
	public String toString() {
		return "Agenda [contactos=" + contactos + "]";
	}	
}
