package lava1;

import java.util.*;
public class HashSetEg {
	public static void main(String[] args) {
		HashSet<String> usernames = new HashSet<>();
		
		usernames.add("Ant");
		usernames.add("Cot");
		usernames.add("Cat");
		
		for(String name : usernames) {
			System.out.println(name);
		}
		
	}

}
