package RecapAfterGitHub;

import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
     /*Arrays java libraries with methods we can import using java.util.Arrays; this should import automatically
     but if it does not you may do it manually.A util package is a package where you store methods you frequently use.
      */

        //Task: Combine two different arrays together.

       int [] list1={1,0,5};
       int [] list2={-90,78,100,90};//i can add to both lists without affecting my new list3 because we have used
        //length
       //Expected output int [] list3={1,0,5,-90,78,100} should contain both of list 1 and 2 to make list 3

        int [] list3=new int[list1.length + list2.length];//we do it based off of the length of the array instead
        //of specifying the number so that if we were to add to any of the arrays we wouldnt have to manually change
        //the number it would just add to its total length like we've passed.

        System.out.println(Arrays.toString(list3));//since we have just specified the length of your new array to be
        //the combined total of both list 1 and 2 but we have not assigned any data yet only length. so you will get
        //the default value for int = 0

        for (int i = 0; i < list1.length; i++) {//we will put list1 values into list3
//since we have passed i for both arrays whatever is at index i will also be at index i for list 3 and as list 1 moves
            //to index 1 so will list3 index because we have passed i and it will continue to add the values until
            // condition is false and breaks loop.
            list3[i] =list1[i];
//to see what is going on within yout loop as it adds you can type: sout(list3[i])

            
        }
        System.out.println(Arrays.toString(list3));

        for (int i = 0; i < list2.length; i++) {
            //since we have already filled index numbers 0,1,2 for list3 we cannot start filling list 3 with list2 at
            //index 0 we will overwrite values already there. so we must specify where to start from using the following
            list3[list1.length+i]=list2[i]; //this will add from index 3 and on since index starts from 0, we only used
            //0,1,2 we are good to begin at index 3./ [list1.length+i] is saying starting from index 3 add i = list2[i]
            //and the second part is saying i is whatever is at the index of list2 and it will move with list two as
            //it increases and moves through index's./ list2 will start at index 0 and we have specified this with i in
            //for loop condition

        }
        System.out.println(Arrays.toString(list3));//now you have your new list3 combined with list 1 and 2.

    }

    }

