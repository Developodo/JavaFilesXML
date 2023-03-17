package iesfranciscodelosrios.tratamientoXML.repositorio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import iesfranciscodelosrios.Util.XMLManager;
import iesfranciscodelosrios.tratamientoXML.model.Competicion;

@XmlRootElement(name="Proyecto")
@XmlAccessorType(XmlAccessType.FIELD)
public class RepoCompeticion implements Serializable{
	@XmlTransient
	private static final long serialVersionUID = 1L;
	@XmlTransient
	private static RepoCompeticion _instance;
	
	private Set<Competicion> competiciones;
	private RepoCompeticion(boolean fake) {
		RepoCompeticion copia = XMLManager.readXML(new RepoCompeticion(), "competicion.xml");
		if(copia!=null) {
			this.competiciones = copia.getCompeticiones();
		}
		System.out.println("AQUI");
		if(this.competiciones==null) {
			this.competiciones = new HashSet<>();
		}
	}
	private RepoCompeticion() {
		this.competiciones = new HashSet<>();
	}
	public static RepoCompeticion newInstance() {
		if(_instance == null) _instance = new RepoCompeticion(true);
		return _instance;
	}
	public Set<Competicion> getCompeticiones() {
		return competiciones;
	}
	public void setCompeticiones(Set<Competicion> competiciones) {
		this.competiciones = competiciones;
	}
	public boolean guardaXML() {
		return XMLManager.writeXML(this, "competicion.xml");
	}
	
	

}
