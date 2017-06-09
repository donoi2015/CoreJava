package trees.traversal;

class MyBST {

	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + " ");
			printTree(t.right);
		}
	}

	public void printPreTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printPreTree(root);
	}

	private void printPreTree(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element + " ");
			printPreTree(t.left);
			printPreTree(t.right);
		}
	}

	public void printPostTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printPostTree(root);
	}

	private void printPostTree(BinaryNode t) {
		if (t != null) {
			printPostTree(t.left);
			printPostTree(t.right);
			System.out.print(t.element + " ");
		}
	}

	public int primeCount() {
		return primeCount(root);
	}

	private int primeCount(BinaryNode t) {
		if (t == null)
			return 0;
		if (isPrime(t))
			return 1 + primeCount(t.left) + primeCount(t.right);
		else
			return primeCount(t.left) + primeCount(t.right);
	}

	private static boolean isPrime(BinaryNode t) {
		for (int i = 2; i < t.element; i++) {
			if (t.element % i == 0)
				return false;
		}
		return true;
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted) {
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}
				}
			}

		}
	}

	int countNodes() {
		return countNodes(root);
	}

	private int countNodes(BinaryNode root) {
		if (root == null)
			return 0;
		else {
			int count = 1;
			count += countNodes(root.left);
			count += countNodes(root.right);
			return count;
		}
	}

	int countLeaves() {
		return countLeaves(root);
	}

	private int countLeaves(BinaryNode root) {
		if (root == null) {
			return 0;
		} else if (isLeaf(root)) {
			return 1;
		} else
			return countLeaves(root.left) + countLeaves(root.right);
	}

	private boolean isLeaf(BinaryNode bn) {
		if (bn.right == null && bn.left == null)
			return true;
		return false;
	}

	private class BinaryNode {
		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
	}

}