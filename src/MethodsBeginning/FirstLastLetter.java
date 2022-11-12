package MethodsBeginning;

import java.util.Arrays;
import java.util.Scanner;

import static MethodsBeginning.MethodsRealBeginning.hello;

public class FirstLastLetter {
    /*TASK: create a java program that will ask for 5 string-names to store in array.
    print first and last letter from each string
    EXAMPLE: input: wualter, Katalina, Jennifer, adalyn
    output: wr,ka,jr,an.
     */

    public static void main(String[] args) {
        /* log steps to begin solving this problem. how do we ask the user for String names? answer= Scanner
        What should your names be stored in? answer= array String
        we'll use a loop to get the 5 names
        how do we get letters at a certain index number may it be 1st or last etc? amswer= we use CharAt method
        we can use for each loop once we have established our 5 names or the total. then we can go through all of them
        and add them to new string.
         */
        Scanner scan = new Scanner(System.in);
       String [] nameList= new String[5];//to store five names/ this is establishing length of array

        for (int i=0; i< nameList.length; i++){
            System.out.println("Enter a name for index : "+i);//i is our index circulating and increasing throughout
            //our loop so that is why we have included it so we know what index our name will go at.
            nameList[i]= scan.next();//as we loop we ask user to add value to index at i by using scan.next
            //we use scan.next and not nextLine because we are only entering one word. .next() does not take enter
            //so if i were to need to use it again we could not it would consume enter we would need a .nextLine to take
            //enter and continue with the program. .next also takes no spaces if we were to write a space it would
            //consume our .next and skip one ex: index 0 we could enter but if we added space it would skip to enter
            //index 2 index 1 would be consumed by "space".
        }
        //to print all names
        System.out.println(Arrays.toString(nameList));
        String firstLastLetters="";

        for (String eachName : nameList) {

            firstLastLetters+= " " + eachName.charAt(0) + eachName.charAt(eachName.length()-1);

        }
        System.out.println(firstLastLetters);

    }

}
