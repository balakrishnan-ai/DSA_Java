package lava1;

import java.util.*;

public class LinkedHashMapEg {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> books = new LinkedHashMap<>();
		
		books.put(1, "Java Basics");
		books.put(2, "Spring Boot");
		books.put(3, "Data Structures");
		
		for(Integer id : books.keySet()) {
			System.out.println("Book ID: "+id+", Title: "+books.get(id));
		}
	}

}
