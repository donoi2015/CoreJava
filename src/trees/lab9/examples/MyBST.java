package trees.lab9.examples;

import java.util.Arrays;

public class MyBST {
	/** The tree root. */
	private Node root;

	// start with an empty tree
    private MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
    private void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private int size() {
		return (size(root));
	}

	private int size(Node node) {
		if (node == null)
			return (0);
		else {
			return (size(node.left) + 1 + size(node.right));
		}
	}
	
	private Node smallestGreaterThanEqual(int num){
		if (root == null) return null;
		return smallestGreaterThanEqual(root, num);
	}
	private Node smallestGreaterThanEqual(Node t, int num){
		if (t!=null){
			smallestGreaterThanEqual(t.left,num);
			if(t.element<num) return t;
			smallestGreaterThanEqual(t.right, num);
		}
		return null;
	}
	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + " ");
			printTree(t.right);
		}
	}

	private int[] printToArray() {
		int[] x = new int[size()];
		if (root == null)
			System.out.println("Empty tree");
		else
			printToArray(root, x, 0);
		return x;
	}

	private void printToArray(Node t, int[] x, int i) {
		if (t.left!=null){
			printToArray(t.left, x, i);
		}
			x[i] = t.element;
			i++;
		if(t.right!=null){
			printToArray(t.right, x, i);
		}
	}

	private boolean find(Integer x) {
        return x != null && find(x, root);
    }

	private boolean find(Integer x, Node n) {
        if (n == null)
            return false;
        return n != null && n.element.equals(x) || ((x.compareTo(n.element) < 0) ? find(x, n.left) : find(x, n.right));
// return find(x,n.left) || find(x,n.right);
    }

	private void insert(Integer x) {
		if (root == null) {
			root = new Node(x, null, null);
		} else {
			Node n = root;
			boolean inserted = false;
			while (!inserted) {
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new Node(x, null, null);
						inserted = true;
					} else {
						n = n.left;
					}
				}

				else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new Node(x, null, null);
						inserted = true;
					} else {
						n = n.right;
					}
				}

			}

		}
	}

	public static void main(String[] args) {
		MyBST bst = new MyBST();
		for (int i = 15; i >= 0; --i) {
			bst.insert(2 * i);
			bst.insert(2 * i - 5);
		}
		bst.printTree();
		System.out.println("Size: " + bst.size());
		System.out.println("Is 24 in the tree? " + bst.find(24));
		System.out.println("Is 27 in the tree? " + bst.find(27));
		System.out.println(Arrays.toString(bst.printToArray()));
		System.out.println(bst.smallestGreaterThanEqual(7));
	}

	private class Node {

		// Constructors
		Node(Integer theElement) {
			this(theElement, null, null);
		}

		Node(Integer element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
		
		
		@Override
		public String toString() {
			return element.toString();
		}



		private Integer element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}
}