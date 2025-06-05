package org.example.ArraysAndHashing.Medium.TopKFrequentElementsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        //Given an array of integers and value k, we need to return the k most frequent elements
        // nums = [1,1,2,2,2,3] , k=2 should reutnr [2,1]

        //Count frequency. If number is already in map, increase its count by 1 if not set it to 1
        Map<Integer, Integer> countFrequency = new HashMap<>();
        for(int num: nums) {
            countFrequency.put(num,countFrequency.getOrDefault(num, 0) + 1);
        }

        //Priority Queue (Heap); is like a QUEUE (First In First out), but elements are dequeued in priority order.
        //Uses min-heap, meaning smallest frequency comes to top
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry : countFrequency.entrySet()) {
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size() >k) {
                heap.poll();
            }
        }

        //Extract the results
        int[] res = new int[k];
        for(int i =0; i < k; i++) {
            res[i] = heap.poll()[1];
        }
            return res;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums) {
            freqMap.put(num,freqMap.getOrDefault(num,0) + 1);
        }
        System.out.println(freqMap);

        PriorityQueue<Map.Entry<Integer,Integer>> miniHeap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            miniHeap.offer(entry);
            if(miniHeap.size() >nums.length ) {
                miniHeap.poll();
            }
        }
    }
}
