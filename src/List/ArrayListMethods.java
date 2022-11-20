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
    }
}
