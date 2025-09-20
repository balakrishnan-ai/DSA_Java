package lava1;

import java.util.*;

public class demoDsa{
	public static void main(String args[]) {
		System.out.println("This is Data structure");
		
		List<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println("ArrayList: "+num);
		
		
		LinkedList<Integer> num1=new LinkedList<>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		
		System.out.println("LinkedList: "+num1);
		
		
		Stack<String> num2=new Stack<>();
		num2.push("Java");
		num2.push("Python");
		num2.push("C++");
		
		
		
		System.out.println("Stack: "+num2);
	}
}