import java.util.Scanner;

class BST {
	int data;
	BST left;
	BST right;
	BST(int data) {
		this.data = data;
	}
}

public class BSTOperations {
	
	BST root;
	
	BST insert(BST root, int data) {
		if(this.root == null) {
			this.root = new BST(data);
			return root;
		}
		if(data < root.data) {
			root.left = insert(root.left, data);
		}
		else if(data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}
	
//	Scanner scanner = new Scanner(System.in);
//	int data;
//	
//	void input() {
//		do {
//			System.out.println("Enter the data :: ");
//			data = scanner.nextInt();
//			if(data == -1) {
//				break;
//			}
//			root = insert(root, data);
//		} while(data != 1);
//	}
	
	void inputArray() {
		int arr[] = {10,20,25,18,7,5,4};
		for(int data : arr) {
			root = insert(root, data);
		}
		inorder(root);
	}
	
	// Printing BST
	void inorder(BST root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	void print() {
		inorder(root);
	}
	
	int minValue(BST root) {
		int minv = root.data;
		while(root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
	
	int maxValue(BST root) {
		int maxv = root.data;
		while(root.right != null) {
			maxv = root.right.data;
			root = root.right;
		}
		return maxv;
	}
	
	void addNode(BST root, int data) {
		if(data > root.data) {
			if(root.right == null) {
				BST node = new BST(data);
				node.data = data;
				root.right = node;
			}
			else {
				addNode(root.right, data);
			}
		}
		else {
			if(root.left == null) {
				BST node = new BST(data);
				node.data = data;
				root.left = node;
			}
			else {
				addNode(root.left, data);
			}
		}
	}
	
	void remove(BST currentNode, BST parentNode, boolean isLeft, int data) {
		if(data > currentNode.data) {
			remove(currentNode.right, currentNode, false, data);
		}
		else if(data < currentNode.data) {
			remove(currentNode.left, currentNode, true, data);
		}
		else {
			/*
			 * There are 4 cases when we delete a node
			 * Case 1 : left child and right child both are null
			 * Case 2 : left child is null but right child is not null
			 * Case 3 : left child is not null but right child is null
			 * Case 4 : left and right child both are not null
			 */
			
//			Case 1
			if(currentNode.left == null && currentNode.right == null) {
				if(isLeft) {
					parentNode.left = null;
				}
				else {
					parentNode.right = null;
				}
			}
			
//			Case 2
			if(currentNode.left == null && currentNode.right != null) {
				if(isLeft) {
					parentNode.left = currentNode.right;
				}
				else {
					parentNode.right = currentNode.right;
				}
			}
			
//			Case 3
			if(currentNode.left != null && currentNode.right == null) {
				if(isLeft) {
					parentNode.left = currentNode.left;
				}
				else {
					parentNode.right = currentNode.left;
				}
			}
			
//			Case 4
			if(currentNode.left != null && currentNode.right != null) {
				int max = this.maxValue(currentNode.left);
				System.out.println("Left max is : " + max);
				currentNode.data = max;
				remove(currentNode.left, currentNode, true, max);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTOperations obj = new BSTOperations();
//		obj.input();
		obj.inputArray();
//		obj.print();

	}

}
