package iesfranciscodelosrios.tratamientoXML.CRUD;

import java.util.Set;

import iesfranciscodelosrios.tratamientoXML.model.Competicion;
import iesfranciscodelosrios.tratamientoXML.model.Prueba;
import iesfranciscodelosrios.tratamientoXML.repositorio.RepoCompeticion;

public class PruebaCRUD {
	public static boolean agrega(String nombreComp,Prueba p) {
		boolean result = false;
		RepoCompeticion rc=RepoCompeticion.newInstance();
		Set<Competicion> comps = rc.getCompeticiones();
		for(Competicion c : comps) {
			if(c.getNombre().equalsIgnoreCase(nombreComp)) {
				result = c.getPruebas().add(p);
				break;
			}
		}
		if(result) {
			rc.guardaXML();
		}
		return result;
	}
	public static boolean elimina(String nombreComp, String prueba) {
		return true;
	}
	public static boolean edita(String nombreComp,String nombre,Prueba p) {
		return true;
	}
	public static boolean busca(String nombreComp, String nombre) {
		return true;
	}
}
