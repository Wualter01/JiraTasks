package MethodsBeginning;

import MyUtils.GenericUtils;

public class LibraryTest {
    public static void main(String[] args) {
        GenericUtils.hello();
        GenericUtils.StringReverse("jennifer");

        String word= "kayak";
        GenericUtils.StringReverse(word);//i dont have to directly pass my string in my method i can store it in a
        //variable and call it with my method parameters.


    }
}
