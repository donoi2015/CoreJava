package datastructures.hashtables.handmade.MyHashTable;

import java.util.Iterator;
import java.util.LinkedList;

class MyHashTable {
	private static final int INITIAL_SIZE = 19;
	private int tableSize;
	private LinkedList[] table;

	public MyHashTable() {
		this(INITIAL_SIZE);
	}

	private MyHashTable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize];
	} // an array of LinkedList objects.

	public void put(Object key, Object value) {
		// disallow null keys
		if (key == null)
			return;
		// get the "big" integer corresponding to the object
		// assume key is not null
		int hashcode = Math.abs(key.hashCode());
		// compress down to a table slot
		int hash = hashM(hashcode);
		// put the value and the key into an Entry object
		// which will be placed in the table in the
		// slot ( namely, hash)
		// allows a null value
		Entry e = new Entry(key, value);
		// now place it in the table
		if (table[hash] == null) {
			table[hash] = new LinkedList();
		}
		// this allows duplicate keys
		table[hash].add(e);
	}

	public Object get(Object key) {
		// null key not allowed
		if (key == null)
			return null;
		// get the "big" integer corresponding to the object
		int hashcode = Math.abs(key.hashCode());
		// compress down to a table slot
		int hash = hashM(hashcode);
		// now look for the desired Entry
		Entry e = null;
		// First we should make sure that table[hash]
		// is Not null. If it is null, then the
		// Entry is not there.
        for (Object o : table[hash]) {
            e = (Entry) o;
            if (e.key.equals(key)) {
                return e.value;
            }
        }
		return null; // Not found.
	}

	public String toString() {
		String n = System.getProperty("line.separator");// a new line
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < table.length; ++i) {
			if (table[i] != null) {
				Iterator it = table[i].iterator();// For the LinkedList at
													// table[i]
				Entry next = null;
				sb.append("hashTable[" + i + "]= ");
				while (it.hasNext()) {
					next = (Entry) it.next();
					sb.append(next);
					sb.append(" ");
				}
				sb.append(n);
			}
		}
		return sb.toString();
	}

	private int hashM(int bigNum) {
		return bigNum % tableSize;
	}

	public int getSize() {
		return tableSize;
	}

	private class Entry {
		private Object key;
		private Object value;

		Entry(Object key, Object value) {
			this.key = key;
			this.value = value;
		}

		public String toString() {
			return "(" + key.toString() + "," + value.toString() + ")";
		}

	}
}
