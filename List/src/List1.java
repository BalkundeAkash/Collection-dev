/* LIST INTERFACE
 * 
 * Write a program where List is implemented using ArrayList.
 * Explain why we use List reference instead of ArrayList directly.
 * 
 * Why we use it?
	List gives flexibility (implementation change करता येते)
 	ArrayList is used when fast read + ordered data हव्या असतात
 * 
 * */

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {

		// Using List for Flexibility
		// using Arraylist beacuse order is needed and read operations are fast
		List<String> names = new ArrayList<>();

		names.add("akash");
		names.add("samidha");
		names.add("yogita");
		names.add("mahesh");

		System.out.println(names);
		System.out.println(names.get(3));
	}
}
