package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List<I extends Number> {
    //Data structures in java:
    //collection (dynamic) arrayList being part of collection
    //Array
    //Map

    //  //list is parent of arraylist linkedlist and the vector
    //    //list is an interface its not class so you cant create object from list
    //    //
    //    //        Collection (I) : extended by List(I),Set(I),Queue(I)
    ////
    ////        Lıst(I): implemented by ArrayList(C),LınkedList(C),Vector(C)
    ////
    ////        ArrayList(C): Internally uses array, singly linked
    ////                Singly linked == retrieving is faster (get)
    ////
    ////        LinkedList(C): each object are doubly linked.
    ////                Doubly linked == removing adding functions are faster
    ////
    ////        Vector(C): array based class, is synchronized  ,only prefer in multi thread
    ////              Synchronized: used for achieving thread-safety
    ////                      adv=thread safe
    ////                      disadv= slower
    ////                 thread: process of operating system scheduling object
    ////             --extended by Stack(C) : array based class ,is synchorized,last in first out order
    ////        pop(): LIFO, returns the last object from the stack and removes it from stack
    //
    //
    //    //list general points ;
    //    //1.List are allowing duplicates objects
    //    //2.order : list will keep the insertion sequence.
    //    //3null elements : list will allow you to use any number of null elements;
    //    //4.list has dynamic size
    public static void main(String[] args) {

       // List<Integer> numberList= new List<Integer>(){}
        //since list is an interface i cannot create an object

        java.util.List<Integer> numberList = new ArrayList<>();//we used polymorphism to change the form of our
        //interface using child class ArrayList
        System.out.println(numberList);//remember when using ArrayList you don't need toString method to print
        numberList.add(25);
        System.out.println(numberList);//list is dynamic so size is not set
        numberList.add(25);//in List duplicates are allowed
        System.out.println(numberList);

        ArrayList<String> words = new ArrayList<>();//since it is a class i can create the object
        words.add("hello mate");
        words.add("Jarva");
        words.add("hello");
        words.add(null);
        words.add(null);
        words.add(null);//in List null value is allowed. list values are printed in sequence added


        System.out.println(words);

        java.util.List<Integer> list2 = new LinkedList<>();//linked list is child class or subclass of arrayList
        //and interface List
        list2.add(20);
        list2.add(10);
        list2.add(20);
        list2.add(15);
        list2.add(15);

        System.out.println(list2); //linkedList keeps the same rules as above for list
        list2.remove(0);//removal for LikedList is faster than ArrayList this is the only difference
        //functionality is the same
        System.out.println(list2);

        Vector<Integer> list3 = new Vector<>();//since it is a class and not an interface i can create the object
        list3.add(20);
        list3.add(20);
        list3.add(40);
        list3.add(40);

        System.out.println(list3);//serves same functionality as above / use ArrayList when adding a lot of data
        //because it adds faster and if removing use LinkedList
        //vector is slowest because it is thread safe

    }
}
