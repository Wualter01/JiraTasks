package List;

import MyUtils.GenericUtils;

import java.util.ArrayList;

public class ActualList {
    //there are 3 data structures in java array which takes primitive data types. then there are map and collection
    //which only take objects.

    // int [] arr=new Int[3];//
    // ArrayList<DataType> listName = new ArrayList<DataType> ();<---syntax for arrayList
    //DataType can not be primitive
   //has to be wrapper class object or different object type

    //ArrayList: part of Collections// is the most used there are others but this one is the most used
    //does not support primitives, only support none primitives
    //size is dynamic, automatically adjusted

   // has index numbers
    //interview question: what is the difference between array and arrayList?
    //array size is fixed and arrayList is flexible
    //array accepts primitive data types and arraylist does not
    //array is data structure and arrayList is part of collection data structure

    //ArrayList<int> list1 = new ArrayList<int>(); collection doesnt accept primitive data types therefor this
    //wont work

    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>();
        //what is the size of this list? not defined we can add as much as we want (flexible) but for now its 0 since
        //we havent added anything yet
        //add() this method will add data to your list
        ArrayList<Integer> myList2= new ArrayList<>();
        list2.add(55);//size of list2=1 55 in itself as a number not the amount/ index for 55 =0
        list2.add(0); //list2 size =2 index=1
        list2.add(100);//list size = 3 index =2
        list2.add(3000);//list size =4 index =3
        System.out.println(list2); // you dont need toString method to print anymore when using arrayList

        int [] numbers= new int[10];// we need to pass size because size is fixed

        //get() this will give you your specific data from your list using index
        System.out.println(list2.get(2));
        Integer numIndex=list2.get(1); //remember arrayList takes objects thats why we declared it Integer and returns
        //wrapper object
        System.out.println(numIndex);
        //if you try to reach a value that doesnt exist outside of your size youll get indexOutOf bounds exception

        int myInt= numIndex; //this is an example of unboxing, unboxing is when you convert an object of wrapper class
        // to its corresponding primitive data type
        System.out.println(numIndex); //or you may also do it as follows
        int number3= list2.get(3);
        System.out.println(number3);

        ArrayList<String> nameList= new ArrayList<>(); //size of name list =0
        nameList.add("wualter");
        nameList.add("AV");
        nameList.add("GG");//size =3, index=2

        System.out.println(nameList);

        //size() gives us the size of our arrayList ex: as follows
        nameList.size();
        //this is how to get the last value of your list size()-1

        //to print each name from arrayList
        System.out.println("names are : ");

        //int i=0; is my starting point at index then i say my ending point is size()-1 so itll go to the last index
        for (int i=0; i<= nameList.size()-1; i++){
            System.out.println("namesList.get("+i+") = " + nameList.get(i));//nameList.get(i) this is getting my values
            //as it loops and i in String parenthesis is giving me my index numbers as they loop. just i will give you
            //index number thats why we use .get to get us our values
        }

        GenericUtils.StarSeparation();

        //now with for each loop
        for (String eachValue : nameList){
            //we just have to pass a string variable that'll temporarily store our value and ive called it eachValue
            //then i simply print it. we are printing each value not storing it, its important to understand the logic.
            //WHEN YOU NEED TO PRINT ALL OF YOUR DATA FOR EACH LOOP IS IDEAL!!
            System.out.println(eachValue);
        }

    }
    }
