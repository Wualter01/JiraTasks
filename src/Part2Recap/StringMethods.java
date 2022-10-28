package Part2Recap;

public class StringMethods {
    /*

    METHODS                 DESCRIPTION                                                 RETURN TYPE
    charAt()              returns the character at the specified index (position).      char

    concat()              appends a string to the ends of another string.               String

    contains ()           checks whether a string contains a sequence of characters     boolean

    endsWith()            checks whether a string ends with the specified character(s)  boolean

    equals()              compares two strings. returns true if the strings are equal,   boolean
                          and false if not

    equalsIgnoreCase()    compares two strings, ignoring case sensitive                  boolean

    indexOf()             returns the position of the first found occurrence             int
                          of specified characters in a string.

    isEmpty()             checks whether a string is empty or not                         boolean

    LastIndexOf()         returns the positions of the last found occurrence of           int
                          specified characters in a string.

    Length()              returns the length of a specified string                        int

    replace()             searches fa string for specified value , returns a new string.. string
                          where the specified values are replaced.

    replaceFirst()        replaces the first occurrence of a subString that matches
                          the given regular expression with the given replacement           string

     */

    public static void main(String[] args) {
          //                                                                                return type
        //charAt()              returns the character at the specified index (position).      char

        String str ="wualter";
                  // 0123456
        //index numbers always start with 0 in java
        System.out.println(str.charAt(4));

        char letterU=str.charAt(0);
        char letterG=str.charAt(1);

        System.out.println(letterG);

       // char ch=str.charAt(7);
       // System.out.println(ch); //output is an exception not an error there is a difference.. in this case out of
        //bounds :string index our of range

        System.out.println(str);//if we print it out but we can also get individual letters from our string

        String word= "hello world";
        //            012345678910 space is counted when using index (anything you see in a string will have index #)

        System.out.println(word.charAt(5));//this will print the space in index 5

        System.out.println("word char at 10 : "+word.charAt(10));

    }
}
