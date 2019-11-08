package part1.week2.assignment;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt("3");
        RandomizedQueue<String> q = new RandomizedQueue<>();

        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("v");

        for (int i = 0; i < k; i++) {
            StdOut.println(q.dequeue());
        }

        q.enqueue("eg");
        q.enqueue("eg");

        StdOut.println(q.dequeue());

        StdOut.println(q.dequeue());

        /*
        Iterator<String> iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-=======================");

        Deque<Integer> deque = new Deque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);
        deque.addFirst(8);
        deque.addFirst(9);
        deque.addFirst(10);

        System.out.println("Deque start");
        Iterator<Integer> iter12 = deque.iterator();
        while (iter12.hasNext()) {
            System.out.println(iter12.next());
        }
        System.out.println("Deque end");


        RandomizedQueue<String> q11 = new RandomizedQueue<>();
        q11.enqueue("wf");
        q11.enqueue("gfhghg");
        q11.enqueue("gfjgj");
        q11.enqueue("guytyr");
        q11.dequeue();
        System.out.println(q11.size());
        q11.dequeue();
        q11.dequeue();
        q11.enqueue("gjrg");
        q11.enqueue("grjg");
        q11.enqueue("gjrg");
        q11.enqueue("gjrg");
        q11.enqueue("grjg");
        System.out.println(q11.size());
        //deque.addFirst(2);
        //deque.removeFirst();

        Iterator<String> iterator2 = q11.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
            //iterator2.remove();
        }
        //iterator2.next();*/
    }
}
