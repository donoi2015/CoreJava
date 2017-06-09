package trees;

import java.util.ArrayList;

public class EmployeeBST {
	/** The tree root. */
	private Employee root;

	// start with an empty tree
	private EmployeeBST() {
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

	private int size(Employee node) {
		if (node == null)
			return (0);
		else {
			return (size(node.left) + 1 + size(node.right));
		}
	}

	private void printTree(Employee t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.salary + " ");
			printTree(t.right);
		}
	}

	private ArrayList<Integer> printToList() {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null)
			System.out.println("Empty tree");
		else
			printToList(root, list);
		return list;
	}

	private void printToList(Employee t, ArrayList<Integer> list) {
		if(t!=null){
			printToList(t.left,list);
			list.add(t.salary);
			printToList(t.right,list);
		}
	}

	private boolean find(Integer x) {
		return x != null && find(x, root);
	}

	private boolean find(Integer x, Employee n) {
		if (n == null)
			return false;
		return n != null && n.salary == x || ((x.compareTo(n.salary) < 0) ? find(x, n.left) : find(x, n.right));
// return find(x,n.left) || find(x,n.right);
	}

	private void insert(Integer x) {
		if (root == null) {
			root = new Employee(null, x, null, null);
		} else {
			Employee n = root;
			boolean inserted = false;
			while (!inserted) {
				if (x.compareTo(n.salary) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new Employee(null, x, null, null);
						inserted = true;
					} else {
						n = n.left;
					}
				}

				else if (x.compareTo(n.salary) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new Employee(null, x, null, null);
						inserted = true;
					} else {
						n = n.right;
					}
				}

			}

		}
	}
	
	public static void main(String[] args) {
		EmployeeBST bst = new EmployeeBST();
		for (int i = 15; i >= 0; --i) {
			bst.insert(2 * i);
			bst.insert(2 * i - 5);
		}
		bst.printTree();
		System.out.println("Size: " + bst.size());
		System.out.println("Is 24 in the tree? " + bst.find(24));
		System.out.println("Is 27 in the tree? " + bst.find(27));
		ArrayList<Integer> list = bst.printToList();
		
		for(int x:list){
			System.out.print(x+", ");
		}
	}

	private class Employee implements Comparable<Employee>{
		
		private String name;
		private int salary;
		private Employee left;
		private Employee right;
		
		// Constructors
		Employee(int salary) {
			this(null, salary, null, null);
		}

		Employee(String name, int salary, Employee left, Employee right) {
			this.name = name;
			this.salary = salary;
			this.left = left;
			this.right = right;
		}

		@Override
		public boolean equals(Object aObj) {
			if(aObj == null || getClass()!=aObj.getClass()) return false;
			Employee a = (Employee) aObj;
			return (this.salary == a.salary);
		}

		@Override
		public int compareTo(Employee aO) {
			int sal2 = aO.salary;
			return salary - sal2;
		}
		

	}
}