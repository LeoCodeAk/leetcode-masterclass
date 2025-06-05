package org.example.ArraysAndHashing.Medium.TopKFrequentElementsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsV2 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        //Priority Queue
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        for(Map.Entry entry : map.entrySet()) {
            pq.add(entry);
        }
        int[] output = new int[k];
        for(int i = 0; i < k; i++) {
            output[i] = pq.poll().getKey();
        }
        return output;

    }

    public static void main(String[] args) {

        int[] nums = { 1,1,1,2,2,3};
        int k =2;
        int[] result = topKFrequent(nums,k);

        System.out.println("Top " + k + " frequent elements are: " + Arrays.toString(result));
    }
}
