import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {


        // min priority queue
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        System.out.println("Min Priority Queue:");
        minPQ.forEach((Integer val) -> System.out.println(val));

        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("removed element: " + val);
        }


        // max priority queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        System.out.println("Max Priority Queue:");
        maxPQ.forEach((Integer val) -> System.out.println(val));

        while(!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println("removed element: " + val);
        }

    }
}