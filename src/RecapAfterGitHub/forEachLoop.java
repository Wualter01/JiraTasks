package RecapAfterGitHub;

import java.util.Arrays;
import java.util.Scanner;

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
            //for each loop will store each value from the numbers list in each iteration from 1st to last
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
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your string");
        String yourInput= scan.nextLine();
        String Reversed="";

        for (int i = yourInput.length()-1; i >=0; i--) {
            Reversed+=yourInput.charAt(i);

        }
        System.out.println(Reversed);
        System.out.println("*********************");

        int [] numbersList={30,2,29,0};
        Arrays.sort(numbersList);
        System.out.println(Arrays.toString(numbersList));//sort will sort numbers from least to greatest
    int [] biggestToSmallest= new int [numbersList.length];//this is specifying the length of my new array to fit
        //the data in numbersList so we can add and subtract numbers and itll always accommodate the new length
    int temp=0;//this will serve as our starting point to begin storing our numbers from biggest to smallest as they
        //circulate through the loop using variable i. if i had simply put 0 i could not move from index 0. by putting
        //it in a variable i can pass it through [temp=0=index] and now i can say temp++ and itll store numbers
        //at index 0, then temp++ new number at index 1 and so on..
        for (int i = numbersList.length-1; i >=0; i--) {//i have specified i wish to begin at numbersListarray and ive
            //specified i want to begin at last index
            biggestToSmallest[temp]=numbersList[i];//i have specified i want store numbers at i as they loop into my
            //biggest to smallest index's as they also move positions
            temp++;

        }

        System.out.println(Arrays.toString(biggestToSmallest));
    }

    }

