package StaticKeyword;

public class StaticBlock {
    //in java we have class members : class , method , variables
    //optional you can create a block
    int instanceVariable =10;
    static int staticVariable=20;

    public static void main(String[] args) {//static method

        System.out.println("this is main method");
        //if you wanted to print or see in output anything else in this class other than main method and static block
        //youd have to call it in your main method. main method is the only one capable of running, even if we
        //overload main method you would still have to call it here in String [] arguments main method.
        /*
        the following is me calling my static and instance methods and how to go about it depending on if it is
        static or instance. as you know static can be called by class name followed by method but if you are in the
        same class as your static method calling method directly works. your instance method you'll need to create
        the object of your class to be able to call your method.
         */

        methodStatic();//called it by method name since we are in the same class as method was declared in.
        StaticBlock object1 = new StaticBlock();
        object1.methodInstance();//had to be called using object of class and since it is void meaning returns nothing
        //i dont have to put it in println...Also since i created a new object of my class instance block will execute
        StaticBlock object2 = new StaticBlock();

    }

    public static void methodStatic(){
        System.out.println("Static method");
    }

    public void methodInstance(){
        System.out.println("Instance method");
    }
    //blocks,something that has opening and closing brackets
    {
        //instance block, anything left undefined as "static" by default is instance..
        //instance block will be executed for any new object
        System.out.println("instance block");
    }

    static {//static block is defined with keyword static/ static block will be executed once before everything
        //including main method
        System.out.println("static block");
    }
}
