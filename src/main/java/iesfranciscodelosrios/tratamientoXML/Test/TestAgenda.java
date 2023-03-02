package iesfranciscodelosrios.tratamientoXML.Test;

import iesfranciscodelosrios.tratamientoXML.Util.XMLManager;
import iesfranciscodelosrios.tratamientoXML.model.Agenda;
import iesfranciscodelosrios.tratamientoXML.model.Contacto;

public class TestAgenda {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.addContacto(new Contacto("C","1","C@"));
		agenda.addContacto(new Contacto("M","2","M@"));
		agenda.addContacto(new Contacto("Z","3","Z@"));
		
		if(XMLManager.writeXML(agenda, "agenda.xml")) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		Agenda agenda2 = XMLManager.readXML(new Agenda(), "agenda.xml");
		if(agenda2!=null) {
			System.out.println(agenda2);
		}else {
			System.out.println("KO");
		}
	}
}
