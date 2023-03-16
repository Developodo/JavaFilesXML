package iesfranciscodelosrios.tratamientoXML.CRUD;

import java.util.Iterator;
import java.util.Set;

import iesfranciscodelosrios.tratamientoXML.model.Competicion;
import iesfranciscodelosrios.tratamientoXML.repositorio.RepoCompeticion;

public class CompeticionCRUD {
	public static boolean agrega(Competicion c) {
		RepoCompeticion rc=RepoCompeticion.newInstance();
		Set<Competicion> comps = rc.getCompeticiones();
		boolean result = comps.add(c);
		if(result) {
			rc.setCompeticiones(comps);//opcional
			rc.guardaXML();
		}
		return result;
	}
	public static boolean elimina(String nombre) {
		RepoCompeticion rc=RepoCompeticion.newInstance();
		Set<Competicion> comps = rc.getCompeticiones();
		boolean result = comps.remove(new Competicion(nombre));
		if(result) {
			rc.setCompeticiones(comps);//opcional
			rc.guardaXML();
		}
		return result;	
		
	}
	public static boolean edita(String nombre,Competicion c) {
		return true;
	}
	public static boolean busca(String nombre) {
		return true;
	}
}
