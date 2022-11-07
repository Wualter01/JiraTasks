package RecapAfterGitHub;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*TASK: write a do-while loop that asks the user to enter two numbers.
        the numbers should be added and the sum displayed.
        the loop should ask the user whether he or she wishes to perform the operation again.
        if so, the loop should repeat: otherwise it should terminate.
        if user says y or Y continue
        if user says n or N terminate the loop
        WHEN YOU HAVE A TASK ASK YOURSELF WHAT YOU'LL NEED FOR THE TASK AND GO FROM THERE

        we started off by identifying what we need. we'll need scanner for user input then we'll need a char variable
        to store our Y,y and N,n5. then we need to store our two numbers in a container in this case int so that the
        user input can vary from high to low with minimal restrictions thus int is a good range.-> referring to our
        number1 and number 2. then we must add our numbers together and assign them to a sum variable. once this is done
        we need to print our result.
         */

        Scanner scan = new Scanner(System.in);
        char choice; //this is how you leave it unassigned so that your user inputs or makes the decision
        int number1, number2 ; //if it is the same data type you can declare to variables at the same time

        do {//do will serve as our first phase so that we can ask our user to enter numbers
            System.out.println("Enter first number ");
            number1= scan.nextInt(); //this is where we'll store our user input and will allow them to enter it
            System.out.println("Enter second number "); //then we'll ask the user for their second number
            number2= scan.nextInt();//same as number1 it allows them to enter their number and we store it in number2
             int sum=number1+number2;//we are assigning our result or sum of both numbers to sum.
            System.out.println("Sum of number1 and number2 is "+sum);

            System.out.println("Do you want to add two new numbers? y/n?");
            choice=scan.next().charAt(0);//.next is used for strings and not single characters therefore we must use
            //it in combination with charAt and we say 0 because it takes index and index starts at 0 but we can
            //specify our index, we ideally want one character but since we used charAt 0 then it will take the first
            //character from the user input no matter what he writes. we are only looking at the charAt 0.

        }while (choice == 'y' || choice == 'Y');//this is my condition
        //while will serve as our second phase. in while we can ask user if he'd like to continue and run
        //program again... THE REASON WE HAVE NOT USED .IGNORECASE IS BECAUSE IT CAN ONLY BE USED WITH STRINGS AND
        //SINCE CHOICE IS CHAR IT IS A SINGLE CHARACTER/ you dont have to make a condition for N because loops
        //run until condition is false so by default if we choose n our condition ceases to be true and loop breaks
        //remember do while will continue to run if condition is true and will only break if it becomes false.
        //i technically could have ended it here and if i had wrote anything else than y or Y it would break
        if (choice== 'n'||choice=='N'){
            System.out.println("Thank you for using our calculator, good day!");
            //wrote this part just so my program was more informational or friendlier to the user

        }else{
            System.out.println("wrong character entered. please choose either y/n");//i added if else statements
            //to help program run, these are in place to catch exceptions or any possible outcome i have covered it
        }

    }
}
