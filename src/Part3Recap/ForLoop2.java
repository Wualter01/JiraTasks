package Part3Recap;

import java.sql.SQLOutput;

public class ForLoop2 {
    public static void main(String[] args) {
        for (int i = 8; i>-2 ; i--){
            //starting point= 8 ending point= -1 because we want to be greater than -2  iteration= -1
            System.out.println("wualter");
        }
       // for (int i=0; i<5 ; i--){
            //starting point = 0 ending point = 4  iteration decrease by -1
           // System.out.print("i got this ");//infinite loop because we are decreasing by -1 and we want to be less than
            //5

        for (int l=10; l<0; l++ ){
            //starting point =10 ending point = -1 iteration increased by one +1
            System.out.println("yamom");


        }
       // for (int k=10; k>0; k++){
            //starting point =10  ending point= 1, iteration increase by one 1+
           // System.out.print("jennifer ");//also an infinite loop
       // }
        for (int k=10; k>0; k-=3){
            //starting point=10   ending point = 1  iteration decrease by -3
            System.out.println("Tottenham ");
        }
        /*task create a condition that will print square numbers from 0-10
        square means number * number multiply by the number itself ex: 1*1 2*2 etc.
        output:
        number0 0
        number1 1
        number2 4
        number3 9
        we start with starting point ending point and iteration then we put our condition afterwards like below ex:
         */

        for (int number =0; number<=10; number++){
            System.out.println("square root of number is : "+number*number);

        }

        }}


