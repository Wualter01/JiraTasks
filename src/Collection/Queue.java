package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {

        /* Queue<String> q=new Queue<String> (); Queue is interface
        Queue (I):
        does not have index number
        size dynamic , it accepts duplicates,
        first in first out order.
        Pool() Poll(): removes the first object in the queue.

         */

        java.util.Queue<Integer> numbers= new PriorityQueue<>();
        //first in first out (FIFO)
        //will sort in queue logic
        //it is not always going to sort from small to large
        //it has own sort logic

        numbers.add(20);
        numbers.add(20);
        numbers.add(12);
        numbers.add(2);
        numbers.add(1);
        numbers.add(11);
        numbers.add(200);
        numbers.add(15);
        numbers.add(3);

        System.out.println(numbers);//does not keep insertion order

        //logic for printing left right root
        //it take smaller numbers and adds them to the left and greater numbers to the right

        //Pool() Poll(): removes the first object in the queue.
        Integer num = numbers.poll();
        System.out.println("num = " + num);//1 was removed

        System.out.println(numbers);

        java.util.Queue<Integer> numbers2= new ArrayDeque<>(); //FIFO
        numbers2.add(20);
        numbers2.add(20);
        numbers2.add(12);
        numbers2.add(2);
        numbers2.add(1);
        numbers2.add(11);
        numbers2.add(200);
        numbers2.add(15);
        numbers2.add(3);

        System.out.println(numbers2);

        Integer num2=numbers2.poll();
        System.out.println("num2 = " + num2);
        System.out.println(numbers2);
    }
}
