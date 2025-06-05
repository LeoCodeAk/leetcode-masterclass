package org.example.ArraysAndHashing.Medium.Notes;

import java.util.PriorityQueue;

public class PrioerityQueueExplained {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.add(10);
        pq.add(5);
        pq.add(20);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println("------------------------------");
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) -> b-a);
        pq2.add(10);
        pq2.add(20);
        pq2.add(30);
        System.out.println(pq2);
        pq2.poll();
        System.out.println(pq2);
    }
}
