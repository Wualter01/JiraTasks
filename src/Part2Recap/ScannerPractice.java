package Part2Recap;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        //we imported scanner class (library) into our scanner practice class
        //we will be able to use all methods from scanner class by calling userInput object

        //previous way of doing it we would define our int store it in our variable and then compare ex:int number1=25
        System.out.println("insert first number : ");
        int number= userInput.nextInt();//we are asking user to enter number from console
        System.out.println("you have entered number : "+number);

        if(number%2==0){
            System.out.println(number+ "  is even");
        }else{
            System.out.println(number +" is odd");
        }


    }
}
