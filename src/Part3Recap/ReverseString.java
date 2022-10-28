package Part3Recap;

import java.util.Scanner;

public class ReverseString {
    //Task reverse a string
    public static void main(String[] args) {
     //we want to print our reverse string from last index to first index
        //solution one would be pass a string "hello and do "" charAt +4,+3,+2,+1,+0 and then assign this to a new string
        //but because we are using charAt we must first pass empty " "+ marks so that it becomes a string
        //THE ABOVE WILL ONLY WORK WITH ONE ONED IF YOU WISH TO USE ANOTHER WORD YOU NEED TO UPDATE CHARAT

        //second solution is:
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your word : ");
        String word= scan.nextLine();

        //first index will always be 0 last index we do not know because user will provide word. so we use length -1
        //since length starts at 1 and index starts at 0 -1 will always give us last index number of characters or
        //string..we need to go from last to first one by one ITERATION -1

        int lastIndex = word.length()-1;
        String reverse="";//i need to store word from last index to first index

        for (int i=lastIndex; i >=0; i--){
            System.out.println("i = "+i);
            System.out.println("reverse word = " +reverse);
            System.out.println("word.CharAt(i) = "+word.charAt(i));
            reverse +=word.charAt(i);
            System.out.println("after adding charAt(i) to reverse = "+reverse);
        }

        System.out.println(reverse);
    }
}
