package lava1;

import java.util.*;

public class RecentlyVisitedCities {
	public static void main(String[] args) {
		LinkedHashSet<String> visitedCities = new LinkedHashSet<>();
		
		visitedCities.add("Chennai");
		visitedCities.add("Bangalore");
		visitedCities.add("Hyderabad");
		visitedCities.add("Chennai");
		visitedCities.add("Mumbai");
		
		System.out.println("Recently visited cities: ");
		for(String city : visitedCities) {
			System.out.println(city);
		}
		
		String searchCity = "Hyderabad";
		if(visitedCities.contains(searchCity)) {
			System.out.println(searchCity+" was visited.");
		}else {
			System.out.println(searchCity+" was not visited.");
		}
	}

}
