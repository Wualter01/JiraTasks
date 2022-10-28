package RecapAfterGitHub;

public class DoWhileLoop {
    public static void main(String[] args) {
       /*there are two parts to do while loop the "do" and "while". do will be executed at the beginning of the loop
       whether condition is true or false one time. it runs at least one time and it will continue to run if while
       is true. Ex: as follows
        */

        int number =10;

        while(number<10){
            System.out.println("While loop");
        }

       // do {//do while body will be executed once, it will continue to be executed only if while condition is true
            System.out.println("do while");

        //}while (number<10);//false so then it will not continue to execute do

       // do {
            System.out.println("hello");
        //}while (number<=10);//infinite loop because we never defined to increment/ so as long as condition stays
        //true loop will continue

        int number2=3;
        //do {
            System.out.println("number2 = " + number2);
            number++;//if this was before sout then it would print 4-10 because our condition is after so it would
            //increase to 10 after 9 print and then itll see condition became false and 11 will never print
       // }while(number2 <10);
        //starting point 3
        //ending point 9
        //iteration +1

        //if you put your iteration outside your loop 3 will never increase and itll be infinite do initiates your
        //loop so it must be within the curly brace

        int number3=5;
        do {
            System.out.println(number3);
            number3--;
        }while(number3<0);//we will see only the number 5 be printed because hava reads from top to bottom
        //so sout goes first then it decreases and condition becomes false and no longer becomes true so it will
        //only run once remember loop runs and continues to run as long as condition is true.
        //HERE YOU ARE OUT OF YOUR LOOP

        //printing even numbers from 0-100 using do while loop
        //starting point is 0 ending point is 100
        //iteration++ or +2 both work one skips a couple steps tho (+2)


        int sum=0;
        int number4=0;//if this was 1 it would still not run because even if do runs whether it is true or false we
        //have an if condition that prevents it from running
        do {

            if(number4%2==0){
                sum++;//to get the total count of even numbers
                System.out.print(number4 + " , ");//did it this way so that we can print in one line all of our even
                //numbers separated by , and some space
            }

           number4++;
        }while(number4<=100);//this is where you put your condition as in when or til when your code will run
        System.out.println();
        System.out.println("total even numbers from 0-100 = " + sum);

    }
}
