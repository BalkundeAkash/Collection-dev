/* 
 * Write a method that returns a List. 
 * Why should method return type be List and not ArrayList*/

/**
 * Why return List?
 * 
 * Clean code
 * 
 * Loose coupling
 * 
 * Future flexibility (change implementation internally)
 */

import java.util.ArrayList;
import java.util.List;

public class List3 {

	// Methods return list for flexibility

	public static void main(String[] args) {
		List<String> list = getStudents();
		System.out.println(list);

	}

	public static List<String> getStudents() {
		List<String> Students = new ArrayList<>();
		Students.add("Akash");
		Students.add("Samidha");
		Students.add("yogita");
		Students.add("Mahesh");
		return Students;

	}

}
