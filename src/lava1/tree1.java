package lava1;

import java.util.*;

class Node1{
	String data;
	Node1 left,right;
	
	
	Node1(String data){
		this.data=data;
		left=right=null;
	}
}

public class tree1 {

	public static void main(String[] args) {
		Node1 root=new Node1("Root");
		root.left=new Node1("Left Child");
		root.right=new Node1("Right Child");
		
		System.out.println("Root Node: "+root.data);
		System.out.println("Left Child: "+root.left.data);
		System.out.println("Right Child: "+root.right.data);
		

	}

}
