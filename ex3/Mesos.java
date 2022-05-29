package ex3;

import java.util.ArrayList;
import java.util.List;

public class Mesos {

	public static void main(String[] args) {

		List<String> llista = new ArrayList<String>();

		llista.add("Gener");
		llista.add("Febrer");
		llista.add("Març");
		llista.add("Abril");
		llista.add("Maig");
		llista.add("Juny");
		llista.add("Juliol");
		llista.add("Setembre");
		llista.add("Octubre");
		llista.add("Novembre");
		llista.add("Desembre");

		filtre(llista);

	}

	public static void filtre(List<String> llista) {

		llista.stream().forEach(mesos -> System.out.println(mesos));

	}

}
