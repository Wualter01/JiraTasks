package JiraTasks01;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastLetterPractice {


   /* TASK: create a java program that will ask for 5 string-names to store in array.
    print first and last letter from each string
    EXAMPLE: input: wualter, Katalina, Jennifer, adalyn
    output: wr,ka,jr,an.

    log steps to begin solving this problem. how do we ask the user for String names? answer= Scanner
    What should your names be stored in? answer= array String
    we'll use a loop to get the 5 names
    how do we get letters at a certain index number may it be 1st or last etc? amswer= we use CharAt method
    we can use for each loop once we have established our 5 names or the total. then we can go through all of them
    and add them to new string
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] namesList= new String[5];//we make the object of namesList and specify how many Strings will br in
        //this container.
        for (int i = 0; i < namesList.length; i++) {//since we have a beginning and ending point we want to use a for
            //loop in our case.
            System.out.println("Enter name for index : " +i);
            namesList[i]= scan.next();//this will allow us to add value to our index's at whatever i is it loops.

        }
        System.out.println(Arrays.toString(namesList));
        String firstLastLetter="";

        for (String eachName:namesList) {//we are telling java grab our data values from namesList and store them
            //in our newly declared variable eachName
            firstLastLetter+=" "+eachName.charAt(0)+eachName.charAt(eachName.length()-1);//now we are telling java
            //store our first letter and our last letter into our container "firstLastLetter". for that we do eachName
            //.CharAt 0 which will bring me first letter and then we do charAt(eachName.length-1) which gets us letter
            //at the last index.. remember eachName hold our data values as it loops it servers as a container and
            //then we reassign each data value to firstLastLetter.it holds one at a time and our += will add them as
            //they loop to firstLastLetter.

        }
        System.out.println(firstLastLetter);//we then print the values stored and is no longer an array
    }
}
