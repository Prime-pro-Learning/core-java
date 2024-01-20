package com.corejava;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        IntegerComparator comparator=new IntegerComparator();
        PriorityQueue<Integer> queue=new PriorityQueue<>(25);
        queue.add(45);
        queue.add(36);
        queue.add(102);
        queue.add(48);
        System.out.println(queue);

    }
}
