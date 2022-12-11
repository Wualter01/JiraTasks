package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    //all types of sets are not going to accept duplicates
    //logic for using Set, if i want to print a list of numbers and i want to exclude duplicates i can use set because
    //set does not take duplicates.

    public static void main(String[] args) {
        java.util.Set letters = new HashSet<>();

        //rules for hashSet
        //accepts null values, does not accept duplicates, and has sort logic but it is not always from small to large

        letters.add("a");
        letters.add("a");
        letters.add("c");
        letters.add("e");
        letters.add("b");
        letters.add("d");
        letters.add("d");
        letters.add("a");
        letters.add("x");
        letters.add(null);
        letters.add(null);//even null will only print once
        System.out.println(letters);

        java.util.Set<String> letters2 = new LinkedHashSet<>();
        //linkedHasSet does not accept duplicates, does not sort, and accepts null values

        letters2.add("a");
        letters2.add("a");
        letters2.add("c");
        letters2.add("e");
        letters2.add("b");
        letters2.add("d");
        letters2.add("d");
        letters2.add("a");
        letters2.add("x");
        letters2.add(null);
        letters2.add(null);
        System.out.println(letters2);

        java.util.Set<String> letters3 = new TreeSet<>();
        //TresSet
        //it doesnt accept duplicate values
        // it does not accept null values
        //it is going to sort from small to large

        letters3.add("a");
        letters3.add("a");
        letters3.add("c");
        letters3.add("e");
        letters3.add("b");
        letters3.add("d");
        letters3.add("d");
        letters3.add("a");
        letters3.add("x");

        System.out.println(letters3);//gives nulPointerException due to null values

        //TASK:
        //i want to store list of numbers in one collection type
        //that is not going to accept duplicates
                //also it will sort (from smallest to largest)
        //for this use Set subclass treeSet which has interface sortedSet which sorts for us in our treeSet class

        //TASK: accept duplicate and keep insertion order
        //cant use set because it does not accept duplicate values
        //queue and list both accept duplicates but queue subclass deque is the only one that would work for this
        //situation
        //any in List subclasses would work

        //TASK: //i want to store list of numbers in one collection type that is not going to accept duplicates
        //it will accept one null keyword
        //hashSet and Linked hashSet will work
    }
}
