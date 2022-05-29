package ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> llista = new ArrayList<String>();

		llista.add("Mercurio");
		llista.add("Venus");
		llista.add("Tierra");
		llista.add("Marte");
		llista.add("Jupiter");
		llista.add("Saturno");
		llista.add("Urano");
		llista.add("Neptuno");

		llista.add("57");
		llista.add("108");
		llista.add("146");
		llista.add("227");
		llista.add("778");
		llista.add("1429");
		llista.add("2870");
		llista.add("4504");

//		llista.stream().collect(Collectors.toList())
//		.forEach(mesos -> System.out.println(mesos));

		List<String> llistaOrdenada = llista.stream().sorted().collect(Collectors.toList());
		System.out.println("Llista ordenada: "+ llistaOrdenada);
	}

}
