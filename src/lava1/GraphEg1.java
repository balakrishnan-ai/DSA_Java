package lava1;

import java.util.*;

public class GraphEg1 {
	private Map<String, List<String>> graph = new HashMap<>();
	
	public void addFriend(String person, String friend) {
		graph.computeIfAbsent(person, k -> new ArrayList<>()).add(friend);
	}
	
	public void showNetwork() {
		for(String person : graph.keySet()) {
			System.out.println(person+"->"+graph.get(person));
		}
	}
	public static void main(String[] args) {
		GraphEg1 g = new GraphEg1();
		g.addFriend("Alice","Bob");
		g.addFriend("Alice", "Charlie");
		g.addFriend("Bob","David");
		
		g.showNetwork();
	}

}
