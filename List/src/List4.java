/*
 * Can List store heterogeneous data? 
 * Explain with code why this is not recommended.*/

//Why not recommended?
//Breaks type safety
//Risk of ClassCastException
//No compile-time checks
//Generics exist to avoid this

//Correct way (Generics) :

//   List<String> names = new ArrayList<>();

import java.util.ArrayList;
import java.util.List;

public class List4 {

	public static void main(String[] args) {

		// Heterogenous data not recommended
		// List list = new ArrayList<>();

		List<String> names = new ArrayList<>();

		names.add("Akash");
//		names.add(10);
//		names.add(2);
//		names.add(11.9);

		System.out.println(names);
	}

}
