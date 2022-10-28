package Recap;

public class ArithmeticOperators {
    // float    4 bytes     stores fractional numbers. sufficient for storing 6 to 7 decimal digits
    // double   8 bytes     stores fractional numbers. sufficient for storing 15 decimal digits

    //AS A DEFAULT JAVA WILL TAKE AN UNDEFINED  DECIMAL AS A DOUBLE MUST DEFINE WITH data type

    public static void main(String[] args) {

        double d1=5.5;
        System.out.println(d1);
        double s2= 2.3333333333;

        float f1 = 2.5f;//java will take decimal numbers as a double thats why we must tell compiler this is a float
        //by using f like the example above if you wish to specifically assign it as a float thats why it is easier
        //to use the default when assigning data types

        System.out.println("2+3");// this will print 2+3 and not give you the sum java takes it as text

        int i12 =30;
        int fearGod=20;

        System.out.println(i12*fearGod);// this way is ideal to write code because you can change int i12 and int
        //fearGod and itll effect your whole code and you wont have to change it throughout the code

    }
}
