package RecapAfterGitHub;

import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {
        //ARRAY METHODS
        //SORT

        int [] numbers={90,-2,45,87,-299,4,6};
        System.out.println(Arrays.toString(numbers));//this will turn my array into a string so i can print it

        Arrays.sort(numbers);//when i use sort method from Array.utils it will sort my numbers from least to greatest
        System.out.println(Arrays.toString(numbers));//now next time i print it it'll be sorted

        //TASK: create a method that will print the max number from in array

        //first solution
        int min=numbers[0];//im choosing number at index 0 as my min number, it wont matter because when we loop
        //im am specifying start at 0 and check all the numbers
        int max=numbers[0];//im assuming index 0 in number array is max number
        for (int  i= 0;  i< numbers.length; i++) {
           if (numbers[i]>max){
               max=numbers[i];
            }
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]<min) { //numbers[i] go first because that is what we're comparing we want to compare it
                    //to our min and if it is smaller it becomes our new min number.
                    min=numbers[i];

                }

            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        //SOLUTION 2
        int [] ages={24,89,100,5,25};
        Arrays.sort(ages);//this method sorts my int array from largest to smallest
        System.out.println(Arrays.toString(ages));
        int maxNumber= ages[ages.length-1]; //this will get me the last index of my array since it has already been
        //sorted from least to greatest the last index should be greatest number
        int minNumber=ages[0];//since our array has been sorted i can assume that first index is our min number
        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        String [] names={"Wualter","Jennifer","Adalyn","Katalina"};
        System.out.println(Arrays.toString(names));
        //we can also sort our string array according to ascii table with the first character either by alphabetical
        //order or symbol order
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


    }
}
