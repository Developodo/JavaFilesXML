import iesfranciscodelosrios.tratamientoXML.CRUD.CompeticionCRUD;
import iesfranciscodelosrios.tratamientoXML.CRUD.PruebaCRUD;
import iesfranciscodelosrios.tratamientoXML.model.Competicion;
import iesfranciscodelosrios.tratamientoXML.model.Prueba;

public class PruebaTest {
	public static void main(String[] args) {
		Prueba p = new Prueba("Salto");
		Competicion c = new Competicion("Córdoba");
		CompeticionCRUD.agrega(c);
		PruebaCRUD.agrega("Córdoba", p);
	}
}
