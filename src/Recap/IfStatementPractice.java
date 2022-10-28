package Recap;

public class IfStatementPractice {
    public static void main(String[] args) {
        /*write a java program to compare two numbers. go to the editor
        input data:
        input first integer: 25
        input second integer: 39
        expected output

        25 !=39
        25<39
        25<=39
        checking for the following operators
        ==
        !=
        <=
        >=
        <
        >
         */
//writing it out like this is convenient because you only have to write it once and then you simply change the data
        //here to whatever numbers youre comparing
        //THESE ARE CALLED RELATIONAL OPERATORS BECAUSE WE CHECK THE RELATIONSHIP BETWEEN TO VARIABLES OR NUMBERS
        //USING THESE OPERATORS
        int number1 = 20;
        int number2 = 30;

        if (number1 == number2) {
            System.out.println(number1 + " == " + number2);
        }
        if (number1 !=number2){
            System.out.println(number1+ " != " +number2);
        }
        if (number1>=number2){
            System.out.println(number1 +" >= "+number2);
        }
        if (number1<=number2){
            System.out.println(number1+ " <= " +number2);
        }
        if (number1>number2){
            System.out.println(number1+ " > " +number2);
        }
        if (number1<number2){
            System.out.println(number1+ " < " +number2);
        }

    }

}

