package Part3Recap;

import java.util.Locale;

public class StringMethods6 {
    public static void main(String[] args) {
        String fullName="Hello world";
        System.out.println(fullName.toUpperCase());//toUpperCase will make whole string uppercase and vise versa
        //when using toLowerCase
        System.out.println(fullName.toLowerCase());

        //task print initials as capital rest remain as lowecase
        String str="hEllo woRLD";

      //  String firstName= str.replace("hEllo woRLD","Hello World");
        //System.out.println(firstName); this is an easy way to do it

        //second way to do it
        String firstName = str.substring(0,1).toUpperCase().concat(str.substring(1,5).toLowerCase());
        String lastName = str.substring(6,7).toUpperCase().concat(str.substring(7).toLowerCase());
        //the above is a more complicated way to do it
        String newFullName = firstName.concat(" ").concat(lastName);
        System.out.println("newFullName = "+newFullName);

        //trim()     removes whiteSpace from ends of a string            return type String
       String str2 ="  Hello   java   is   here " ;
        System.out.println(str2.trim());//removes white space trim from beginning and end but not i the middle of
        //string

        //if you want to remove all spaces
        System.out.println(str2.replace(" ","")); //this will remove spaces from your string

    }
}
