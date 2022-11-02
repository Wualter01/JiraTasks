package JiraTasks01;

import java.util.Arrays;

public class MaxToMinArray {
    public static void main(String[] args) {
        //TASK: print max to min from any given array

        int [] numbers = {90,500,-300,1000,-600,5};
        System.out.println(Arrays.toString(numbers)); //this will allow us to see our array by turning into a string
        Arrays.sort(numbers);//this will sort them from least to greatest
        System.out.println(Arrays.toString(numbers));//this is our sorted array printed

        int [] BiggestToSmallest= new int[numbers.length];//done this way so that we can edit our array list by adding
        //or subtracting numbers without having to change the rest of the code.

        int WhereToBeginIndex = 0;//this is what we'll pass in our array index so that our BiggestToSmallest has a place
        //to start 0 will serve as index 0;

        for (int i = numbers.length-1; i >=0; i--) {// we are starting our for loop at the end of our array index
            //since we have it sorted already from least to greatest we know that our greatest number is at the last
            //index. then since we are starting at index 5 we want to say 5>=0 then subtract 1 each time it loops
            //til it is equal to 0 then our loop will break and we should have gone through all of our numbers in array
            BiggestToSmallest[WhereToBeginIndex]=numbers[i];

            WhereToBeginIndex++; //this is so that our index does not stay at 0 and as it loops it increases until we
            //have gone through and stored all of our array numbers .

        }
        System.out.println(Arrays.toString(BiggestToSmallest));// lastly we print our new array using to.string method


    }
}
