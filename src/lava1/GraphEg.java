package lava1;

import java.util.*;

public class GraphEg {
	private Map<String, List<String>> graph = new HashMap<>();
	
	public void addEdge(String from, String to) {
		graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
	}
	public void displayGraph() {
		for(String node: graph.keySet()) {
			System.out.println(node +"->"+graph.get(node));
		}
	}
	public static void main(String args[]) {
		GraphEg g=new GraphEg();
		g.addEdge("A","B");
		g.addEdge("A","C");
		g.addEdge("B","D");
		g.displayGraph();
	}

}
