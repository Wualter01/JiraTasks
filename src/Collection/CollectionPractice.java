package Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionPractice {

    /*List and Set both are interfaces. They both extend collection interface.
    The important differences between set and list are:
            1. Duplicate Objects
    The main difference between List and Set is that List allows duplicates while
    Set doesn't allow duplicates.

    2.Order
List is an ordered collection it maintains the insertion order,
which means upon displaying the list content it will display the elements in the same order
in which they got inserted into the list.

Set is an unordered collection, it doesn't maintain any order.
There are few implementations of Set which maintains the order
such as LinkedHashSet (It maintains the elements in insertion order).
treeSet will sort
hashset will sort in hashset logic

3.Null elements
List allows any number of null elements. Seil can have only a single null elements at most
-- TreeSet wont allow even one null
     */

    public static void main(String[] args) {
        // Task 1. write a program that can remove the duplicated characters from String
         //and store them into variable

        String word = "Hellowwwworrrrllllledeeeeoooww";
        String [] letters = word.split("");
        System.out.println(Arrays.toString(letters));

        //we can store our array in the collection
       //i will need to put in a set so i can remove all duplicates
        //insertion order matters (i dont want to sort )
        //LinkHashSet

        LinkedHashSet <String> result = new LinkedHashSet<>(Arrays.asList(letters));//since LinkedHashSet is
        //a class i can create the object. i wont be able to use any other set because they will sort it we want
        //to sort by order of insertion hence linkedHashSet
        System.out.println(result);

        //to put back in string format
        String nonDuplicate = "";

        for (String each : result){
            nonDuplicate+=each;
        }
        System.out.println(nonDuplicate);
        //this is one way to get my array back to string with for each loop since i want to go through all the data
        //in my array and i use string each to temporarily hold each letter then add them to my nonDuplicate
        //String which is empty

        //Task2:
        // 2. write a program that can identify if two strings are built out of the same letters
       //String str1="abcabccabd"; d
        // String str2="dcbaccc"; //dcba
        //Starting point remove duplicates ; any set method
        //second make sure to sort them so you can compare them

        String str1 ="abcabccabd";
        String str2 = "dcbaccc";

        //we must put them into an array like shown below so that you can use collection later
        String [] arr1 =str1.split("");
        String [] arr2 = str2.split("");

        //we print as arrays
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //we use collection to do the following below
        TreeSet<String> result1= new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String> result2= new TreeSet<>(Arrays.asList(arr2));
        //treeSet will take arrays and remove duplicates and sort them from small to large

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        //we put them back in string format because they are as array right now
        String newStr1= result1.toString();
        String newStr2= result2.toString();

        System.out.println(newStr1.equals(newStr2));
    }

}
