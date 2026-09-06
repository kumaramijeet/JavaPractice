import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Iterator;

public class IterableDemo{
    public static void main(String[] args){

        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        
        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        values.forEach((Integer value) -> System.out.println(value));


        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(50);
        queue.add(60);
        queue.add(70);
        
    }
}