package MethodsBeginning;

public class MaxNumber {
    //create a method that will accept two different numbers and it will print the maximum one.
    public static void main(String[] args) {
        maximumNumber(-200,200);
    }
    public static void maximumNumber(int number1, int number2) {//you must define what data type your variable is twice
        //if you are passing two.

        if (number1 > number2) {
            System.out.println("maxNumber = " + number1);
        } else if (number2 > number1) {
            System.out.println("maxNumber = " + number2);

        } else {
            System.out.println("numbers are even");

        }

    }}
