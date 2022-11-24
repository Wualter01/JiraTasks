package StaticKeyword;

import MyUtils.GenericUtils;
import classesVsObjects.ShoeExample;

import java.util.Arrays;

public class ShoeObjects  {
    public static void main(String[] args) {
        //ClassesVsObjects package was imported then i can create my instance object from my class and ive called it
        //shoe1. we had to import because we are no longer working in the same package.
        ShoeExample shoe1 = new ShoeExample();//now i can call all of my methods & variables via my instance object
        // shoe1 since all of my methods access modifiers are public we have no issues when calling my methods

        shoe1.wear();//null because we havent assigned anything to my shoe
        shoe1.setShoeInfo("Nike",9,"white");
        shoe1.wear();//now since i have assigned values to my shoe object method wear will tell me some info about it
        //when i print
        shoe1.getShoeInfo();
        System.out.println(shoe1);//without my toString method id get hashcode because toString defines your object
        //behaviour

        ShoeExample shoe2 = new ShoeExample();
        shoe2.setShoeInfo("converse",9,"black");
        ShoeExample [] shoes ={shoe1,shoe2};//have to be objects of sheExample class
        System.out.println(Arrays.toString(shoes));

        shoe1.wear();

        GenericUtils.StarSeparation();

        for (int i =0; i< shoes.length; i++){
            //logic: id like to know what he/she shoes would be wearing in the shoe array. so i create a for loop
            //to go from index 0 to the length of my shoe array, this will cover all shoes in array.
            //then i want to say tell me what shoe he/she is wearing as it loops for this i do shoe at variable i
            //shoes[i].wear;
            shoes[i].wear();
            shoes[i].getShoeInfo();//whatever method id like included in my shoe object class
        }
    }
}
