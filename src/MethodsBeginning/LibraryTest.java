package MethodsBeginning;

import MyUtils.GenericUtils;

public class LibraryTest {
    public static void main(String[] args) {
        GenericUtils.hello();
        GenericUtils.StringReverse("jennifer");

        String word= "kayak";
        GenericUtils.StringReverse(word);//i dont have to directly pass my string in my method i can store it in a
        //variable and call it with my method parameters.

        MaxNumber.maximumNumber(0,0);//remember to call your method you have to call your class.method
        //that is why we have a utils class so that we can just all our utils class and keep all of our useful methods
        //there. we dont have to try and remember what class we used.
    }
}
