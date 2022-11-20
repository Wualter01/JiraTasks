package List;

import java.util.ArrayList;

public class ArrayListReverse {
    public static void main(String[] args) {
        /*
        write a program that can print the list of integers in reversed order
         */

        ArrayList<Integer> List= new ArrayList<>();
        //add numbers from 1-10/ the following is how to add numbers 1-10
        for (int i = 1; i <=10; i++) {
                 List.add(i);

        }
        System.out.println(List);
        System.out.println(ReverseList(List));
    }
    public static ArrayList<Integer> ReverseList(ArrayList<Integer> ListToReverse){//since we dont just return 1
        // number we need to pass array list as our collection type we also specify what type itll be
        // in this case Integer, return type can be array, arrayList any primitive and collection type

        ArrayList<Integer> ReversedList = new ArrayList<>();
        for (int i =ListToReverse.size()-1; i>=0; i--){

            ReversedList.add(ListToReverse.get(i));//remember .add is the method to add to our arrayList and then
            //we can use .get() and pass variable i and whatever value is at i as it loops

        }
        return ReversedList;

    }
}
