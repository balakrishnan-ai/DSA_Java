package lava1;

import java.util.PriorityQueue;

public class HeapExample {
	static class Job implements Comparable<Job> {
		String name;
		int priority;
		
		Job(String name,int priority){
			this.name=name;
			this.priority=priority;
		}
		
		public int compareTo(Job other) {
			return Integer.compare(this.priority, other.priority);
		}
	}
	public static void main(String[] args) {
		PriorityQueue<Job> pg=new PriorityQueue<>();
		pg.add(new Job("Email Processing",3));
		pg.add(new Job("Data Backup",1));
		pg.add(new Job("Virus Scan",2));
		
		while(!pg.isEmpty()) {
			Job job=pg.poll();
			System.out.println("Processing: "+job.name+"(Priority: "+job.priority+" )");
		}
	}

}
