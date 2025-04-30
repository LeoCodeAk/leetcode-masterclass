package org.example.ArraysAndHashing.Medium;

import java.util.HashMap;
import java.util.Map;

public class HashMapExplained {
    public static void main(String[] args) {
        //Hashmaps are Key value pairs.. Key are unique identifiers to the values
        HashMap<String, Integer> map = new HashMap<>();
        //.put() method allows us to add key value to the HashMap
        map.put("Apple", 5);
        map.put("Banana", 10);
        map.put("Apple", 15);

        System.out.println(map);

        //.get() method retrives the VALUE of the specified key, returns null if key is not found
        System.out.println(map.get("Apples"));

        //containsKey() and containsValue() checks if the map contains a specific key or value returns a boolean
        System.out.println(map.containsValue(3));

        //putIfAbsent(K key, V value) method inserts key-value pair if ONLY the key is not already present
        map.putIfAbsent("Grapes", 40);
        map.putIfAbsent("Apple", 100);
        System.out.println(map);
        //remove() method removes key-value pair for a specified key
        //replace() method replaces the value for a key ONLY if it already exists
        map.replace("Apple", 100);
        System.out.println(map);

        //size() returns number of key-value pair in the map
        System.out.println(map.size());

        //keySet() method returns a SET of all the keys
        for(String key: map.keySet()) {
            System.out.println(key);
        }

        //values() returns a collection of all the values
        for(Integer value: map.values()) {
            System.out.println(value);
        }

        //entrySet() returns a SET of all key-value pairs as Map.Entry objects. Useful for iterating over the map
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
