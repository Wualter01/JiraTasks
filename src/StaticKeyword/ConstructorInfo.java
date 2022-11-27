package StaticKeyword;

public class ConstructorInfo {

    /*Constructor in java is a special method that is used to initialize object
    the constructor is used when an object of the class is created, it can be used to set initial values for object
    attributes.

    1st constructor needs to have same name of the class its being declared in. 2nd. even if you dont create one
    constructor java will create one as a default.

     */

    public ConstructorInfo(){
        //it will be created automatically by java as a default
        //constructor will help create an object
        //question : can we overload the constructor method in java?
        //Answer: yes any method in java can be overloaded by passing different parameters or by the amount of
        //parameters passed
    }

    public ConstructorInfo(int a){
        System.out.println("overloaded constructor method with argument int "+a);

    }

    public static void main(String[] args) {

        ConstructorInfo object=new ConstructorInfo();//created an object with default constructor

        ConstructorInfo object2 = new ConstructorInfo(2);//created an object with constructor that has parameter.


    }
}
