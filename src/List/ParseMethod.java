package List;

public class ParseMethod {
    public static void main(String[] args) {
        /*
        parse methods: converts string of text to the primitives, returns primitive values

        value of methods: converting string to wrapper class value, returns wrapper class values
         */

        String str="5345";
        System.out.println(str+25);//"5345" 25

        int number= Integer.parseInt(str);//5345 number not as text, we stored string in integer
        System.out.println(number+25);//5375 output because now it can do the calculation
        //parse method helps us convert string text to the primitive values and returns primitive values

        String str2="5.55";
        float f1=Float.parseFloat(str2);
        double d1 = Double.parseDouble(str2);
        System.out.println(f1+2.5);
        System.out.println(d1+2.5);

        String str3="true";
        String str4="false";
        String str5="TruE";
        String str6="FalSE";
        String str7="Hello world";
        boolean bool1=Boolean.parseBoolean (str3); //true
        boolean bool2=Boolean.parseBoolean(str4);//false
        boolean bool3=Boolean.parseBoolean (str5); //case wont matter here as Long as it says true or false
        boolean bool4=Boolean.parseBoolean(str6);//false
        boolean bool5=Boolean.parseBoolean(str7);//anything that is not either true or false ignoreCase will be by
        //Default false
        //only when we use the primitive value of boolean is "true" and "false" case sensitive
        //when we use a parse method on a string for boolean it wont be case sensitive.it will converts our string to
        //primitive value only on strings.
        System.out.println(bool1);
        System.out .println (bool2);
        System.out .println(bool3);
        System.out .println(bool4);
        System.out.println(bool5);

        String str8="hello123";

       // int myint=Integer.parseInt(str8);
        //*System.out.println(myint);//wont print you'll get an numberFormat exception because of the string attached to
        //our numbers. what we can do is try and separate them and then use parse method.*


    }
}
