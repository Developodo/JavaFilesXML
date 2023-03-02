package iesfranciscodelosrios.tratamientoXML.Test;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) {
		String frase;
		if(args.length>1) {
			frase=args[1];
		}else {
			frase="Hola Mundo";
		}
		
		try(FileWriter f = new FileWriter("texto.txt")){
			f.write(frase);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileReader f = new FileReader("texto.txt")){
			char[] caracteres=new char[256];
			if(f.read(caracteres)!=-1) {
				
			}else {
				System.out.println("Nada que leer");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
