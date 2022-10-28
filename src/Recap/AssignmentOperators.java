package Recap;

public class AssignmentOperators {
    public static void main(String[] args) {

        int number=125;
        System.out.println(number);

        //if you want to reassign your number variable to 100
        number=100;
        System.out.println(number);

        int number2=25;
        number2=number;
        System.out.println(number2);//now will also be 100 because we have reassigned it

        int x=10;
        x=x+10;
        System.out.println(x);//since we have established that x is now 10 we simply add 10+10 result = 20
        x=x+30;//since x+10=20 x is now 20 so now your adding 20+30=50
        System.out.println(x);

        x +=100;//same as x = x+100
        System.out.println(x); //result is 150 because we are doing our now x=50 and adding 100

        int y=20;
        y=y+20;//40
        y +=20;//60

        y*=2;//y = y * 2 =->  60 * 2= 120
    }
}
