package iesfranciscodelosrios.tratamientoXML.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInputStream {
	public static void main(String[] args) {
		int valor = 20;
		try {
			FileOutputStream out =new FileOutputStream("datos.bin");
			out.write(valor);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//try-resources
		try(FileInputStream in =new FileInputStream("datos.bin")){
			int dato;
			while((dato = in.read())!=-1) {
				System.out.println("Dato ->"+dato);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
