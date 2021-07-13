import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Map.Entry;

class BinaryTree<T> {
	T data;
	BinaryTree<T> left;
	BinaryTree<T> right;
	BinaryTree(T data) {
		this.data = data;
		right = left = null;
	}
}

public class BinaryTreeOperations {
	String msg = "root";
	Scanner scanner = new Scanner(System.in);
	static int max_level = 0;
	
	BinaryTree<Integer> insert() {
		System.out.println("Enter the " + msg + " data or enter -1 to exit");
		int data = scanner.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTree<Integer> node = new BinaryTree<>(data);
		msg = "left";
		node.left = insert();
		msg = "right";
		node.right = insert();
		return node;
	}
	
	void print(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data + " => ");
		if(root.left != null) {
			System.out.print(root.left.data + ", ");
		}
		if(root.right != null) {
			System.out.print(root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	
	public void preOrder(BinaryTree<Integer> root) {
		// Root, Left, Right
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void preOrderIter(BinaryTree<Integer> root) {
		Stack<BinaryTree> stack = new Stack<BinaryTree>();
		stack.push(root);
		while(!stack.isEmpty()) {
			BinaryTree<Integer> currentNode = stack.pop();
			System.out.println(currentNode.data);
			if(currentNode.right != null) {
				stack.push(currentNode.right);
			}
			if(currentNode.left != null) {
				stack.push(currentNode.left);
			}
		}
	}
	
	public void preOrderIter2(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		Stack<BinaryTree> stack = new Stack<BinaryTree>();
		BinaryTree<Integer> currentNode = root; 
		while(currentNode != null || !stack.isEmpty()) {
			while(currentNode != null) {
				System.out.println(currentNode.data);
				if(currentNode.right != null) {
					stack.push(currentNode.right);
				}
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			
		}
	}
	
	public void inOrder(BinaryTree<Integer> root) {
		// Left, Root, Right
		if(root == null) {
			return;
		}
		preOrder(root.left);
		System.out.println(root.data);
		preOrder(root.right);
	}
	
	public void inOrderIter(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		Stack<BinaryTree> stack = new Stack<BinaryTree>();
		BinaryTree<Integer> currentNode = root; 
		while(currentNode != null || !stack.isEmpty()) {
			while(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			System.out.println(currentNode.data);
			currentNode = currentNode.right;
			
		}
	}
	
	public void postOrder(BinaryTree<Integer> root) {
		// Left, Right, Root
		if(root == null) {
			return;
		}
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data);
	}
	
	public void postOrderIter() {
		
	}
	
	public void levelOrder(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTree<Integer> currentNode = queue.removeFirst();
			System.out.print(currentNode.data + ", ");
			if(currentNode.left != null) {
				queue.addLast(currentNode.left);
			}
			if(currentNode.right != null) {
				queue.addLast(currentNode.right);
			}
			System.out.println();
		}
	}
	
	public void levelOrderPrintBetter(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()) {
//			BinaryTree<Integer> currentNode = queue.removeFirst();
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
				System.out.print(currentNode.data + ", ");
				if(currentNode.left != null) {
					queue.addLast(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.addLast(currentNode.right);
				}
			}
			
			System.out.println();
		}
	}
	
//	public void leftView(BinaryTree<Integer> root, int level) {
//		if(root == null) {
//			return;
//		}
//		if(max_level < level) {
//			System.out.println(root.data);
//			max_level = level;
//		}
//		leftView(root.left, level+1);
//		leftView(root.right, level+1);
//	}
	
	public void leftView(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()) {
//			BinaryTree<Integer> currentNode = queue.removeFirst();
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
				if(i == 0) {
					System.out.print(currentNode.data + ", ");
				}
				if(currentNode.left != null) {
					queue.addLast(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.addLast(currentNode.right);
				}
			}
			System.out.println();
		}
	}
	
//	public void rightView(BinaryTree<Integer> root, int level) {
//		if(root == null) {
//			return;
//		}
//		if(max_level < level) {
//			System.out.println(root.data);
//			max_level = level;
//		}
//		rightView(root.right, level+1);
//		rightView(root.left, level+1);
//	}
	
	public void rightView(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()) {
//			BinaryTree<Integer> currentNode = queue.removeFirst();
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
				if(i == size-1) {
					System.out.print(currentNode.data + ", ");
				}
				if(currentNode.left != null) {
					queue.addLast(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.addLast(currentNode.right);
				}
			}
			System.out.println();
		}
	}
	
	public void printVerticalOrder(BinaryTree<Integer> root) {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		int distance = 0;
		verticalOrder(root, distance, map);
		for(Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}
	
	public void verticalOrder(BinaryTree<Integer> root, int distance,
			TreeMap<Integer, ArrayList<Integer>> map) {
		if(root == null) {
			return;
		}
		if(map.get(distance) == null) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(root.data);
			map.put(distance, list);
		}
		else {
			ArrayList<Integer> list = map.get(distance);
			list.add(root.data);
			map.put(distance, list);
		}
		verticalOrder(root.left, distance-1, map);
		verticalOrder(root.right, distance+1, map);
	}
	
	public void topView(BinaryTree<Integer> root) {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		int distance = 0;
		verticalOrder(root, distance, map);
		for(Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue().get(0));
		}
	}
	
	public void bottomView(BinaryTree<Integer> root) {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		int distance = 0;
		verticalOrder(root, distance, map);
		for(Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue().get(0));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperations obj = new BinaryTreeOperations();
		BinaryTree<Integer> root = null;
		root = obj.insert();
		obj.print(root);
		System.out.println("===================");
//		obj.levelOrder(root);
		obj.levelOrderPrintBetter(root);
		System.out.println("===================");
		obj.leftView(root);
		System.out.println("===================");
		obj.rightView(root);
		System.out.println("===================");
		obj.printVerticalOrder(root);
		System.out.println("===================");
		obj.topView(root);
	}

}
