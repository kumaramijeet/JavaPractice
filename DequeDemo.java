import java.util.ArrayDeque;

public class DequeDemo{
    public static void main(String[] args) {
        
        //using array deque as queue
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(5);
        deque.add(10);

        int element = deque.removeFirst();
        System.out.println("removed element: " + element);

    }
}