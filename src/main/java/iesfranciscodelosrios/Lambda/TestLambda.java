package iesfranciscodelosrios.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TestLambda {
	public static void main(String[] args) {
		List<String> palabras = Arrays.asList("Hola","Mundo","!");
		palabras.forEach((x)->{ 
				System.out.println(x);
		});
		
		BiFunction<Integer, Integer,Integer> sumar = (a,b) -> a+b;
		System.out.println(sumar.apply(5, 5));
	}
}
