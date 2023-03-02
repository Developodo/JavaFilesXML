package iesfranciscodelosrios.tratamientoXML.Test;

import iesfranciscodelosrios.Util.XMLManager;
import iesfranciscodelosrios.tratamientoXML.model.Contacto;

public class TestContacto {
	public static void main(String[] args) {
		/*Contacto c = new Contacto("María","123","c@gmail.com");
		if(XMLManager.writeXML(c, "contacto.xml")) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}*/
		
		Contacto c=XMLManager.readXML(new Contacto(),"contacto.xml");
		if(c!=null) {
			System.out.println(c);
		}else {
			System.out.println("KO");
		}
		
	}
}
