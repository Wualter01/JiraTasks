package RecapAfterGitHub;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        /*create a condition that will reverse a given sentence
        EX: java is fun  output should be = fun is java
        create a condition that will reverse given string
        EX: java is fun       : output should be nuf si avaj
         */
       
      String sentence="Java is fun";

      //1st store my sentence in words (String array) EX:
        // [java, is, fun ] then have last word printed at the beginning
        //then move to the first word
      String [] splitSentence=sentence.split(" ");
        System.out.println(Arrays.toString(splitSentence));

        String reverseSentence=""; //empty string to store new string (container)

        for (int i = splitSentence.length-1;  i>=0; i--) { //so we start at the last index of splitSentence and
            //then go on til you reach 0 (i>=0;)
           reverseSentence+=splitSentence[i]+" ";//this is how you get and add things to our container
            //we are saying for splitSentence whatever is at [i] add it to reverseString then we want to add a space
            //to make our code more readable

        }
        System.out.println(reverseSentence);
        System.out.println("***********************");

        String container2="";
        for (int i = sentence.length()-1; i >=0; i--) {
            container2+=sentence.charAt(i);

        }
        System.out.println(container2);
        //different way to do the above reverse string using split method
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        String sentence2="Java is fun";
        String [] splitSentence2= sentence2.split("");
        String container3 ="";

        for (int i = splitSentence2.length-1; i >=0; i--) {
            container3+=splitSentence2[i]+" ";//space is optional for this one

        }
        System.out.println(container3);
    }
}
