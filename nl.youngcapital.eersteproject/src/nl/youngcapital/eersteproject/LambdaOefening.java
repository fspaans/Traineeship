package nl.youngcapital.eersteproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class LambdaOefening {
	/**
	 * Deze functie hoef je niet te begrijpen!
	 * @param data  een ArrayList van een willekeurig type 
	 * @param p     een lambda-expressie die een parameter van datzelfde type neemt en een boolean teruggeeft
	 * @return		een nieuwe List terug waarin alleen de data zit waarvoor je predicaat true is.
	 */
	public static <T> List<T> filter(ArrayList<T> data, Predicate<T> p){
		return data.stream().filter(p).collect(Collectors.toList());
	}

	
	/**
	 * Deze functie hoef je niet te begrijpen!
	 * @param data  een ArrayList van een willekeurig type
	 * @param p     een lambda-expressie die een parameter van datzelfde type neemt en ook zo'n type teruggeeft
	 * @return		we voeren de lamba uit voor ieder element van data en geven het resultaat terug 
	 */
	public static <T> List<T> map(ArrayList<T> data, Function<T, T> f){
		return data.stream().map(f).collect(Collectors.toList());
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<String> astr = new ArrayList<>();
		
		for(int x = 0; x < 100; ++x){
			ar.add(x);
			astr.add("S" + x + x + ((x%10 == 0) ? ".java" : ""));
		}

		ArrayList<Double> ard = new ArrayList<>();
		for(int i : ar) {
			ard.add(i*1.0);
		}
		
		String[] strar = {"hoi","doei"};
		ArrayList<String> strarl = new ArrayList<>();
		strarl.addAll(Arrays.asList(strar));
		System.out.println(strarl);
		
		System.out.println(
				//filter(ar, i -> (i%3 == 0 || i%5 == 0))
				//filter(astr, i -> i.length() == 5)
				//filter(astr, i -> i.endsWith(".java"))
				//map(ard, i -> Math.sqrt(i))
				map(astr, i -> new StringBuilder(i).reverse().toString())
		);
	}
}
