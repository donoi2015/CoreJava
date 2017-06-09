package misc.PrintArrayOfObjects;

/** Class for storing high scores in an array in non-decreasing order. */
class Scores {
	private static final int maxEntries = 10; // number of high scores we keep
	private int numEntries; // number of actual entries
	private GameEntry[] entries; // array of game entries(names&score)

	/** Default constructor */
	public Scores() {
		entries = new GameEntry[maxEntries];
		numEntries = 0;
	}

	public void add(GameEntry e) {
		int newScore = e.getScore();// is the new entry e really a high score?
		if (numEntries == maxEntries) {
			if (newScore <= entries[numEntries - 1].getScore())
				return; // the new entry, e, is not a high score in this case
		} else
			// the array is not full
			numEntries++;
		// Locate the place that the new (high score) entry e belongs
		int i = numEntries - 1;
		for (; (i >= 1) && (newScore > entries[i - 1].getScore()); i--)
			entries[i] = entries[i - 1];
		entries[i] = e;
	}

	/** Returns a string representation of the high scores list */
	@Override
	public String toString() {
		String s = "[";
		for (int i = 0; i < numEntries; i++) {
			if (i > 0)
				s += ",";// separate entres by commas
			s += entries[i];
		}
		return s + "]";
	}
	// .... methods for updating the set of high scores go here...
}