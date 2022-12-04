package Exceptions;

public class FinalVariables {
    /*difference between finally and final keyword
    finally is used with try catch block and it will execute no matter if try/catch fails.
    keyword "Final is used to make things not changeable
     */

    int instanceVariable;
    static int staticVariable;

    final int instanceVariable2=100;
            final static int staticVariable2=200;

    public static void main(String[] args) {
        staticVariable = 10;//static variables or static methods can be called with class reference but since i am in
        //the same class as the variable was declared in i do not have to reference the class. i can just call it.
        FinalVariables object1 = new FinalVariables();//as for my instance variables and methods i have to create the
        //object of my class to call variable or method. since i have not defined a constructor i am using default
        //constructor.
        object1.instanceVariable=20;
        //object1.instanceVariable2=500;
        //staticVariable2=300;-->since i have defined these as final their values are permanent and cannot be changed


    }
}
