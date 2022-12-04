package Exceptions;

public class ErrorVsExceptions {

   /* there two types of exception:
            1. unchecked (unexpected event) if a program throws an unchecked exception,
            it reflects some error inside the program logic occurs during run time
   RuntimeException class is the parent of all exceptions.

   2.checked (unwanted events): In general, checked exceptions represent errors outside the control of the program.
   occurs during the compile time. needs to be handled immediately.

   Exceptions and errors both are subclasses of Throwable class.
  The error indicates a problem that mainly occurs due to the lack of system resources
  and our application should not catch these types of problems.
  Some of the examples of errors are system crash error and out of memory error.
  Errors mostly occur at runtime that's why they belong to an unchecked type.

  Exceptions are problems which can occur at runtime and compile time.
  It mainly occurs in the code written by the developers.
  Exceptions are divided into two categories such as checked exceptions and unchecked exceptions.

exceptions can be considered warnings that can be handled.
    */

    public static void main(String[] args) {
        method(5);
    }

    public static void method(int number){
        while(number !=0){
            number = number+1;//6
            method(number);//6 stack overFlow error your method is infinite it will continue to load infinitely this
            //is a system or internal error
        }
    }

}

class exceptionExample{


    public static void main(String[] args) {

        int number1=100;
        int number2=0;

        int result = number1 / number2;//this is an error outside the system this a math error. not making it an
        //internal problem therefor it is an arithmeticException.

    }
}
