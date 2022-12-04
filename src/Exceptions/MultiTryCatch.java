package Exceptions;

import java.util.NoSuchElementException;

public class MultiTryCatch {

    public static void main(String[] args) {

       //unchecked exception because it happens after i run. this type of exception is called
        //an arithmetic exception. this can be handled with try/catch. we can have multiple catch exceptions like
        //shown below, so that you can continue to try and catch exception. Exception is class and e is your variable
        //you can catch exceptions with parent classes meaning that more than one will catch my arithmetic exception
        //below.by sequence written Arithmetic exception is the first one able to catch exception but if it were not
        //present then the following would try in this case runtime being parent of arithmetic exception would have also
        //caught exception. then Exception being the parent of all exceptions would have certainly caught it and printed
        //as soon as one catches it it will not move on to the others.
        try{
            System.out.println(10/0);
        }catch (NoSuchElementException e){
            System.out.println("no such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array exception");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }catch (RuntimeException e){
            System.out.println("Runtime exception");
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}
