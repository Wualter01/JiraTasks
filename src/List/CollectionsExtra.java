package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsExtra {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(4,5,6,7,8,3,35,9,9,999));
        System.out.println(Collections.max(numbers));//Collections.max and pass our arrayList will bring us the max
        //value in our list.
        //we can use min number as well as a bunch of other methods in collections class
        System.out.println(Collections.min(numbers));//this brings us min number from arrayList
        //to get second max number/ logic: remove first max number and then get second max number
        //store your object in Integer then remove it
        Integer max=Collections.max(numbers);
        numbers.remove(max);
        System.out.println("second max = "+Collections.max(numbers));

        //swapCollectionsType, index1, index3: this will swap the values at index1 and index3
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(100,10,1,4,5,10,10,10));
        System.out.println(list3);

        Collections.swap(list3,0,3); //first we pass our ArrayList name and then index for index we wish to
        //swap
        System.out.println(list3);

        //replaceAll(CollectionsType), old data, new data); same concept as our swap method first pass the ArrayList
        //then we pass the old data we wish to replace for the new data

        Collections.replaceAll(list3, 10, 22);//do not add sout to this it wont replace your values
        //if replaceAll is not highlighted it will not work. you have to print sout(list3) separately
        //it will replace all the values of 10 with 22 not just the first occurence of it.
        System.out.println(list3);

    }
}
