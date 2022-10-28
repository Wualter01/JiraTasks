package Recap;

public class TaskUnaryOperators {

    /*create 3 different numbers
    second number should be equal = first number + 7
    third number should be = second number + 8
    ex: x=25 , y = 32 , z= 40 .
    ex: x= 20 , y= 27 , z= 35 .
     */

    public static void main(String[] args) {
        int w=30; //we can change this to affect the rest of our code as in code re-usability
        int y= w + 7;
        int j= y + 8;

        System.out.println(w);
        System.out.println(y);
        System.out.println(j);

        System.out.println("sum of numbers are : " + (w+y+j));//this is how string and equation should be written out
        //in order to get the sum of all numbers

        //if x is divisible by 2, 3, or 5
//since we know our condition to be if it is divisible by 2 we can write that out but we write our variable w so that
        //it can be re-usable
        boolean divisibleBy2ForW= w % 2 == 0; //if remainder is equal to 0 it is divisible by two

        System.out.println(w + " is divisible by 2 " + divisibleBy2ForW);

        boolean divisibleBy3ForW= w % 3 == 0; //if the output equals 0 then it is divisible by 3 ex: in this case
        // 30 goes into 3, 10 times whole so there is 0 remaining so this is true

        System.out.println(w + " is divisible by 3 : " + divisibleBy3ForW);


    }
}
