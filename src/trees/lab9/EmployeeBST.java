package trees.lab9;

import java.util.ArrayList;
import java.util.List;



public class EmployeeBST {
	/** The tree root. */
	private Node root;

	EmployeeBST(){
		root=null;
	}
	
	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("");
		else
			printTree(root);
	}
	
	public void printRange(int lowerSalary, int upperSalary) {
		Node nLower = smallestNodeGreaterThanEqual(lowerSalary);
		Node nUpper = largestNodeLessThanEqual(upperSalary);
		if(nLower.salary > nUpper.salary) {
			System.out.println("No Employee records match these criteria: salaries between " + lowerSalary +
					" and " + upperSalary);
		} else {
			printRange(nLower, nUpper);
		}
		
	}
	
//	public void altPrintRange(int lowerSalary, int upperSalary) {
//		if(lowerSalary > upperSalary) {
//			System.out.println("No Employee records match these criteria: salaries between " + lowerSalary +
//					" and " + upperSalary);
//		} else {
//			altPrintRange(root, lowerSalary, upperSalary);
//		}
//	
//	}
	
	//this is the easiest way -- no need for aux functions
	@SuppressWarnings("unused")
	private void altPrintRange(Node r, int lower, int upper) {
		if (r != null) {
			altPrintRange(r.left, lower, upper);
			if (lower <=r.salary && r.salary <= upper) printList(r.empList);
			altPrintRange(r.right, lower, upper);
		}
	}
		
	private void printRange(Node s, Node t) {
		List<Node> list =asNodeList(s, t);
		for(Node n : list) {
			printList(n.empList);
		}
		
		
	}
	
	private List<Node> asNodeList(Node s, Node t) {
		if(s == null || t== null) return null;
		if(s.salary > t.salary) return null;
		List<Node> list = new ArrayList<>();
		if(root == null) return list;
		else {
			asNodeList(list, root, s, t);
			return list;
		}
	}
	
	private void asNodeList(List<Node> list, Node r, Node s, Node t) {
		if(r != null) {
			asNodeList(list, r.left, s, t);
			if(s.salary <= r.salary && r.salary <= t.salary) list.add(r);
			asNodeList(list, r.right, s, t);
			
		}
	}
	
	public List<Employee> asList() {
		List<Employee> list = new ArrayList<>();
		if(root == null) return list;
		else {
			asList(list, root);
			return list;
		}
	}
	
	private void asList(List<Employee> list, Node t) {
		if(t != null) {
			asList(list, t.left);
			list.addAll(t.empList);
			asList(list, t.right);
			
		}
		
	}

	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			printList(t.empList);
			printTree(t.right);
		}
	}
	private void printList(List<Employee> l) {
		if(l == null || l.isEmpty()) return;
		StringBuilder sb = new StringBuilder();
		for(Employee e : l) {
			sb.append(e.toString() + " ");
		}
		System.out.println(sb.toString());
		
	}
	
	
	
	public List<Employee> findSalaryList(int salary) {
		return findSalaryList(salary, root);
	}
	private List<Employee> findSalaryList(int salary, Node n){
		if(n == null) return null;
		if(n != null && n.salary == salary) return n.empList;
		return (salary < n.salary) ?
				findSalaryList(salary,n.left) :
				findSalaryList(salary, n.right);	
	}
	
	//returns a new Node if no node for this employee's salary exists yet
	private Node createNewNode(Employee e) {
		List<Employee> newlist = new ArrayList<>();
		newlist.add(e);
		return new Node(e.getSalary(), newlist, null, null);
		
	}

	public void insert(Employee e) {
		if (root == null) {
			root = createNewNode(e);
		}
		else {
			Node n = root;
			boolean inserted = false;
			int newsalary = e.getSalary();
			while(!inserted){
				if(newsalary < n.salary) {
					//space found on the left
					if(n.left == null){
						n.left = createNewNode(e);
						inserted = true;
					}
					else {
						n = n.left;
					}
				}
				
				else if(newsalary > n.salary){ 
					//space found on the right					
					if(n.right==null){
						n.right = createNewNode(e);
						inserted = true;
					}
					else {
						n = n.right;
					}
				}
				
				//new salary is already on the tree
				else {  //newsalary == n.salary
					n.empList.add(e);
					inserted = true;
					
				}
				
			}

		}
	}
	public int smallestSalaryGreaterThanEqual(int target) {
		Node n = smallestNodeGreaterThanEqual(target);
		if(n==null) {
			return -1;
		} else {
			return n.salary;
		}
	}
	public int largestSalaryLessThanEqual(int target) {
		Node n = largestNodeLessThanEqual(target);
		if(n==null) {
			return -1;
		} else {
			return n.salary;
		}
	}
	/**
	 * @return - Returns the node with salary as small as possible, 
	 * but still greater than or equal to target. Implies that if a node has
	 * a value of salary that exactly equals target, then this node is returned. 
	 * 
	 * Algorithm:
	 * Do find algorithm but also store a Node mostRecentRight, initialized to null.
     * If root is bigger than target, store root in mostRecentRight and search left.
     * If root is smaller, go right.
     * Continue searching following the usual find algorithm. 
     * Each time we find a node that is bigger than target, we store it in mostRecentRight.
     * When we encounter last node in search, 3 possibilities.
     * 1. Last node has salary equal to target. Then return this node.
     * 2. Last node is smaller than target. Then return mostRecentRight
     * 3. Last node is larger than target. Then return this last node.
     */
	private Node smallestNodeGreaterThanEqual(int target) {
		if (root == null) {
			return null;
		}
		else {
			Node n = root;
			boolean found = false;
		    Node mostRecentRight = null;
			while(!found){
				if(n.salary == target) {
					return n;
				}
				else if(n.salary > target) {
					mostRecentRight = n;
					if(n.left == null){
						found = true;
						//n.salary is the smallest salary in tree that is bigger than target
						return n;
					}
					else {
						n = n.left;
					}
				}
				
				else { // n.salary < target
										
					if(n.right==null){
						found = true;
						return mostRecentRight;
					}
					else {
						n = n.right;
					}
				}			
			} // end while
		} // end else
		return null;
	}
	/**
	 * @return - Returns the node with salary as large as possible, but still less than or equal to target. 
	 * Implies that if a node has
	 * a value of salary that exactly equals target, then this node is returned. 
	 * 
	 * Algorithm:
	 * Do find algorithm. Store a Node mostRecentLeft, initialized to null.
	 * If root is smaller than target, store root in mostRecentLeft and search right.
	 * If root is bigger, go left.
	 * Continue searching following the usual find algorithm. Each time we find a node that is smaller than target, we store it in mostRecentLeftt.
	 * When we encounter last node in search, 3 possibilities.
	 * 1. Last node has salary equal to target. Then return this node.
	 * 2. Last node is larger  than target. Then return mostRecentLeft
	 * 3. Last node is smaller  than target. Then return this last node.
	 * 
	 */
	private Node largestNodeLessThanEqual(int target) {
		if (root == null) {
			return null;
		}
		else {
			Node n = root;
			boolean found = false;
		    Node mostRecentLeft = null;
			while(!found){
				if(n.salary == target) {
					return n;
				}
				else if(n.salary < target) {
					mostRecentLeft = n;
					if(n.right == null){
						found = true;
						return n;
					}
					else {
						n = n.right;
					}
				}
				
				else { // n.salary > target
										
					if(n.left==null){
						found = true;
						return mostRecentLeft;
					}
					else {
						n = n.left;
					}
				}			
			} // end while
		} // end else
		return null;
	}
	
	public SalaryAndNumber closestTo(int target) {
		Node lower = smallestNodeGreaterThanEqual(target);
		Node upper = largestNodeLessThanEqual(target);
		//one of lower and upper could be null, but not both
		if(lower == null) {
			return new SalaryAndNumber(upper.salary, upper.empList.size());
		} else if(upper == null) {
			return new SalaryAndNumber(lower.salary, lower.empList.size());
		} else {
			int lowSalary = lower.salary;
			int upperSalary = upper.salary;
			if(target - lowSalary < upperSalary - target) {
			    return new SalaryAndNumber(lowSalary, lower.empList.size());
			} else {
				return  new SalaryAndNumber(upperSalary, upper.empList.size());
			}
		}
	}
	


	private class Node {

		// Constructors
		Node(int salary, List<Employee> empList) {
			this(salary, empList, null, null);
		}

		Node(int salary, List<Employee> empList, Node left, Node right) {
			this.salary = salary;
			this.empList = empList;
			this.left = left;
			this.right = right;
		}
		public String toString() {
			return empList.toString();
		}
		private int salary;
		private List<Employee> empList; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}
}