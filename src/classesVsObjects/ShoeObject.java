package classesVsObjects;

import MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoeObject {
//ArrayList list = new ArrayList();
    //class object creation or instance of my class

    public static void main(String[] args) {

        //shoe nike = new shoe
        ShoeExample object1 = new ShoeExample();//since class is public you dont have to import shoeExample class
        //ShoeExample is my class and i create and instance object of that class with whatever name i want
        //that will enable me to assign attributes to my object and attributes are what ive passed in my parameters

        System.out.println(object1.brand);//null
        System.out.println(object1.size);//default value for int = 0
        System.out.println(object1.color);//default value for string null

        object1.wear();//she is wearing null
        object1.getShoeInfo();

        GenericUtils.StarSeparation();

        ShoeExample shoe1= new ShoeExample();

        //updated object information meaning my undefined variables in shoeExample class
        shoe1.brand="Nike";
        shoe1.size=12;
        shoe1.color="white";

        System.out.println(shoe1.brand);//nike
        System.out.println(shoe1.size);//12
        System.out.println(shoe1.color);//white

        shoe1.wear();//in this method ive included brand so when i update it, it'll be included in result

        shoe1.getShoeInfo();//in this method ive called getShoeInfo ive included brand, size, and color
        //and since ive defined all of those above ill get an updated information output.

        ShoeExample shoe2 = new ShoeExample();

        GenericUtils.StarSeparation();
        shoe2.setShoeInfo("Adidas",9,"black and white");//since in my class shoeExample
        //setShoeInfo method ive passed these parameters itll ask for them when i call my method thus making it
        //easier than having to do it manually each time.
        System.out.println(shoe2);

        GenericUtils.StarSeparation();

        ShoeExample shoe3 = new ShoeExample();

        shoe3.color= "Black";
        shoe3.brand="Nike";
        shoe3.size=9;

        shoe3.getShoeInfo();

        GenericUtils.StarSeparation();
        String [] array ={"Hello","World"};

        //dataType we can call our class as a data type and that will include my instance variables int 2X strings
        ShoeExample [] shoes={shoe1,shoe2,shoe3};// all of these have primitive value passed in methods therefor
        //i can use array and not arrayList/ i can only store shoes inside of container (objects ive created from my
        //shoeExamples class)

        //this method is useful to get information from array at index 0
        shoes[0].getShoeInfo();//if i wanted to get information about a lot of shoes id use for loop

        GenericUtils.StarSeparation();

        ArrayList<ShoeExample> shoesList = new ArrayList<>();//ive passed shoesExample as my data type, meaning
        //i can only pass shoes in this list Ex:shoe1 shoe2 instance objects ive made from my shoeExample class
        //that is why i must say ShoeExample name = new shoeExample();


        shoesList.addAll(Arrays.asList(shoe1,shoe2,shoe3));
        System.out.println(shoesList);//to get specific data use sout(ShoesList.get(0).color);
        System.out.println(shoesList.get(0).brand);//nike i can get color size (attributes) with code shown above.
        //if i dont specify siez,color, and brand ill get all of these for specific index passed ex: as follows
        GenericUtils.StarSeparation();
        System.out.println(shoesList.get(1));

        System.out.println(shoe2); //this is part of toString method its automatically printing size+Color+brand
        //every time we pass the name of the object in print statement


    }
}
