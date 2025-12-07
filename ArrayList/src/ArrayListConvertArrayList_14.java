/*
 PROGRAM 14 — Convert ArrayList → Array
👉 Why used?
- When integrating with APIs needing arrays
- Legacy systems requiring arrays

👉 Structure:
String[] arr = list.toArray(new String[0]);
for(String s : arr) {
    System.out.println(s);
}
 */

import java.util.ArrayList;

public class ArrayListConvertArrayList_14 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Akash");
        list.add("Mahesh");
        list.add("samidha");
        list.add("Akash");

        // Convert list to array
        String[] arr = list.toArray(new String[0]);

        // Print array elements
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
