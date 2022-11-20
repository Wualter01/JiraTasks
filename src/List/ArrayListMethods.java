package List;

import java.util.ArrayList;

public class ArrayListMethods {
    //what methods have you learned thus far for arrayList? .get .add .size() .min_number .max_number
    //ArrayList<DataType> myNumbers = new ArrayList<Integer>(); <-- valid way of declaring arrayList

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();//size at 0 for now
        //add method will always add at the end
        numbers.add(5);//this is now at index 0 and so on in order..
        numbers.add(29);
        numbers.add(22);

        //what if you want to add in the middle? method for this is -->

        System.out.println(numbers);
        numbers.add(0,20); //fist index of where i want my element and then element (number)
        //now ill have 20,5,29,22
        System.out.println(numbers);
        numbers.add(2,100);//NEW LIST= 20,5,100,29,22
        System.out.println(numbers);

        //overloaded .add will ask you for index (placement you want element) and then element and that will depend
        //on the data type you have passed in your ArrayList

       // numbers.add(8,47);//index out of bounds exception if you try to place an element outside
        //of the range of your ArrayList

        int sizeOfList= numbers.size();
        System.out.println("sizeOfList = " + sizeOfList);//size is 5 index =4
        numbers.add(5,47); //would be the same as .add(5) because you left off at 4
        System.out.println(numbers);

        //Set(index,data) means we will be reassigning our data
        //method will set value for given index
        //set 5 to 555; index number 5 will no longer be 47 it will be 555
        numbers.set(2,11); //100 will be replaced with value 11
        System.out.println("numbers = " + numbers);

        ArrayList<String> letters = new ArrayList<>();
        System.out.println(letters); //list is empty for now
         letters.add("B");//index 0
        letters.add("X");
        System.out.println(letters);

        letters.add(1,"A"); //output = B,A,X remember we are not replacing we are just adding
        System.out.println(letters);
        letters.set(0,"N");
        System.out.println(letters);
        letters.add("A");
        System.out.println(letters);

        //now how do we remove elements in our arrayList? we can use .remove/ .remove will either take the element
        //itself you wish to remove or the index number..Ex: as follows
        letters.remove("A"); //since we have two "A"s only the first occurrence of the element will be removed
        //result will be N,X,A
        System.out.println(letters);
        letters.remove(0);//result will be X,A
        System.out.println(letters);

        letters.remove("O");
        System.out.println(letters); //.remove method will look at given object or index and remove it if it is present
        //if it is not  present then nothing will change.

        boolean b1=letters.remove("R");//this is saying if it is present remove it and return true or false based
        //on it being present or not
        System.out.println(b1);//since it is not present result is false

        //clear method will remove all the objects in our arrayList and it will now be empty
        letters.clear();
        System.out.println(letters);

        if (letters.size()==0){
            System.out.println("Clear method worked");
        }else {
            System.out.println("Clear method failed to work");
        }

    }
}
