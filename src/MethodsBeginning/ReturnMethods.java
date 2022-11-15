package MethodsBeginning;

public class ReturnMethods {
    public static void minNumber(int i1, int i2) {
        String result = "";// empty until we need to call it depending on our condition
        if (i1 < i2) {
            result = i1 + " is minimum number"; //anytime you combine a number with a string java will read it as a string
        } else if (i2 < i1) {
            result = i2 + " is minimum number";
        } else {
            result = "numbers are equal";
        }
        System.out.println(result);
    }


    public static int minNumber2(int i1, int i2) {//instead of void we have defined our return type as String
        int result = 0;// empty until we need to call it depending on our condition
        if (i1 < i2) {
            result = i1 ; //anytime you combine a number with a string java will read it as a string
        } else if (i2 < i1) {
            result = i2;
        } else {
            result=i1;
        }
        return result;//now since we have established that we need to return an int we have to literally write
        //"return result" which is our string.
    }
    public static void main(String[] args) {
        //get minimum number for each group, add 10 to result of group 4, and remove 10 from result pf group 2
         /*
        group one=63,44
        group two=23,35
        group three=13,115
        group four=0,35
        group five=23,0
        group six=2,35
         */
        //we have stored our return method minNumber in a variable so we can manipulate the result
       int group1= minNumber2(63, 44);
       int group2= minNumber2(23,35);
       int group3 =minNumber2(13,115);
       int group4 =minNumber2(0,35);
       int group5= minNumber2(23,0);
       int group6= minNumber2(2,35);

      // now we can add and subtract from our variable, with void as a return method we would not be able to do this.
        //void gives you result but does not let you manipulate result because it does not return anything.

        //add 10 to result of group 4, and remove 10 from result of group 2
        //now we can continue with our problem
        System.out.println("group4+10 = " + (group4 + 10));//anytime you want java to take your equation in a string
        //as an equation you need to do double parenthesis so that it knows this is math and not a string.
        //string+number will be read as string = group4+10 =010.
        System.out.println("group2-10 = " + (group2 - 10));

        minNumber(100,200);

        int resultOfDivision=division(20,3);
        System.out.println(resultOfDivision);//you can do it this way
        //or you can do it this way
        System.out.println(division(40,20));
        System.out.println("resultOfDivision * 3 = " + (resultOfDivision * 3));
        //the above is an  example of us manipulating our result stored in variable resultOfDivision if we had used
        //we would not be able to do this answer would be displayed but we could not store it or manipulate it
        //because void has no return type.


    }
    //create a division method. you need two integers in parameters. so youll return an integer
    public static int division(int number3,int number4){


        System.out.println("this is division method");
        System.out.println("division of "+ number3 + " / " +number4);

      return number3/number4;
    }
    //addition method
    public static void add1(int number1,int number2){
        System.out.println(number1+number2); //when we pass this method in our main method itll ask us to define 1,2
        //numbers and it will add and display it but we can not manipulate result because we have used void.
    }
    public static int add2(int number1,int number2){
       return number1+number2;//since i have done it this way ill have to sout(add2(number1, number2) in order to see
       //result and in doing it with int as a return method ill be able to manipulate result
    }
    public static byte add3(byte number1,byte number2){
        return (byte) (number1+number2);//if you wish to use byte youll have to cast your return type as byte
        //java will give you error because its saying your result might be bigger than your byte range..
        //your options are to cast to return to byte as shown or change to default integer that has a wider range.
    }

}
