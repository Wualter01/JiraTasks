package inheritance_overriding.FacebookLogin;

class Test5{
    int number;
    public void method2(){
        System.out.println("method 2");
    }
}

public class Overriding extends Test5{
    /*
     method overriding: same method name, same parameter, same return-type (MUST)
MUST happen in the subClass
access modifier MUST be same or more visible
ONLY the instance methods can be overridden @override annotation MUST be applicable
     */
//after extending method2 and number will be inherited from parent class

    //overloading same method with different parameters

    public void method1(int number){

    }

    public void method1(String str){

    }

    @Override //this annotation is so that i know ive overridden method2 in parent class/ override is used when you no
    //longer want or want to reassign variables or information in your parent method2
    public void method2(){//when you use different parameters then your parent method you overload and not override
        //in order to override you must pass same name and same parameters as your parent method2
        System.out.println("override method 2");
    }

    public static void main(String[] args) {
        Overriding object = new Overriding(); //class object and default constructor Overriding()
        object.method2();
        //logic for overriding i have 5 subclasses or child classes of Test5 and only need to change for one
        //overriding would then work overriding also takes up less memory
    }


}
