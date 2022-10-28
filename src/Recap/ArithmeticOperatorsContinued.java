package Recap;

public class  ArithmeticOperatorsContinued {
    public static void main(String[] args) {

        //arithmetic operators are subtracting, adding, dividing, division and remainder using data types
        //with variables ex: int yamoms=300;
        //byte goes from -128 - 127 and it stores the smallest amount out of short long and int, safer just to use
        //int so that you dont worry about limitations
        byte oscarAge=31;
        byte haliAge=69;

        //you may also use float depending on the range youre looking for
        double libbyAge=25.5;//double is bigger than float thats why it is the default..it can old up to 15 decimals
        //as float can only hold 6-7
        double muhamedAge=120.7;


        //adding WHEN A DECIMAL IS IN YOUR EQUATION A DECIMAL WILL ALWAYS BE A PART OF YOUR RESULT
        //SAME CAN BE SAID ABOUT TO WHOLE NUMBERS RESULT WILL ALWAYS BE WHOLE BUT IF EVEN ONE OF YOUR NUMBERS
        //IS DECIMAL SO WILL YOUR RESULT
        System.out.println(oscarAge+libbyAge);
        System.out.println(haliAge+oscarAge);
        //THIS IS AN EXAMPLE OF A DECIMAL BEING IN A THE RESULT SINCE A DECIMAL WAS PART OF THE EQUATION
        System.out.println(libbyAge * 2);

        //DIVISION/ this is an example of how it is written out
        System.out.println(libbyAge / 2);

        //REMAINDER OPERATOR %
        System.out.println(10 % 5);
    }

}
