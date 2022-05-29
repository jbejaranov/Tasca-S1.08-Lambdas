package ex2;

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
		llista.add("Congo");

		filtre(llista);

	}

	public static void filtre(List<String> llista) {

		llista.stream().filter(pais -> pais.contains("o") && pais.length() <= 5)
				.forEach(pais -> System.out.println("Paisos amb lletra O i <= de 5 lletres: " + pais));

	}
}