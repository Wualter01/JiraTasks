package Recap;

public class MinimumNumber {

    public static void main(String[] args) {
        /* x=400  y=200  z=300 //output should be minimum number is 200
           x=100  y=200  z=300 //output should be minimum number is 100
           x=300  y=100  z=400 //output should be minimum number that is 100
         */

        //if x is the minimum number that means x<y and x<z
        //if y is the minimum number that means y<x and y<z
        //if z is the minimum number that means z<x and z<y

        //to be able to apply logic i need to create my 3 numbers
        //2.create 3 boolean conditions to heck which boolean is true
        //3.create if statement to check booleans and print minimum number

        int x=151;
        int y=1000;
        int z=150;
        //MAKE SURE TO TEST YOUR LOGIC WITH DIFFERENT DATA TO MAKE SURE IT WORKS PROPERLY EX: CHANGE THE VALUE OF
        //YOUR VARIABLE NUMBER SO THE OUTCOME IS DIFFERENT EACH TIME.

        //when using && if even one outcome is false statement will be false/ we use && because we wont both to be true
        //in order to print
        boolean xmin=x<y && x<z;//200<100=false  200<150=false
        boolean ymin=y<x && y<z;//100<200=true   100<150=true
        boolean zmin=z<y && z<x;//150<100=false  150<200= true
        //technically we dont really need boolean condition we can pass this in our parameters directly for each if
        //statement, this just makes it more readable for the next person

        if (xmin){
            System.out.println("Minimum number is variable x = " +x);
        }

        if (ymin){
            System.out.println("Minimum number is variable y =  " +y);
        }

        if (zmin){
            System.out.println("Minimum number is variable z = " +z);
        }

    }
}
