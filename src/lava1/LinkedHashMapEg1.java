package lava1;

import java.util.*;

public class LinkedHashMapEg1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
		
		students.put(101, "Bala");
		students.put(102, "Kalidass");
		students.put(103, "Mani");
		
		System.out.println(students);
	}

}
