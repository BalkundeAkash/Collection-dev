/*
 
 Get Element by Index
👉 Structure:
String value = list.get(1);
System.out.println(value);
 
 */

import java.util.ArrayList;

public class ArrayListGetElementDemo_07 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("akash");
		list.add("samidha");
		list.add("Umesh");
		list.add("nitin");

		String value = list.get(1);
		System.out.println(value);
	}
}
