package Part3Recap;

public class WhileLoop {
    public static void main(String[] args) {
       /*Structure of for loop is starting, ending, and iteration

        */

        for (int i=0; i<100; i++){
            //starting point int i=0
            //ending point 99 condition i<100
            //iteration increase by one each time it loops
        }

        //while loop : while loop will keep running as long as while condition is true
        //initialization will be outside of while loop

        int i=0; //initialization or starting point

        while(i<11){//condition, as long as condition is true while will run
            //ending point =10
            System.out.println("hello world "+i);//runs til 10 because condition is smaller than 11

            i++;//iteration
        }
        /*while (100>95){//condition = true --> as long as it is true while loop will run (infinite)
            System.out.println("java");
        }*/

        int number1= 5;

        while(number1>0){
            System.out.println("number1 = " +number1);//
            number1--;//5,4,3,2,1, and 0 because of the order output but it will not execute to our loop condition
            //because once 0 condition is false and loop breaks
        }

    }
}
