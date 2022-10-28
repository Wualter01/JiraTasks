package Recap;

public class IfElse {
    public static void main(String[] args) {
        /*number 2
        create a java program to check if the number 2 is equal or not
        if it is equal print : numbers are equal
        if it is not print : numbers are not equal
         */
        int number1=2;
        int number2=3;
        if (number1==number2){
            System.out.println("number is equal");
        }else{//whatever is left will print from if condition
            System.out.println("number is not equal");
        }
        //even numbers- if number can be divided by 2 (if remainder is 0) then this number is even
        //odd numbers- if number can be divided by 2 (if remainder is not 0) then number is odd
        //below is how you find the even and odd number without using loop THIS IS SOLELY BASED ON REMAINDER

        int number=300;
//THIS EQUATION IS LOOKING FOR REMAINDER TO BE 0 NOT PARTICULARLY IF IT CAN BE DIVIDED BY 2
        if (number % 2==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number+ " is odd number");
        }

    }
}
