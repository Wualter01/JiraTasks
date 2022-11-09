package RecapAfterGitHub;

import java.util.Arrays;

public class forEachLoop {
/*so far we have learned the following for loop, while loop, do while loop.
in this class we will learn for each loop
in do while loop do gets executed whether it is true or false do will execute at least once. Will only continue to be
executed if it is true.
for each loop: you don't specify any starting or ending point because you look for everything... this is ideal when
you want to look or go through all data and dont need to specify starting or ending point.
 */

    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5,6};

        for (int eachNumber : numbers ){//syntax for each loop to check all data
            //for each loop will store each variable from the numbers list in each iteration from 1st to last
            System.out.println(eachNumber);
        }

        String [] initials={"WV","KAV","JA","AV"};
        for(String eachInitial : initials){//this is telling java store each initial from string initials
            // as it loops into string eachInitial
            //when using for each loop we declare our string inside parenthesis and use : to tell java where to grab
            //data to assign to our new string like shown above
            System.out.println(eachInitial);//if you want to have them all in one line use print and add + " " space
            //remember youll have to break the line later so you'll need an empty sout for that.
        }

        String sentence="Hello world java is here";
        String [] splitSentence= sentence.split(" "); //this is syntax to make sentence into an array.
        //remember to specify it is an array and then specify where you would like to split it from depending on
        //what your goal logic is.

        for (String eachWord : splitSentence){
            System.out.print(eachWord+" ");//remember you have to declare your string inside parenthesis when using
            //for each loop
        }

        System.out.println();//used to break line because i have used print instead of println above


    }

    }

