package lava1;

public class TreeEg {
	static class Node{
		String data;
		Node left,right;
		
		Node(String data){
			this.data = data;
			left = right = null;
		}
	}
	public static void main(String[] args) {
		Node root = new Node("Root Folder");
		root.left = new Node("Documents");
		root.right = new Node("Pictures");
		
		root.left.left = new Node("Resume.docx");
		root.left.right = new Node("Notes.txt");
		
		root.right.left = new Node("Vacation.jpg");
		root.right.right = new Node("Family.png");
		
		System.out.println("Root: "+root.data);
		System.out.println("Left Child: "+root.left.data);
		System.out.println("Right Child: "+root.right.data);
	}

}
