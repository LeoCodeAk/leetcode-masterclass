package org.example.ArraysAndHashing.Medium;

import java.util.Arrays;

public class GroupAnagramsV2 {
    public static void main(String[] args) {
        String[] myString = {"tea","bag", "aet", "eat"};

        for(String s : myString) {
            char[] myChar = s.toCharArray();
            Arrays.sort(myChar);
            String sortedString = new String(myChar);
            System.out.print(sortedString + " ");
        }
    }
}
