package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        //unchecked (unexpected event): if a program throws an unchecked exception , it reflects some error inside
        //the program logic during run time.. runTime exception is the parent of all exceptions

        //System.out.println(20/0);//this is an example of an unchecked exception because we have no errors or red marks
        //indicating possible exception. Meaning that exception happens during runTime. (unexpected event)

        String name = "java";
        System.out.println(name.charAt(10));//another example of unchecked exception, happens during runtime and not
        //before.

       // int [] arr={3,4,5}; also an unchecked exception because it happens after i run

        //Thread.sleep(5);//this is an example of checked exception, exception happens right away and you can
        //choose to handle it accordingly. in this example by throws "interruptedException" this will allow us to
        //handle exception and continue with our code

        //File file1 = new File("hello.txt");
        //FileInputStream fileInputStream = new FileInputStream(file1); //another example of checked exception



    }
}
