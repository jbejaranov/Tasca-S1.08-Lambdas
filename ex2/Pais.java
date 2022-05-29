package ex1;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> llista = new ArrayList<String>();

		llista.add("Nigeria");
		llista.add("Ghana");
		llista.add("Senegal");
		llista.add("Marruecos");
		llista.add("Etiopía");
		llista.add("Somalia");
		llista.add("Uganda");

		paisO(llista);

	}

	public static void paisO(List<String> llista) {

		llista.stream().filter(pais -> pais.contains("o"))
				.forEach(pais -> System.out.println("Paisos amb lletra O: " + pais));

	}
}