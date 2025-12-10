package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunProgramsController {

	 // 1️⃣ Create ArrayList
    @GetMapping("/run/arraylist/create")
    public List<String> createList() {
        return new ArrayList<>(List.of("Akash", "Java", "Spring Boot"));
    }

    // 2️⃣ Add element
    @GetMapping("/run/arraylist/add")
    public List<String> addElement() {
        ArrayList<String> list = new ArrayList<>(List.of("Akash", "Java"));
        list.add("NewElement");
        return list;
    }

    // 3️⃣ Add at index
    @GetMapping("/run/arraylist/addindex")
    public List<String> addAtIndex() {
        ArrayList<String> list = new ArrayList<>(List.of("Akash", "Java", "Spring"));
        list.add(1, "Inserted");
        return list;
    }

    // 4️⃣ Remove by index
    @GetMapping("/run/arraylist/removeindex")
    public List<String> removeIndex() {
        ArrayList<String> list = new ArrayList<>(List.of("A", "B", "C"));
        list.remove(1); // removes B
        return list;
    }

    // 5️⃣ Remove by value
    @GetMapping("/run/arraylist/removevalue")
    public List<String> removeValue() {
        ArrayList<String> list = new ArrayList<>(List.of("Java", "Spring", "Java"));
        list.remove("Java");
        return list;
    }

    // 6️⃣ Update (set)
    @GetMapping("/run/arraylist/update")
    public List<String> updateValue() {
        ArrayList<String> list = new ArrayList<>(List.of("A", "B", "C"));
        list.set(1, "Updated");
        return list;
    }

    // 7️⃣ Get element
    @GetMapping("/run/arraylist/get")
    public String getElement() {
        ArrayList<String> list = new ArrayList<>(List.of("Akash", "Java", "Spring"));
        return list.get(0);
    }

    // 8️⃣ Search contains
    @GetMapping("/run/arraylist/search")
    public boolean searchElement() {
        ArrayList<String> list = new ArrayList<>(List.of("Akash", "Java", "Spring"));
        return list.contains("Java");
    }

    // 9️⃣ Iterate (for loop)
    @GetMapping("/run/arraylist/iterate/for")
    public List<String> iterateForLoop() {
        ArrayList<String> list = new ArrayList<>(List.of("Akash", "Java", "Spring"));
        List<String> output = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            output.add(list.get(i));
        }
        return output;
    }

    // 🔟 Iterate (for-each)
    @GetMapping("/run/arraylist/iterate/foreach")
    public List<String> iterateForEach() {
        ArrayList<String> list = new ArrayList<>(List.of("Akash", "Java", "Spring"));
        List<String> output = new ArrayList<>();
        for (String s : list) {
            output.add(s);
        }
        return output;
    }

}
