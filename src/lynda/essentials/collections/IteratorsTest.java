package lynda.essentials.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class IteratorsTest {

    public static void main(String[] args) {
	ArrayList<String> last = new ArrayList<>();
	last.add("Oregon");
	last.add("Washington");
	last.add("California");
	System.out.println(last);
        for (String string : last) {
            System.out.println(string);
        }
	HashMap<String, String> hmap = new HashMap<>();
	hmap.put("Oregon", "Salem");
	hmap.put("Washington", "Olympia");
	hmap.put("Californa", "Sacramento");
	System.out.println(hmap);
	Set<String> keys= hmap.keySet();
        for (String string : keys) {
            System.out.println("The capitol of: " + string + " is " + hmap.get(string));
        }
    }

}
