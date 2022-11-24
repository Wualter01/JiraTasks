package StaticKeyword;

import MyUtils.GenericUtils;

public class StaticVariables {

    int instanceVariable=25;//instance variable, outside any methods but within class block
    int number=10;//this is another example of instance variable
    static int staticVariable=100;//static variable because of keyword static

    public static void main(String[] args) {
        /*
        When a variable is declared as static, then a single copy of variable is created
and shared among all objects at class level. Static variables are, essentially, global variables.
 All instances of the class share the same static variable.<--important

We can create static variables at class-level only.
static: class member, can be called through the class
there is only one copy of static shared by all objects
prefers to be called through class name
static ONLY accepts static

//how do you know you have  static variable? and where are they declared? static variables like instance variables
are declared outside your methods but within your class. you distinguish your static variables because they will have
the keyword static.

static members: only static members may call static members

1. static variable (global variables)
2. static methods
3. static initializer block
4. static nested class
static variable: declared outside any block with static keyword.
there is only one copy of static shared by all objects

instance means every single object of the class has its own copy
         */

        int localVariable=200;//local variable because it was declared within a method block

        //how are you able to use an instance variable inside a static method?
        //Answer: you'll need to create the object of your class that the instance variable resides in example
        //shown below

        //class         object of class
        StaticVariables createdObject = new StaticVariables();
        System.out.println(createdObject.instanceVariable);
        System.out.println(createdObject.number);

        System.out.println(staticVariable);//only static members may call static members, since my method is static
        //i can call my static variable //static variables will have only one copy for all objects

        StaticVariables createdObject2 = new StaticVariables();
        StaticVariables createdObject3 = new StaticVariables();

        GenericUtils.StarSeparation();

        createdObject2.instanceVariable=250;
        createdObject3.instanceVariable=350;

        //these 3 below are static variables i have tried to reassign them to 3 objects with 3 different values
        //but since it is static one value is shared for every object. the last declared value for the static variable
        //is assigned and will be shared amongst all objects hence why the first two are dull and the last one declared
        //is highlighted,that one is now the value for all objects.
        createdObject.staticVariable=55;
        createdObject2.staticVariable=155;
        createdObject3.staticVariable=55;

        System.out.println("createdObject.instanceVariable = " + createdObject.instanceVariable);//25
        System.out.println("createdObject2.instanceVariable = " + createdObject2.instanceVariable);//250
        System.out.println("createdObjected3.instanceVariable = " + createdObject3.instanceVariable);//350

        GenericUtils.StarSeparation();

        System.out.println(createdObject.staticVariable);
        System.out.println(createdObject2.staticVariable);
        System.out.println(createdObject3.staticVariable);
        staticVariable=3;//you dont even have to assign it to an object since method is static i can call static
        //variable and change the value then print it like shown below and now this new value assigned to static
        //variable will be shared amongst all objects.or better said whatever you assign last.
        System.out.println(createdObject.staticVariable);
        System.out.println(createdObject2.staticVariable);
        System.out.println(createdObject3.staticVariable);
        System.out.println(staticVariable);//i can print without calling the object

        //logic for using instance variables instead of your static variables
        //so that if you have a class like our shoe class and the value needs to change for each new object you can
        //do that without having to declare new variables every time
        //for static variables on the other hand if i were only working with one brand and it didnt need to be
        //assigned differently for every object i could just make the variable static and it would be shared
        //for every object of the class i make Ex: shoe1,shoe,2 etc.. all adidas


    }
}
