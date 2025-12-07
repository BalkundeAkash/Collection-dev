/*
 PROGRAM 10 — Iterate Using Iterator (Most Important)
👉 Why used?
Safe removal during iteration
Interviews मध्ये विचारतात: “Why Iterator over loop?”
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInteratorDemo_10 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Akash");
		list.add("Samidha");
		list.add("mahesh");
		list.add("Shubhdada");

//		Iterator<String> itr = list.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String value = itr.next();
			if (value.equals("mahesh")) {
				itr.remove();// SAFE Removal
			}
		}
		System.out.println(list);

	}

}
