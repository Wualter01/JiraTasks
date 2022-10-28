package Part2Recap;

public class StringMethodsContinued {

    /*

    METHODS                 DESCRIPTION                                                 RETURN TYPE
    charAt()              returns the character at the specified index (position).      char

    concat()              appends a string to the ends of another string.                  String

    contains ()           checks whether a string contains a sequence of characters        boolean

    endsWith()            checks whether a string ends with the specified character(s)     boolean

    equals()              compares two strings. returns true if the strings are equal,     boolean
                          and false if not

    equalsIgnoreCase()    compares two strings, ignoring case sensitive                    boolean

    indexOf()             returns the position of the first found occurrence               int
                          of specified characters in a string.

    isEmpty()             checks whether a string is empty or not                          boolean

    LastIndexOf()         returns the positions of the last found occurrence of            int
                          specified characters in a string.

    Length()              returns the length of a specified string                         int

    replace()             searches fa string for specified value , returns a new string..  string
                          where the specified values are replaced.

    replaceFirst()        replaces the first occurrence of a subString that matches
                          the given regular expression with the given replacement           string

*/

    public static void main(String[] args) {
      // concat()                 appends a string to the end of another string            data type = string

        String firstName = "Hello";
        String lastName = "World";

        //+ was used to concat strings before this class
        System.out.println(firstName + " " +lastName);

        //both of these are acceptable when concatenating strings. without " " our quotes it would output HelloWorld
        //so we add our quotes to make it more readable
        System.out.println(firstName.concat(" " +lastName));
        System.out.println(firstName.concat(" ").concat(lastName));

        System.out.println("***************");

        int score= 90;
        String fullName = firstName.concat(" ").concat(lastName);
        //number + text = text  the following is this applied there are ways to get around using concat with int
        System.out.println(fullName.concat(" score is : ").concat(" "+score));

        //contains   checks whether a string contains a sequence of characters       data type = boolean
        //contains will check if the string contains given value if it does it will return true if it does not
        //it will return false

        String sentence = "Java is fun@@233";
        System.out.println(sentence.contains("a"));//true
        System.out.println(sentence.contains("A"));//false no capitol A
        System.out.println(sentence.contains("Ja"));//true
        System.out.println(sentence.contains("Ja "));//false because of the space after a anything in quotes has index
        System.out.println(sentence.contains("va ")); //true because we have the same sequence of characters entered
        System.out.println(sentence.contains("@2@"));//false because we do not have the same sequence of characters

        boolean b1 = sentence.contains(" "); //contains is a boolean condition so we can use a boolean variable
        //in this form

        System.out.println("****************");

        //endsWith()     checks whether a string ends with specified character(s)    return type boolean
        //if your string ends with given condition it will be true if not it is false

        String sentence2= "hello world, java is here 47";
        System.out.println(sentence2.endsWith("here"));//this will be false because we did not include the space after
        //here
        System.out.println(sentence2.endsWith("7"));//true because it is the last character
        System.out.println(sentence2.endsWith("47"));//true because the sequence we have provided is the same as the one
        //in sentence2
        System.out.println(sentence2.endsWith(" 47"));//also true because sequence of characters provided matches the
        //the sequence in sentence2.
        System.out.println(sentence2.endsWith("here47"));//false because character sequence is different
        System.out.println("hello world java is here 47"); //true because it ends with all of the characters provided

    }
}
