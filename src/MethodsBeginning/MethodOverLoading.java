package MethodsBeginning;

import java.util.Arrays;

public class MethodOverLoading {
    public static void main(String[] args) {
        method();
        method(10);
        method(5);//if you hover over your parenthesis itll tell you that your parameter takes an int value at
        //variable a.

        method(5.5);//double
        method("text");//String
        method(5,5);//2int
        method(3);
        method((byte) 3);//this is how we specify that we want this number to be read as byte/ because java takes a
        //whole number as integer as a default
        //you can also do it this way as follows
        byte number1=3;
        method(number1); //but if you know method takes byte you can just tell java to read it as a byte like above



        //WHAT IS METHOD OVERLOADING? ANSWER: WHEN WE LOAD THE SAME METHOD WITH A DIFFERENT PARAMETER
        //method overloading examples above and as follows below.

        /*
        In Java, two or more methods may have the same name if they differ in parameters.
        (different number of parameters, different types of parameters, or both).
        These methods are called overloaded methods and this feature is called method overloading.
         */
    }
    public static void method(){
        System.out.println("method");
    }

    public static void method(int a){//when we do it this way with void a will be what itll ask the user to fill in
        //so the user will fill in the data type for variable a. and we have no return type
        System.out.println("hello method int " +a);
    }
    public static void method(int a, int b){

    }
    public static void method(double d){
        System.out.println("method double "+d);
    }
    public static void method(String a){
        System.out.println("method String " +a);
    }
    public static void method(byte b){
        System.out.println("method byte "+b);
    }
}
