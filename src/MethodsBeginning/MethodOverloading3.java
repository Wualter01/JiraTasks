package MethodsBeginning;

import java.util.Arrays;

public class MethodOverloading3 {
    public static void main(String[] args) {
        //What have we passed in our parameters in our main method? Answer: A string array.
        //Can we overload a main method? Answer: Yes, by passing another data type other than String array in our
        //parameters. Can we run an overloaded main method? Answer: no, we can only overload but overloaded method
        //can't run class. in order to run other main methods, we will have to call them in (String [] args).

        System.out.println("Default String main args");
        int [] arr={2,3,4};
        main(arr);


    }
    public static void main(int [] a){
        System.out.println("int main"); //we can still use sout in our created methods and they will print no matter
        //the data type passed in our parameters

    }
}
