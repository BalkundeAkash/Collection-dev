package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
public class CollectionController {

	@GetMapping("/api/arraylist/run")
	public List<String> runArrayList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Akash");
		list.add("Java");
		list.add("Spring Boot");
		return list;
	}

	@GetMapping("/api/linkedlist/run")
	public List<String> runLinkedList() {
		LinkedList<String> list = new LinkedList<>();
		list.add("Node 1");
		list.add("Node 2");
		list.add("Node 3");
		return list;
	}
}
