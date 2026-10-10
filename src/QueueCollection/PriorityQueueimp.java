package QueueCollection;

import java.util.PriorityQueue;

public class PriorityQueueimp {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(10);
        pq.offer(20);
        pq.peek();
        pq.poll();
        pq.remove();
        pq.remove(20);
        pq.contains(20);
        pq.isEmpty();
        pq.clear();
    }
}
