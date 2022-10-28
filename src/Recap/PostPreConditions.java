package Recap;

public class PostPreConditions {
    public static void main(String[] args) {

        int x = 10;

        System.out.println(x);
        //pre condition
        System.out.println(++x); // precondition since it is before the variable output will be 11/ it will increase
        //by one immediately.
        System.out.println(x);//now x is 11 because of precondition and will continue to be 11

        System.out.println(+x);//still 11 one + wont add anything it is positive

        int y= 20;
        System.out.println(y);
        //post condition/ wont affect the number right away it will affect next step
        System.out.println(y++);//20
        System.out.println(y);//it affects next step so this is 21

        byte number1=30;
        System.out.println(number1);//30
        System.out.println(--number1);//29 affects it immediately

        int number2 =50;
        System.out.println(number2--);//50 this stays 50 as our condition is to decrease at the next step
        System.out.println(number2--);//49 following the condition at the top,
        // so now it has decrease at the next step again
        System.out.println(--number2);//47, now it has decreased again at the next step making it 48 and our condition
        //here is pre so we must decrease immediately making it 47
        System.out.println(number2++);
        System.out.println(number2);


    }
}
