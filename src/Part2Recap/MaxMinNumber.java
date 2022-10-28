package Part2Recap;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter first number");
        short number1= scan.nextShort();
        System.out.println("Enter second number");
        int number2= scan.nextInt();
        System.out.println("Enter third number");
        int number3= scan.nextInt();

        //this is in order from greatest > to lesser than
        //double> float > long > int > short > byte

        boolean number1Max= number1>number2 && number1>number3;
        boolean number2Max= number2>number1 && number2> number3;
        boolean number3Max= number3>number1 && number3>number2;//you dont need to actually create this one because
        //after checking and comparing the first two the remainder must be by default max number
        int maxNumber = (number1Max) ? number1 : (number2Max) ? number2 : number3;
        System.out.println("maxNumber is : "+maxNumber);
    }
}
