package ex8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface MiFunctionalInterface {

	public static String reverse(String cadena) {

		return Stream.of(cadena).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
	}
}
