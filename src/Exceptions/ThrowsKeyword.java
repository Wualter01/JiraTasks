package Exceptions;

import java.rmi.RemoteException;

public class ThrowsKeyword {
    /* there are two ways to handle exceptions 1st with try catch blocks 2nd with throws keyword.

     */

    public static void main(String[] args) throws InterruptedException {//you can manually type this
        //throws keyword will be assigned to your method signature
        //i can write also throws Exception because we know it is parent to all exceptions or another major parent
        //exception in the hierarchy like runTime, interrupted, IO, and Remote exception
        System.out.println("hello");
        Thread.sleep(2000);
        System.out.println("wait 2 seconds");

        Thread.sleep(3000);
        System.out.println("3 extra seconds");
    }
}
