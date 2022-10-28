package Part2Recap;


import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
  //Scanner is a library under java, scanner has ready methods that you can use.
  //to be able to use this library we need to call them in our class and create the object from that class.
        //that is why when you begin to type Scanner java automatically predicts and suggests Scanner.util
        //and it is imported into your class.
        //to import Scanner library click  option+enter

        Scanner input = new Scanner(System.in);

        System.out.println("insert byte number");
        byte b1=input.nextByte();//input is the object name of our new scanner input represents our scanner.
        //then we ask the user to enter a byte number from keyboard or terminal. nextByte(); does this action for us
//if you assign something that is out of range of variable you will have exception/ same will happen if you provide
        //wrong input using scanner EX: if it asks for byte you cannot return a string another exception will occur
        //.nextByte helps specify to the java program what kind of input we are looking for
        System.out.println(b1);

        System.out.println("enter integer number");
        int number2=input.nextInt();
        System.out.println("integer number = " +number2);

        System.out.println("enter string");
        String str=input.next();
        System.out.println("String = "+str);

        Scanner scan= new Scanner(System.in);
        //this is another object that we created and it comes from scanner class
        //object name: scan
        System.out.println("enter short number");
        short number3=scan.nextShort();
        System.out.println("short number= "+number3);

    }
}
