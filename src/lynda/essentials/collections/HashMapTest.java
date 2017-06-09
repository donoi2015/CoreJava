package lynda.essentials.collections;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	map.put("California", "Sacramento");
	map.put("Oregon", "Salem");
	map.put("Washington", "Olympia");
	System.out.println(map);
	map.put("Alaska", "Juneau");
	System.out.println(map);
	String cap = map.get("Oregon");
	System.out.println("Capitol of Oregon is " + cap);
	
	map.remove("Oregon");
	System.out.println(map);
    }

}
