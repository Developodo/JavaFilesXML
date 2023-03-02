package iesfranciscodelosrios.tratamientoXML.Test;
import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("./src");
		if(f.exists()) {
			System.out.println("Existe");
			if(f.isDirectory()) {
				File[] files = f.listFiles();
				for(File file:files) {
					if(file.isDirectory()) {
						System.out.println("D-->"+file.getName());
					}else {
						System.out.println(file.getName());
					}
				}
			}
		}else {
			System.out.println("No existe");
			try {
				if(f.createNewFile()) {
					System.out.println("Creado ok");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
