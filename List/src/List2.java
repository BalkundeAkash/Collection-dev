/*
 * Write a program where List holds a LinkedList implementation.
 * When is LinkedList preferred? 
 * 
 * 
 * Why LinkedList?

	Frequent insert/delete operations
	Node-based structure → fast modifications
 * 
 * */

import java.util.LinkedList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {

		// using List Interface
		// using linkedlist beacuse insertion / delection is faster
		List<String> names = new LinkedList<>();

		names.add("akash");
		names.add("samidha");
		names.add("yogita");
		names.add("mahesh");

		System.out.println(names);
		System.out.println(names.remove(2) + names);
		System.out.println(names.reversed());

		names.remove(1); // remove samidha // (fast delete)

		System.out.println(names);

	}
}
