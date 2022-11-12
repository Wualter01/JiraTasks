package MethodsBeginning;

public class MethodsWithParameters {
    /*declaration of method (how we create our methods is as following)
    public             static         void            main           (String[] args){
    access-modifier    specifier     return type     methodName      parameter{
    Statements,--> code
     */

    public static void main(String[] args) {
        hello();//i can call it more than once
        hello();
        evenNumbers(0,100);//this is asking us to define our starting and ending point because when we declared our
        //evenNumbers method we passed int starting point and ending point to be decided by user depending on situation.
        System.out.println("*****************");
        evenNumbers(0,20);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&");

        ageCategory(29);//itll ask you to include your parameter in this case integer parameter
        //if you enter anything but an integer intellij will tell you it requires an int.
        //youll get incompatible error string cannot be converted to int.


    }
    //print hello
    public static void hello(){//void method without parameters () <--empty
        System.out.println("hello");
    }
//even numbers for any range
    public static void evenNumbers(int startingPoint , int endingPoint){//this is ideal to do because if we call this
        //method in one class and then have to change starting and ending point we would ruin our codes in other classes
        //so instead we pass it this way in our parameters. Now when we call our method itll ask you to pass starting
        //and ending point each time so that we have code re-usability.
        for (int i = startingPoint; i <=endingPoint ; i++) {
            if (i%2==0){
                System.out.println(i+" is even number");
            }

        }
    }
    /* create a method that will check given age and print the category of each age
    if age is 0-5 = baby
    if age is 6-18 = young
    if age is 19-80 mature
    if age is bigger than 80 print old
     */

    public static void ageCategory(int age){//we pass age parameter so that it can be unique to each equation when used
        String result="";

        if (age>=0 && age<=5){
            result= age + " is a baby";
        }else if (age>5 && age <=18){
           result= age+ " is young";
        }else if (age>18 && age<=80){
            result= age + " is mature";
        }else if (age>80){
            result= age + " is old";
        }else{
            result= age + " does not exist";
        }
        System.out.println(result);
    }
}
