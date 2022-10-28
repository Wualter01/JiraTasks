package Part3Recap;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
       /*
       create a java program that will sum the given numbers
       ex: if input is 5:
       output will be: 1+2+3+4+5==15

       input is 3
       output 1+2+3=6
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scan.nextInt();
        int start=0;
        //you need a summary variable, which will be your total
        int sum=0;

        while (start <=number){//lets assume number is 5  0<=5
            //follow closely your loops and their designated variables to find answer ex: in notebook under
            //sum of given numbers

            sum+=start; //sum = sum+ start = 0+0=0
            System.out.println("sum in the while loop " + sum);//i print this within the loop so i can see how
            // its working
            start++;

            System.out.println("sum after += " + sum);
        }
        System.out.println("sum = " + sum);
    }
}
