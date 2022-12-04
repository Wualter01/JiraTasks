package Exceptions;

import java.util.NoSuchElementException;

public class FinallyBlock {
    public static void main(String[] args) {

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
        }finally {
            System.out.println("Finally block");
        }
        //finally block will execute no matter what even if your try/catch fails to catch exception
    }
    }


