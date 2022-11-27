package Constructor_AccessModifier;

public class ConstructorChaining {
    /*
    what is constructor chaining?
    Calling a constructor within another constructor to acquire its members.
    Within the same class it can be done using this() keyword
     */

    public ConstructorChaining(){
        //to be able to create constructor you need access modifier + className
        this(10);
        System.out.println("default constructor");

    }
    public ConstructorChaining(int a){
        System.out.println("Integer constructor");
    }

    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("method 2");
    }

    public ConstructorChaining(String str){
        this();//depending on what parameters define the constructors ive created i can switch between them
        //using keyword "this()" and whatever parameter ive included to each specific constructor. this one
        //is calling default constructor that has no parameters. i can easily pass an int and itll switch to
        //corresponding constructor..
        //however, i cannot pass the string constructor method i am currently in that would create an infinite loop
        //java gives an error.
        System.out.println("this is string constructor");
        method2();
    }

    public static void main(String[] args) {
        ConstructorChaining object = new ConstructorChaining("hello"); //this is my constructor that has a string as
        //a parameter and if you check that method ive also committed constructor chaining by calling my default
        //constructor within my constructor.

    }
}
