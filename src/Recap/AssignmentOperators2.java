package Recap;

public class AssignmentOperators2 {
    public static void main(String[] args) {

        int x= 100;
        int y= 200;
        //JAVA READS CODE FROM TOP TO BOTTOM

        System.out.println(x + "  ,  " + y);

        x= -y;//x got reassigned to -200
        System.out.println(x + "  ,  " + y); //x is now = to -200 but y is still 200 hence why result is -200,200
        //System.out.println(x+y);//this -200+200=0

        x -=y;// x= x-y ---> x= -200-200=-400 take x -=y literal so you can understand it
        //the reason y doesnt change is because we are only reassigning x and not y
        System.out.println(x + " , "+y);

        int z=10;
        int w= 20;

        z= w-z +10 + --z; //20-10= 10+10 = 20 + 9=29 since --z became 9
        System.out.println(z);
        //now z=29 from now on

        int a =10;
        a-=a+a-a+20;
       //10- (10+10-10+20) result = -20 you must go exactly the way it is written start with whats on the other side
        //of the equal sign so imagine its in parentheses like so and youll get 10 - 30=-20
        System.out.println(a);

        int  number =20;

        number *=2; //number = number * 2

        System.out.println(number);//40

        number/=3; // number = number / 3
        System.out.println(number);//13 because number is an int and int prints only whole numbers
    }
}
