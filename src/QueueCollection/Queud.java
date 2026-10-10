package QueueCollection;

import java.util.*;

public class Queud {
    public static void main(String[] args){
//        LinkedList     Doubly linked list    FIFO when used as a regular queue   Yes
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(60);
        q.remove();
        System.out.println(q.peek());

        System.out.println(q.toString());

        Queue<Integer> q1=new ArrayDeque<>();
    }
}
