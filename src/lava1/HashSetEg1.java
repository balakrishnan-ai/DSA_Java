package lava1;

import java.util.*;

public class HashSetEg1 {
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		
		cities.add("Chennai");
		cities.add("Mumbai");
		cities.add("Chennai");
		
		System.out.println(cities);
		
		for(String city : cities) {
			System.out.println(city);
		}
	}

}
