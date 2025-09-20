package lava1;

import java.util.*;

public class DequeEg {

	public static void main(String[] args) {
		Deque<String> deque=new LinkedList<>();
		deque.addFirst("First");
		deque.addLast("Last");
		deque.addFirst("New First");
		
		System.out.println("Deque: "+deque);
		
		deque.removeLast();
		System.out.println("After removing last: "+deque);
		
	}

}
