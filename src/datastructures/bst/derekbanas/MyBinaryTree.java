package datastructures.bst.derekbanas;

public class MyBinaryTree {

	private Node root;

	private void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	private void inOrderTraverse(Node focusNode) {
		if (focusNode != null) {
			inOrderTraverse(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverse(focusNode.rightChild);
		}
	}

	private void PreOrderTraverse(Node focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			PreOrderTraverse(focusNode.leftChild);
			PreOrderTraverse(focusNode.rightChild);
		}
	}

	private void PostOrderTraverse(Node focusNode) {
		if (focusNode != null) {
			PostOrderTraverse(focusNode.leftChild);
			PostOrderTraverse(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}

	public static void main(String[] args) {
		MyBinaryTree mbt = new MyBinaryTree();
		mbt.addNode(10, "Carl");
		mbt.addNode(5, "John");
		mbt.addNode(7, "Mary");
		mbt.addNode(3, "Mike");
		mbt.addNode(15, "Ross");
		mbt.addNode(12, "Harvey");
		mbt.addNode(17, "Louis");
		System.out.println("InOrder traverse");
		mbt.inOrderTraverse(mbt.root);
		System.out.println("PreOrder traverse");
		mbt.PreOrderTraverse(mbt.root);
		System.out.println("PostOrder traverse");
		mbt.PostOrderTraverse(mbt.root);
	}

	class Node {
		int key;
		String name;

		Node leftChild;
		Node rightChild;

		Node(int aKey, String aName) {
			key = aKey;
			name = aName;
		}

		public String toString() {
			return name + " has a key " + key;
		}
	}
}
