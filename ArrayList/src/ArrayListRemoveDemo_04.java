import java.util.ArrayList;

/**
 * Remove Element by Value 👉 Thinking:
 * 
 * remove(“value”)
 * 
 * removes first occurrence
 */

public class ArrayListRemoveDemo_04 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("akash");
		list.add("Samidha");
		list.add("Akash");
		list.add("Mahesh");
		list.add("krsna");

		list.remove("Samidha"); //

		System.out.println(list);
	}
}
