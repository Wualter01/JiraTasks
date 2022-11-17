package MethodsBeginning;

public class Calculator {
    public static void main(String[] args) {
        Calculator1(5,4);
        System.out.println(Calculator2(20, 5));

    }
    public static void Calculator1(int number1,  int number2){
        System.out.println("hello this is multiplication method");
        System.out.println("number1*number2 = " + number1 * number2);
    }
    public static int Calculator2(int number3, int number4){
        System.out.println("this is division method");
        System.out.println("division of "+number3+" / "+number4);


        return number3/number4;
    }
}
