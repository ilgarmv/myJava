package QUeue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> standartQueue = new PriorityQueue<>();


        standartQueue.add(5);
        standartQueue.add(11);
        standartQueue.add(6);
        standartQueue.add(5);
        standartQueue.add(4);
        standartQueue.add(1);
        standartQueue.add(9);
        standartQueue.add(7);

        while (!standartQueue.isEmpty()) {
            System.out.println(standartQueue.poll());
        }

        System.out.println("==================================================================");

        PriorityQueue<Integer> descendingQueue = new PriorityQueue<>(Comparator.reverseOrder());

        descendingQueue.add(5);
        descendingQueue.add(11);
        descendingQueue.add(6);
        descendingQueue.add(5);
        descendingQueue.add(4);
        descendingQueue.add(1);
        descendingQueue.add(9);
        descendingQueue.add(7);

        System.out.println("bigger" + descendingQueue.peek());

        while (!descendingQueue.isEmpty()) {
            System.out.println(descendingQueue.poll());
        }
    }
}
