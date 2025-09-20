package lava1;

import java.util.*;

public class DataStructureEg {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Bala");
		names.add("Mani");
		names.add("kannan");
		System.out.println("ArrayList: "+names);
		
		//LinkedList Example
		LinkedList<Integer> numbers=new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println("LinkedList: "+numbers);
		
		//Stack Example
		Stack<String> stack=new Stack<>();
		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		System.out.println("Stack (pop) : "+stack.pop());
		
		//Queue Example
		Queue <String> queue=new LinkedList<>();
		queue.add("Task1");
		queue.add("Task2");
		System.out.println("Queue (poll): "+queue.poll());
		
		//HashMap Example
		Map <Integer, String> stu=new HashMap<>();
		stu.put(101, "Balakrishnan");
		stu.put(102, "Manikandan");
		stu.put(103,"Kannan");
		System.out.println("HashMap: "+stu);
		
		//HashSet Example
		Set<String> cities=new HashSetEg<>();
		cities.add("Chennai");
		cities.add("Madurai");
		cities.add("Chennai");
		System.out.println("HashSet: "+cities);
		

	}

}
