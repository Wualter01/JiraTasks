package StaticKeyword;

import MyUtils.GenericUtils;
import javafx.beans.binding.When;

public class StaticMethodsContinued {
    /*
    When a method is declared with static keyword, it is known as static method.
The most common example of a static method is main() method.As discussed above,
Any static member can be accessed before any objects of its class are created,
 and without reference to any object.
            / Methods declared as static have several restrictions:

They can only directly call other static methods.
            They can only directly access static data.

     */

    int aInstance=10;
    static int bStatic=20;

    public static void main(String[] args) {//static method
        //System.out.println(aInstance); i cannot directly call an instance variable i first have to create the
        //object of my class to be able to call it.

        StaticMethodsContinued object1 = new StaticMethodsContinued();
        System.out.println("object1.aInstance = " + object1.aInstance);//by creating the object of my class i can
        //call my instance variable

        System.out.println("bStatic = " + bStatic); //static members can call static members and instance variables

        //how do you call instance method in static,we cannot call instance method without object.
        object1.InstanceMethod();//we've already created our object so we just use our object to call our method.
        staticMethod();
        GenericUtils.StarSeparation();//this is a static method outside of my class and package therefor i must
        //call class then method like shown above. if i had an instance method i would have to create an object and
        //then call it but since they are all static methods i do not have to.
        //remember any method not defined as static is an instance method



    }

    public void InstanceMethod(){//if method doesnt have static keyword it is instance method
        System.out.println("this is an instance method");
        System.out.println(aInstance);//since method is instance we can call instance variable directly no need
        //to create the object of the class

        System.out.println(bStatic);//static also known as global variable can be used in any method


    }

    public static void staticMethod(){
        System.out.println("static method");

    }
}
