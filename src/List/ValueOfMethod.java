package List;

public class ValueOfMethod {//valueOfMethod : converting a string to wrapper class value, returning wrapper class
    //values
    public static void main(String[] args) {
        String str="55";

        Integer number=Integer.valueOf(str);//same as parse except it returns wrapper class value (object)
        int number2=Integer.parseInt(str);//returns primitive value
        //both of these take our string number values and has them read as mathematical numbers rather than read as
        //strings except one returns a primitive value (parse method) and the other returns a wrapper class value
        //(valueOf) remember wrapper class values are objects of a class.

        System.out.println(number+5);
        System.out.println(number2+5);
        System.out.println(str+" "+25); //this returns a string and a number

        String str2="55.25";

        Double d1=Double.valueOf(str2);
        System.out.println(d1+10);//will output or return wrapper class value (object)


    }
}
