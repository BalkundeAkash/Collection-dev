/*
 Iterate using For Loop

👉 Structure:

for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
 */

import java.util.ArrayList;

public class ArrayListIterateDemo_08 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("akash");
		list.add("samidha");
		list.add("ram");
		list.add("shyam");
		list.add("Ashok");
		
		for(int i = 0;  i <list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
