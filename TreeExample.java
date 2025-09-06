package lava1;

class Node{
	String data;
	Node left,right;
	
	Node(String data){
		this.data=data;
		left=right=null;
	}
}

public class TreeExample {

	public static void main(String[] args) {
		Node root=new Node("Root");
		root.left=new Node("Left Child");
		root.right=new Node("Right Child");
		
		System.out.println("Root Node: "+root.data);
		System.out.println("Left Child: "+root.left.data);
		System.out.println("Right Child: "+root.right.data);
		
		
	}

}
