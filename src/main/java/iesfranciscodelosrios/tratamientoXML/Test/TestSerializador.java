package iesfranciscodelosrios.tratamientoXML.Test;


import iesfranciscodelosrios.Util.SerializadorManager;
import iesfranciscodelosrios.tratamientoXML.model.Agenda;
import iesfranciscodelosrios.tratamientoXML.model.Contacto;

public class TestSerializador {
	public static void main(String args[]) {
		Contacto c=new Contacto("Juan","j@gmail.com","123");
		Contacto c2=new Contacto("Maria","m@gmail.com","456");
		
		Agenda a=new Agenda();
		a.addContacto(c);
		a.addContacto(c2);
		
		System.out.println("Agenda antes de escribir");
		System.out.println(a);
		
		if(SerializadorManager.serialize(a, "agenda.txt")) {
			Agenda a2 = SerializadorManager.deserialize("agenda.txt");
			System.out.println("Agenda del archivo");
			System.out.println(a2);
		}else {
			System.out.println("KO");
		}
	}
}
