package StaticKeyword;

import MyUtils.GenericUtils;

public class StaticBlock_constructor {

    static int a = 10;
    //this static block was reassigned to 99 in static block. even tho this is first from top to bottom
    //java runs static block first before anything else including main method therefor this variable will stay 99
    static int a2 =20;
    int b;
    static int a3 =100;
    int age =200;

    public static void main(String[] args) {
        System.out.println(a);//since we are in the same class that static variable was declared in i dont have to
        //call (reference) the class i can just print

        System.out.println(a2);

        //instance block will run here and then anything having to do with your object will run
        StaticBlock_constructor object1 = new StaticBlock_constructor();//since b is an instance variable ill have to
        //create the object of the class and then call variable or pass variable.
        System.out.println(object1.b);
        System.out.println(a3);
        System.out.println(object1.age);

        GenericUtils.StarSeparation();
        method1();//since method is in the same class i dont have to reference the class i can just call method
        //also since it is void and has no return type i don't have to put it in println
        object1.method2();//since my method2 is an instance method i have to make an object of the class and then
        //pass method.

        //since i have to call method1 and method 2 in main method now java will read from top to bottom in that order





    }
    static {
        System.out.println("this is static block");//runs before everything including main method
        System.out.println("this will print second");

        a=99; //we've reassigned a to 99
        a3=89; //remember we arent printing here we are reassigning if i were to print this here it would go before
        //a and after my string this is static block

        if (4>2){//a will change because this statement is true since this static block runs first a variable will now
            //equal 35 from now on
            a=35;
        }

    }
    {
        System.out.println("instance block");//runs every time an object of the class is created and runs before
        //anything before the creation of your object

    }

    public static void method1(){
        System.out.println("in what order does this print?");
    }
    public void method2(){//instance method
        System.out.println("method2");
    }
}
