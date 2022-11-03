package RecapAfterGitHub;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        /*String methods that return an array
        Method                Description                                        return type
        toCharArray()        this will take a string and return a char array      char []= single character

        Strings are multiple characters together to form a string
         */

        String str = "Hello World Java is fun";
       // System.out.println(str.toCharArray());

        char [] letters=str.toCharArray();
        System.out.println(letters[3]);//will return just 2nd l in
        System.out.println(Arrays.toString(letters)); //i will see [h,e,l,l,o etc..] it stores them individually
        //even spaces as char
        System.out.println(letters[7]);

        /*String method     split()      function = this will split given string from specific condition in the string
        return type = String()
         */

        String myString ="Java is very fun hello world";
        //TASK : SPLIT GIVEN SENTENCE FROM SPACES

        String [] splitSentence=myString.split(" ");//splits from spaces ex: {java, is, very, etc..}
        //so after every space it'll create an index
        System.out.println(Arrays.toString(splitSentence));//remember tp print an array you need to convert it to a
        //string using to.String method
        System.out.println(splitSentence[0]);

        String [] splitSentence2= myString.split("a");
        System.out.println(Arrays.toString(splitSentence2));//wont include the letter a, it splits from a and removes a

        //to split from each letter
        String [] split3=myString.split(""); //dont forget to specify it is an array -->[]
        System.out.println(Arrays.toString(split3)); //now you get the same result as toCharArray and the benefit
        //of doing it this way is that you can do it from anywhere in your array so it doesnt have to be all of them
        //you could split from a specified place... spaces are included

        /*
        ToCharArray vs split
        split is more specific to split anywhere you want
        split returns a string array and toCharArray returns char array
         */



    }
}
