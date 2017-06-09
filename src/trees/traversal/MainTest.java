package trees.traversal;

public class MainTest {

	public static void main(String[] args) {
		MyBST bst = new MyBST();
		int[] input = new int[] { 15, 10, 5, 12, 20, 17, 25 };
		for (int i : input) {
			bst.insert(i);
		}
		System.out.println("InOrder Traversal:");
		bst.printTree();
		System.out.println("\nPreOrder Traversal:");
		bst.printPreTree();
		System.out.println("\nPostOrder Travesal:");
		bst.printPostTree();
		System.out.println("\nCountNodes: " + bst.countNodes());
		System.out.println("CountLeaves: " + bst.countLeaves());
		System.out.println("CountPrimes:" + bst.primeCount());
	}
}