package lava1;

import java.util.*;

public class LinkedHashSetEg {
	public static void main(String[] args) {
		LinkedHashSet<String> playlist = new LinkedHashSet<>();
		
		playlist.add("Song A");
		playlist.add("Song B");
		playlist.add("Song C");
		playlist.add("Song A");
		
		for(String song : playlist) {
			System.out.println(song);
		}
		
		
	}

}
