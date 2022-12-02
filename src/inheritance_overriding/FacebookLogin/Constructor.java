package inheritance_overriding.FacebookLogin;

class Test{
//how do you create constructor for your class?
    //access modifier+className
    //only when we create the object using className + objectName + constructor do we unintentionally use default
    //constructor REMEMBER even when you do not create constructor java creates default constructor for you
    public Test(){
        System.out.println("Test");
    }

}

public class Constructor extends Test {//test being my parent class and constructor being the child class
    //because we've extended our test class in our constructor class the default constructor will also run
    //when creating an object for child class**
    public Constructor(){
        System.out.println("constructor");
    }

    public  Constructor(String str){
        System.out.println("constructor string");
    }

    public static void main(String[] args) {
        Constructor object1 = new Constructor();//default constructor. every time an object is created i can call
        //either constructor with a string parameter or my default constructor


    }

}
