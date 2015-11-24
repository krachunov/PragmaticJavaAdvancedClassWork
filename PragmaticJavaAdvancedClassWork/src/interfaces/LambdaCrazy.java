package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCrazy {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("pesho","gosho","tosho","tania");
		
		list.stream().filter(e -> e.startsWith("t")).sorted().forEach(el -> System.out.println(el));
	}
}
