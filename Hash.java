
import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("apple", 5);
        map.put("banana", 3);
        map.put("orange", 4);

        // Retrieve a value using its key
        int value = map.get("banana");
        System.out.println("banana: " + value); // Output: "banana: 3"

        // Check if a key is in the map
        boolean containsKey = map.containsKey("apple");
        System.out.println("Contains key 'apple': " + containsKey); // Output: "Contains key 'apple': true"

        // Remove a key-value pair
        map.remove("orange");

        // Iterate over the key-value pairs in the map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
