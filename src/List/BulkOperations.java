package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperations {
   /* contailsAll (CollectionType):
    addAll (CollectionType):
    removeAll (CollectionType):
    retainAll (CollectionType):
    */
   public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.addAll(Arrays.asList(3,5,10,87,123,45,343,78,9,0));
       System.out.println(numbers);
       //another way to add numbers or data is as follows
       Integer [] nums={0,1,2,3,57,6}; //Integer not int because our arrayList only takes objects and wrapper class
       //are objects
       numbers.addAll(Arrays.asList(nums)); //this will also work
       System.out.println(numbers);

       Collections.sort(numbers);//we cann collections library(class) and then sort method
       System.out.println(numbers);

       System.out.println(numbers.contains(0));//contains will return a boolean value based on your code

       //containsAll(CollectionType) will allow you to check if your arrayList has numbers as opposed to just checking
       //one this will let you simultaneously check for more than one
       numbers.containsAll(Arrays.asList(0,2,10,45,57));//this is the syntax for containsAll
       numbers.containsAll(Arrays.asList(11,2,10,45,57)); //since my list does not contain 11 ill get a return false
       //even tho we may have some numbers ive provided. we are looking for all of them as a collective and not
       //having just one ive passed would make it false

       //removeAll- this will remove all the objects from the arraylist
       // remove will only remove first matching one

       ArrayList<Double> nList= new ArrayList<>();
       nList.addAll(Arrays.asList(1.0,2.0,2.5,1.0,2.0,1.0,5.4,6.3,2.0,2.0,2.0));
       Double num=2.0;
       nList.remove(num);//will remove the first 2.0

       nList.removeAll(Arrays.asList(1.0));//will remove all 1.0 in list
       System.out.println(nList);

       //retainAll(collectionType)
       //will search for given data and it will keep them. others will be removed example as follows
       ArrayList<Integer> list5=new ArrayList<>();
       list5.addAll(Arrays.asList(1,1,11,1,1,2,2,2,3,3,3,55,5,54,4));
       System.out.println(list5);
       list5.retainAll(Arrays.asList(11,2));//it will keep multiple values if it has more than 1 example there are
       //more than 1 "2" so itll keep all 2's
       System.out.println(list5);


   }
}
