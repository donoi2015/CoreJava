package trees.BST;

class Employee {
	private String name;
	private int id;

	public Employee(String aName, int aId) {
		name = aName;
		id = aId;
	}

	@Override
	public String toString() {
		return "name: " + name + " id: " + id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String aName) {
		name = aName;
	}

	public void setId(int aId) {
		id = aId;
	}
}
