package lava1;

import java.util.*;

public class HashMapEg1 {
	public static void main(String[] args) {
		HashMap<String, Integer> stock = new HashMap<>();
		
		stock.put("Apple",50);
		stock.put("Banana", 30);
		stock.put("Orange", 20);
		
		System.out.println("Apple stock: "+stock.get("Apple"));
		
		if(stock.containsKey("Banana")) {
			System.out.println("Banana is available !");
		}
		
		for(String fruit : stock.keySet()) {
			System.out.println(fruit+"->"+stock.get(fruit));
		}
	}

}
