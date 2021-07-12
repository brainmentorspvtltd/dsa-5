import java.util.Scanner;

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
	
	BinaryTree<Integer> insert() {
		System.out.println("Enter the " + msg + " data");
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
	
	public void inOrder(BinaryTree<Integer> root) {
		// Left, Root, Right
		if(root == null) {
			return;
		}
		preOrder(root.left);
		System.out.println(root.data);
		preOrder(root.right);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperations obj = new BinaryTreeOperations();
		BinaryTree<Integer> root = null;
		root = obj.insert();
		obj.print(root);
	}

}
