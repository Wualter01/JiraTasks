package Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        /*there are two ways to handle exceptions so they dont stop compiler from running first : you can use
        try/catch blocks to handle / second : you can use throws keyword to handle
         */

        System.out.println("Hello Hello");
        try{
            System.out.println("waiting 5 seconds start");
            Thread.sleep(5000);//checked exception because you can immediately see exception
            System.out.println("5 second ended");
        }catch(InterruptedException e){//interruptedException is class e is variable
            System.out.println("e.getMessage() = "+e.getMessage());
            //the logic behind java throwing exception while using thread.sleep is that you are slowing
            //down compiler by 5 seconds and it goes against its nature you could say.

        }

        System.out.println("done");

        //Below we've created a timer using while loop and thread.sleep and an example of checked exception
        int number=0;
        while(number < 60){
            System.out.println(number);

            try{
                Thread.sleep(1000);//your exception youre trying to try/catch hs to be in between try/catch
                //blocks
            }catch (InterruptedException e){
                //exception is parent of all exception types, you can use exception all types of exceptions
            }
            number++;
        }

        System.out.println("Done");

    }
}
