package lynda.advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String, Integer> olives = new HashMap<>();
        olives.put("bla bla", 11);
        olives.put("a2", 22);
        olives.put("a2", 23);
        olives.put("a3", 33);
        System.out.println(olives);
    }
}
