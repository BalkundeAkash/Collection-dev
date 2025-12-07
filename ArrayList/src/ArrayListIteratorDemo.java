// Using ArrayList because order is needed and read is faster.

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("akash");
		list.add("samidha");
		list.add("Ram");
		list.add("shyam");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
