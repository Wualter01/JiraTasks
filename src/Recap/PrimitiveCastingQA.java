package Recap;

public class PrimitiveCastingQA {
    /*this will sometimes be an interview question
    we have two types of casting
    1.implicit casting (done automatically from java)
    2.explicit casting (needs to be handled manually)

    double, float, long, int, short, byte
     */

    public static void main(String[] args) {

        byte number1=20;// byte range -128 to 127
        long number2= number1;//implicit casting (this will be done by java auto)
        //nothing will change we just extended the range of our number java automatically makes the change
        //also BECAUSE WE TRIED TO ASSIGN SMALLER RANGE TO BIGGER

        int i1=10;
        byte b1= (byte) i1; //this is explicit casting we must manually handle error THIS HAPPENS WHEN WE TRY TO
        //ASSIGN BIGGER DATA TYPE TO SMALLER AS LONG AS IT IS IN RANGE WE CAN STILL DO IT BUT WE WILL HAVE TO HANDLE
        //ERROR MANUALLY LIKE SHOWN ABOVE

        double d1=2.5; //this is bigger than float hence why we need to do explicit casting (manually handle) when
        //assigning to d1 variable
        float f1= (float) d1;

        int i2=500;
        long l2=i2; //implicit because long is bigger than int so casting happens automatically when going from small
        //to bigger

        double d12=2.5;
        byte b2 = (byte) d12;

        System.out.println(d12);//2.5
        System.out.println(b2); //if i cast 2.5 as a byte which is used to store whole numbers then it will no longer
        //be 2.5 since our byte only stores whole numbers*** result will be 2

        char test = 'A';//65 is also capitol A in ascii table
        int letsSee= 20;
        System.out.println(test + letsSee);//if i concatenate char with an int ill get the sum as a number it will
        //not print the character representation of the number

    }
}
