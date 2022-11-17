package MethodsBeginning;

import java.util.Arrays;

public class MethodOverloading4 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        String [] names={"Wualter","Katalina","Jennifer","Adalyn","Gambit"};
        char [] letters={'m','l','a','g','s'};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(names));//examples of this defined below.

        //java automatically adjusts method to the data type youre passing. EX:Arrays.toString(int etc.)
        //java will adjust the method to whatever data type youre passing as long as the class has the method
        //created.The class Array has many different methods including toString sort etc.

        concat("hello ","world");//you can just add a space so that your words are separate or you can do it
        //like the example below adding another string in parameters
        concat("Hello"," ","World");

        System.out.println(concatenation("hello", "people"));
        System.out.println(concatenation("Hola", "mi", "gente"));

    }
    public static void concat(String a, String b){
        System.out.println(a.concat(b));
    }
    public static void concat(String a, String b, String c){
        System.out.println(a.concat(b).concat(c));

    }
    //this is how you do the same methods with return type instead of void
    public static String concatenation(String str1,String str2){
        return str1.concat(" "+str2);
    }
    public static String concatenation(String a, String b, String c){
        return a.concat(" "+b).concat(" "+c);
    }
}
