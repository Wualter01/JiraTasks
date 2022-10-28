package Part3Recap;

public class StringMethods4 {
    public static void main(String[] args) {
        //isEmpty()        checks whether a string is empty or not               return type = boolean

        String school= "RenasTech";
        System.out.println(school.isEmpty());

        String s1="";//considered empty because it has no characters to give it value
        System.out.println(s1.isEmpty());

        String name=" ";//false because space is considered a character within quotations
        System.out.println(name.isEmpty());

        String myName= "Maryam";

        if (myName.isEmpty()){//remember that boolean return types can be passed through if else statement parameters
            System.out.println("prints because if statement is true");
        }else{
            System.out.println("prints because if statement is false");
        }
        int number1=34;//.ISEMPTY will not work with anything else than Strings

        //length           Returns the length of a specified string                return type int
      String name2="wualter";
        System.out.println(name2.length());//remember length and index are different one will tell you the total
        //count of characters which is length and INDEX WILL TELL YOU THE POSITION IN WHICH EACH CHARACTER IS.
        //ALSO INDEX BEGINS AT 0 AND LENGTH WILL START FROM 1.
//range of integer-32million to 32million

        String s3= "Java ";
        System.out.println(s3.length());//SPACE COUNTS AS A CHARACTER SO OUTPUT WILL BE 5

        String s4= "  ";
        System.out.println("length of s6 is : "+s4.length());//even tho it is empty spaces count as characters

        String name3= "Java";
        System.out.println(name3.lastIndexOf('a')); //if you have multiple letter a and you use .lastIndexOf
        //it will give you the position number of the last time it was used in said string.
        System.out.println("character at 3 is : "+name3.charAt(3)); //this will give you character at the position
        //you have specified .charAt output is a

        System.out.println("*****************");
        int name2Length= name3.length();//we can make this an int because .length returns an int
        System.out.println(name2Length);//so when we print we get an int output=4

        System.out.println(name3.charAt(name2Length-1)); //length is 4 subtract one (-1) gives us 3 and char.At 3 is a

        String str1= "Sinan"; //5
        System.out.println(str1.charAt(str1.length()-1)); //here ive done the same thing using charAt and length


    }
}
