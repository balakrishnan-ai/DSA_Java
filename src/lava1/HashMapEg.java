package lava1;

import java.util.*;

public class HashMapEg {
	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<>();
		
		students.put(101,"Bala");
		students.put(102,"Kalidass");
		students.put(103, "Mani");
		
		System.out.println("Roll 102: "+students.get(102));
		
		for(Integer roll : students.keySet()) {
			System.out.println("Roll: "+roll+",Name: "+students.get(roll));
		}
	}

}
