import java.util.*;
public class Day48P1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);

        System.out.println("Value for key 'apple': " + map.get("apple"));

        map.remove("banana");
        System.out.println("After removing 'banana': " + map);

        boolean hasApple = map.containsKey("apple");
        System.out.println("Map contains key 'apple': " + hasApple);

        // 5. containsValue() - Checks if a value is present in the map
        boolean hasValue5 = map.containsValue(5);
        System.out.println("Map contains value 5: " + hasValue5);

        int size = map.size();
        System.out.println("Size of the map: " + size);

        boolean isEmpty = map.isEmpty();
        System.out.println("Map is empty: " + isEmpty);

        Set<String> keys = map.keySet();
        System.out.println("Keys in the map: " + keys);

        Collection<Integer> values = map.values();
        System.out.println("Values in the map: " + values);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Key-Value pairs in the map: ");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        map.clear();
        System.out.println("After clearing the map: " + map);

    }
}
