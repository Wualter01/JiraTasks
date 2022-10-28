package Part3Recap;

import java.util.Scanner;

public class RemoveCharacters {
    /*TASK: create a java program that will check given string and if it starts or ends with 'a' or 'A' remove
    it from string. If it is not then leave it as is. Examples:
    if string is "hello" output should be "hello"
    if string is "Java" output should be "jav"
    if string is "Ajayaa" output should be "jav"

    HINT: try with different cases to make sure your code is working correctly.
    if you want to try multiple words, you may create scanner for multiple input
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String input = scan.nextLine();

        //i need to look at first and last index.. first index= 0 always   last index = length -1
        //first check 1st letter and if it is starts with 'a', 'A' remove it

        if (input.substring(0,1).equalsIgnoreCase("a")){
            input = input.substring(1);//to not include 0 if it is a go from 1- end. we reassign

        }

        System.out.println("new word after first if = "+input);

        //we still need to check last index if letter is = a or A if it is remove it
        int length = input.length();
        int LastIndex = input.length()-1;
        if (input.substring(LastIndex).equalsIgnoreCase("a")){
            input= input.substring(0,LastIndex);//this is saying if there is an a,A at the end of string print
            //from index 0-lastIndex we know that when we do LastIndex wherever you end letter or character is not
            //included hence why above we just put 1 so that it can go to end
        }

        System.out.println("new word after second if is "+input);

    }
}
