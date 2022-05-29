package ex4;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		mesos();
	}

	public static void mesos() {

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

		llista.forEach(System.out::println);

	}

}
