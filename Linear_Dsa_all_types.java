package lava1;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
//		1.Array Example
		int[] stumarks= {85,90,78,88,76};
		System.out.println("Array Example Student marks: ");
		for(int i=0;i<stumarks.length;i++) {
			System.out.println("Student "+(i+1)+" Marks: "+stumarks[i]);
		}
		
//		2. ArrayList Example
		
		ArrayList<String> gl=new ArrayList<>();
		gl.add("Milk");
		gl.add("Bread");
		gl.add("Eggs");
		System.out.println("\n ArrayList eg Grocery List: "+gl);
		
//		3. LinkedList Example
		
		LinkedList<String> tr=new LinkedList<>();
		tr.add("Engine");
		tr.add("Coach A");
		tr.add("Coach B");
		tr.add("Coach C");
		tr.add("Coach D");
		
		System.out.println("\n LinkedList Example Train Coaches: "+tr);
		tr.addFirst("New Engine");
		System.out.println("After adding at start: "+tr);
		
//		4. Stack Example
		Stack<String> brh=new Stack<>();
		brh.push("Google");
		brh.push("Youtube");
		brh.push("Chatgpt");
		System.out.println("\n Stack Example Browser History: "+brh);
		
		brh.pop();
		System.out.println("After going back: "+brh);
		
		
//		5. Queue Example
		Queue<String> cust=new LinkedList<>();
		cust.offer("Customer 1");
		cust.offer("Customer 2");
		cust.offer("Customer 3");
		System.out.println("\n Queue example Customer Service: "+cust);
		
		cust.poll();
		System.out.println("After serving one: "+cust);
		
		
//		6. Deque Examples
		Deque<String> trbo=new ArrayDeque<>();
		trbo.addFirst("Passanger 1");
		trbo.addLast("Passanger 2");
		trbo.addFirst("Passanger 3");
		System.out.println("\n Deque Example Train Boarding : "+trbo);
		trbo.removeLast();
		System.out.println("After removing from last: "+trbo);
	}

}
