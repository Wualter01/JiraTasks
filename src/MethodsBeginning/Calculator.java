package MethodsBeginning;

public class Calculator {
    public static void main(String[] args) {
        Calculator1(5,4);
        System.out.println(Calculator2(20, 5));

    }
    public static void Calculator1(int number1,  int number2){
        System.out.println("number1*number2 = " + number1 * number2);
    }
    public static String Calculator2(int number3, int number4){//you can have a string return type and still pass
        //2 integers in your parameters which will be tied in at the end like below

        String Result = "number3 divided by number4 = "+number3/number4;
        return Result;
    }
}
