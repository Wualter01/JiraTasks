package Recap;

public class RelationalOperators {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2= 25;

        boolean example= b2==b1;

        //== equal operator
        System.out.println(example==false);//false

        //!= opposite of equal -- not equal
        System.out.println(b1 != b2);//true

        //> is greater than : this is the lesser than symbol <
        System.out.println(b1 > b2);//false
        System.out.println(b1<b2);//true
        //this means greater or equal to
        System.out.println(10>=10);//true
        System.out.println(10>=5);//still true because 10 is greater than
        //<= means lesser or equal to
        System.out.println(10<=5);//false because 10 is not lesser or equal to 5
    }
}
