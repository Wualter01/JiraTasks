package Part2Recap;

public class EvenOdd {
    public static void main(String[] args) {
        int number1=30;
        String result="";

        if (number1 % 2 == 0) {
            result = number1 + " is even";
            System.out.println(result);

        }else{
            result= number1 + " is odd";
            System.out.println(result);
        }
        //this reads if number1 is divisible by 2 and remainder is == to 0 print is even else is odd
       String result2 =(number1%2==0) ? number1 +" is even" : number1+ " is odd";
        System.out.println(result2);
    }
}
