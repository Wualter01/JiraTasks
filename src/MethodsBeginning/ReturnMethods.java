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
        return result;//now since we have established that we need to return a string we have to literally write
        //"return result" which is our string.
    }
    public static void main(String[] args) {
        minNumber(63, 44);
        minNumber(23,35);
        minNumber(13,115);
        minNumber(0,35);
        minNumber(23,0);
        minNumber(2,35);

        /*
        group one=63,44
        group two=23,35
        group three=13,115
        group four=0,35
        group five=23,0
        group six=2,35
         */
        //get minimum number for each group, add 10 to result of group 4, and remove 10 from result pf group 2
    }

}
