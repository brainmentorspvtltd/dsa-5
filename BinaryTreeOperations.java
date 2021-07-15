import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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
	
	public void postOrderIter(BinaryTree<Integer> root) {
		Stack<BinaryTree> stack = new Stack<BinaryTree>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root == null) {
			return;
		}
		stack.push(root);
		BinaryTree<Integer> prev = null;
		while(!stack.isEmpty()) {
			BinaryTree<Integer> currentNode = stack.peek();
			if(prev == null || prev.left == currentNode || prev.right == currentNode) {
				if(currentNode.left != null) {
					stack.push(currentNode.left);
				}
				else if(currentNode.right != null) {
					stack.push(currentNode.right);
				}
				else {
					stack.pop();
					list.add(currentNode.data);
				}
			}
			else if(currentNode.left == prev) {
				if(currentNode.right != null) {
					stack.push(currentNode.right);
				}
				else {
					stack.pop();
					list.add(currentNode.data);
				}
			}
			else if(currentNode.right == prev) {
				stack.pop();
				list.add(currentNode.data);
			}
			prev = currentNode;
		}
		
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
	
	class Pair<T> {
		BinaryTree<T> node;
		int level;
		Pair(BinaryTree<T> node, int level) {
			this.node = node;
			this.level = level;
		}
	}
	
	// BFT
	void verticalOrderIter(BinaryTree<Integer> root) {
		LinkedList<Pair<Integer>> queue = new LinkedList<BinaryTreeOperations.Pair<Integer>>();
		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		queue.add(new Pair<Integer>(root, 0));
		int minDist = 0, maxDist = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size > 0) {
				Pair<Integer> pair = queue.removeFirst();
				minDist = Math.min(minDist, pair.level);
				maxDist = Math.max(maxDist, pair.level);
				
				map.putIfAbsent(pair.level, new ArrayList<Integer>());
				map.get(pair.level).add(pair.node.data);
				
				if(pair.node.left != null) {
					queue.add(new Pair<Integer>(pair.node.left, pair.level - 1));
				}
				else if(pair.node.right != null) {
					queue.add(new Pair<Integer>(pair.node.right, pair.level + 1));
				}
				size--;
				
//				if(map.get(pair.level) == null) {
//					List<Integer> list = new ArrayList<Integer>();
//					list.add(pair.node.data);
//					map.put(pair.level, list);
//				}
//				else {
//					List<Integer> list = map.get(pair.level);
//					list.add(pair.node.data);
//					map.put(pair.level, list);
//				}
				
			}
		}
		for(int i = minDist; i <= maxDist; i++) {
			System.out.println(i + " " + map.get(i));
		}
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
			System.out.println(m.getKey() + " : " + m.getValue().get(m.getValue().size() - 1));
		}
	}
	
	public void diagonalView(BinaryTree<Integer> root) {
		LinkedList<BinaryTree<Integer>> queue = new LinkedList<BinaryTree<Integer>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size > 0) {
				BinaryTree<Integer> current = queue.removeFirst();
				while(current != null) {
					System.out.println(current.data + ", ");
					if(current.left != null) {
						queue.addLast(current.left);
					}
					current = current.right;
				}
				System.out.println();
			}
		}
	}
	
	private void printLeftBoundary(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		if(root.left != null) {
			System.out.println(root.data);
			printLeftBoundary(root.left);
		}
		else if(root.right != null) {
			System.out.println(root.data);
			printLeftBoundary(root.right);
		}
	}
	
	private void printRightBoundary(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		if(root.right != null) {
			System.out.println(root.data);
			printRightBoundary(root.right);
		}
		else if(root.left != null) {
			System.out.println(root.data);
			printRightBoundary(root.left);
		}
	}
	
	private void printLeaf(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		printLeaf(root.left);
		if(root.left == null && root.right == null) {
			System.out.print(root.data);
		}
		printLeaf(root.right);
	}
	
	public void printBoundary(BinaryTree<Integer> root) {
		System.out.println(root.data);
		printLeftBoundary(root.left);
		System.out.println();
		printLeaf(root);
		System.out.println();
		printRightBoundary(root.right);
	}
	
	boolean isCorrectSum(BinaryTree<Integer> root) {
		if(root == null) {
			return true;
		}
		if(root.left == null && root.right == null) {
			return true;
		}
		int sum = 0;
		if(root.left != null) {
			sum += root.left.data;
		}
		if(root.right != null) {
			sum += root.right.data;
		}
		
		return (root.data == sum && isCorrectSum(root.left) && isCorrectSum(root.right));	
	}
	
	public int isBalanced(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftH = isBalanced(root.left);
		if(leftH == -1) {
			return -1;
		}
		int rightH = isBalanced(root.right);
		if(rightH == -1) {
			return -1;
		}
		if(Math.abs(leftH - rightH) > 1) {
			return -1;
		}
		else {
			return Math.max(leftH, rightH) + 1;
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
		System.out.println("===================");
		obj.bottomView(root);
		System.out.println("===================");
		obj.isBalanced(root);
	}

}
