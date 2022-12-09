package PolymorphismIntro.PolymorphismPractice;

public class InheritanceDefinition {
    //what is inheritance step by step definition?
    //it is the process of one class gaining the methods and variables of another class
    // inheritance is when you create the relationship of parent class and child class through extends keyword.

    public double number;
    protected int number2;
    byte number3;

}

class inheritanceTest extends InheritanceDefinition{
    //inherits everything from parent class methods, variables, and functions.

    public static void main(String[] args) {
        inheritanceTest object1 = new inheritanceTest();
        object1.number=100;
        object1.number2=200;
        object1.number3=30;

        System.out.println("object1.number2 = " + object1.number2);
    }
}
