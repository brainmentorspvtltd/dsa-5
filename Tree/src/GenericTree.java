import java.util.ArrayList;
import java.util.Scanner;

class Node {
	int data;
	ArrayList<Node> children;
	Node(int data) {
		this.data = data;
		children = new ArrayList<Node>();
	}
	public String toString() {
		return String.valueOf(data);
	}
}

public class GenericTree {
	Scanner scanner = new Scanner(System.in);
	
	/*
	 * Add nodes in tree in depth wise manner
	 */
	public Node add() {
		System.out.println("Enter the data : ");
		int data = scanner.nextInt();
		Node parentNode = new Node(data);
		System.out.println("Enter number of child of : " + data);
		int children = scanner.nextInt();
		for(int i = 1; i <= children; i++) {
			Node child = add();
			parentNode.children.add(child);
		}
		return parentNode;
	}
	
	public void print(Node root) {
		System.out.print(root.data + " => ");
//		for(int i = 0; i < root.children.size(); i++) {
//			System.out.print(root.children.get(i) + ", ");
//		}
		
		for(Node child : root.children) {
			System.out.print(child + ", ");
		}
		
		System.out.println();
		
		for(Node child : root.children) {
			print(child);
		}
		
	}
	
	/*
	 * find the largest node in a tree
	 */
	public int max(Node root) {
		if(root == null) {
			return 0;
		}
		int result = root.data;
		for(Node child : root.children) {
			int currentValue = max(child);
			if(currentValue > result) {
				result = currentValue;
			}
		}
		return result;
	}
	
	/*
	 * Find height of tree
	 */
	public int height(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.children.size() == 0) {
			return 1;
		}
		int maxDepth = 0;
		for(Node child : root.children) {
			int currentHeight = height(child);
			maxDepth = Math.max(maxDepth, currentHeight);
		}
		return maxDepth + 1;
	}
	
	/*
	 * Count number of nodes
	 */
	
	/*
	 * Count number of leaf nodes
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTree obj = new GenericTree();
		Node root = obj.add();
		obj.print(root);
	}

}
