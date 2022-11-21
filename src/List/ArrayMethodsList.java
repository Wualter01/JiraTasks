package List;

import MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMethodsList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(110);
        list.add(33);
        list.add(-11);
        list.add(-47);

        //indexOf(object) will print index number of the object that you are passing /if that object is present in your
        // list you will get index number /if object is not present you will get index as -1

        System.out.println(list.indexOf(33));//index =1
        System.out.println(list.indexOf(-47));//index =3
        System.out.println(list.indexOf(0));//since object or element is not present you'll get -1 in output
        System.out.println(list.get(0));//not to be confused with .get this will output whatever object or element is
        //at index 0
        GenericUtils.StarSeparation();

        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");
        System.out.println(list2.indexOf("B")); //index =1
        System.out.println(list2.indexOf("b")); //index =-1 since element or object is not present

        //contains method return type is boolean
        System.out.println(list2.contains("B"));//output true
        //all methods that we use with ArrayList will return wrapper class objects
        //we can store them in wrapper or primitive data type. when we store an object in a primitive data type we call
        //that unboxing and when we convert primitive data to it's corresponding wrapper class we cal it autoboxing

        boolean b1= list2.contains("X");//since we dont have element x this returns false and this is called unboxing
        //since boolean is a primitive data type and it is returning a wrapper class object

        ///arrays .sort
        //Collections is a library (class) which is very useful with arraylist
        //Collection is data structure

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //equals method
        ArrayList<Integer>numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);

        ArrayList<Integer>numList2 = new ArrayList<>();
        numList2.add(5);
        numList2.add(2);
        numList2.add(2);

        boolean bool=numList.equals(numList2);
        System.out.println(bool);//false and is unboxing

        Collections.sort(numList2);
        System.out.println(numList2);

        for (int eachValue : numList2){//i can make eachValue either Integer or int it will print the same
            System.out.println(eachValue);
        }

        //is empty method
        numList2.clear();
        System.out.println(numList2.isEmpty());//will return boolean true
        System.out.println(numList2.size());//if it is 0 means its empty



    }
}
