package Recap;

public class UnaryOperators {
    //UNARY OPERATORS

    //+ WILL MAKE YOUR VALUE POSITIVE/ - WILL MAKE YOUR VALUE NEGATIVE/ --DECREASES VALUE BY ONE/ ++INCREASES VALUE BY 1

    public static void main(String[] args) {

        int number1=20;
        int number2=15;
        //number=20 you can do it this way, adding a positive sign + will do nothing to the value of it
        int number3= +number1;
        //number4=-20
        int number4=-number1; //adding a - negative sign before you call your value will make it negative

        System.out.println("number 3 : " +number3);
        System.out.println("number 4 : "+number4);

        int x=10;
        int y=-x; //result is -10
        System.out.println(y);

        boolean b1=y>0;//false
        boolean b2=x>=0;//true

        System.out.println(b1);
        System.out.println(b2);

        //if you have + before your variable it will not affect you the number
        //if you have - before variable it will make your number opposite ex:

        int i1=-15;
        int i2=+i1; //i2 = +(-15) == -15 since + sign is before variable it will not affect your value
        int i3= i1 + -i1;//i3 = (-15) + -(-15) this is what is written out and because of -(-15) it makes it positive
                         //i3= -15 + +15 ==0 this is what it looks like written out after you solve the top

        int i4= -i1; // this would be -(-15) which will make it positive
        int i5=-i3;// still 0

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
    }
}
