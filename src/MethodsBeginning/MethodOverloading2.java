package MethodsBeginning;

public class MethodOverloading2 {
    /*1. print sum of 2 int numbers
    2. print sum of 3 int numbers
    3. print sum of 2 double numbers


        In Java, two or more methods may have the same name if they differ in PARAMETERS.
        (different number of parameters, different types of parameters, or both).
        These methods are called overloaded methods and this feature is called method overloading. MEANING THAT IF ONLY
        DIFFERENCE IS RETURN TYPE IT WILL STILL BE THE SAME METHOD ONLY THING THAT MAKES THEM DIFFERENT AND OVERLOADING
        IS PARAMETERS.

     */
    public static void main(String[] args) {
        sum(100,3);
        sum(20,25,16);
        sum(5.5,10.3);

    }
    public static void sum(int a, int b){//public static int(int a, int b) these two methods are technically the same
        System.out.println("method for 2 integers");
        System.out.println("a+b = " + (a + b));
    }
    public static void sum(int a, int b, int c){
        System.out.println("method for 3 integers");
        System.out.println("a+b+c = " + (a + b + c));
    }
    public static void sum(double a, double b){
        System.out.println("method for double numbers");
        System.out.println("a+b = " + (a + b));

    }
}
