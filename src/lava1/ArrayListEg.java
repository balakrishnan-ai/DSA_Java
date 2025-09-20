package lava1;

import java.util.*;
public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Bala");
		names.add("Rishi");
		names.add("Balamurugan");
		
		System.out.println("Names: "+names);
		
		names.remove("Rishi");
		System.out.println("After removal: "+names);

	}

}
