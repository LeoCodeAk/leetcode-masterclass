package org.example.ArraysAndHashing.Medium;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        //Anagrams will become identical strings when sorted.
        //Use Hashmap to group anagrams. Sorted string serves as the key and value is a list of original strings that match the key
        //Iterate over arrays.

        //Create hashmap to store sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        //Iterate through each string in input array
        for(String str: strs) {
            //Sort the string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            //ADd the original string to the map
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());


    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat", " ", "tea"};

        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
    }

}
