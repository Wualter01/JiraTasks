package Constructor_AccessModifier;

public class printOrder {
    public printOrder(){// when we create a new object constructor block will run
        System.out.println("Default constructor");

    }

    public static void main(String[] args) {
        System.out.println("main method started");
        printOrder object1 = new printOrder();
    }

    static {
        //no matter what static blocks run at beginning once
        System.out.println("Static block");

    }
    {
        //instance block runs when you create a new object
        System.out.println("instance block");
    }
    public static void methodStatic(){ //runs only if called in main method
        System.out.println("static method");
    }
    public void instanceMethod(){//runs only if you call it in your main method
        System.out.println("instance method");
    }
}

//1st static block no matter what
//2nd main method will run from top to bottom in order that we pass them
//each new object will run inStance block and constructor together
// c2_printOrder obj1=new c2_printOrder ();
// first instance block will get executed before constructor
//every time i create a new object or run my instance method will run