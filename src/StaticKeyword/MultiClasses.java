package StaticKeyword;

//in java we may only have one public class
//logic for having multiple classes in on is to knock out more than one assignment at one time.. or two have classes
//pertaining to each other together.

class Cat{
    public static void main(String[] args) {
        System.out.println("cat class main method");

    }

    public static void catHello(){
        System.out.println("hello from cat");
    }

}

public class MultiClasses {//in java we can have multiple classes within one class.. example shown above
    //now if i look at this class in my package there should be a drop down arrow and i should be able to see all
    //classes included in my one class. i can also include a main method in all  of my classes.
    public static void main(String[] args) {
        System.out.println("MultiClasses main method");
    }
}

class fox{
    //same thing will happen as explained above
    public static void main(String[] args) {
        System.out.println("fox class main method");
        Cat.catHello(); //since i have declared this method in cat class static i can call by referencing the class
        //and passing the method like shown above

    }

    public static void foxMethod(){
        System.out.println("hello from fox");
    }
}
