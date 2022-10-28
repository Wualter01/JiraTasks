package Part3Recap;

public class SumOfEvenNumbers {
    /*
    write a program using while loop that calculates the sum of even numbers between 0-30

     */

    public static void main(String[] args) {
        //starting point is 0 ending point is 0
        //iteration can be done by +2
        //you don't need if condition if you increase by 2, only need if you increase by one

        int sum1=0;

        //for loop
        for(int i=0; i<=30; i++){//i is still 0 because our ++ is after i ex: i++ so after your condition add 1
            if (i%2==0){//if you divide 0 by 2 you get whole zero and that makes it even
                System.out.println("adding " + i +" to sum1");
                sum1+=i;
            }
        }
        System.out.println("sum1 = "+sum1);
        System.out.println("****************");

        int start2= 0;//when doing while we have to define or initialize outside of loop
        int sum=0; //this is our container where we will store our sum

        while(start2<=30){
            if (start2%2==0){
                sum+=start2;
                System.out.println("adding "+ start2 + " to sum");
            }
            start2++;//this needs to be outside of if condition but still within our loop because we want it to always
            //increase by one til it is equal to 30 our if condition takes care of only adding even numbers

            //if i were to print something here it would run 30 times because loop always checks every single iteration
            //if condition only runs 15 times because of even numbers
        }
        System.out.println("sum = " + sum);
        //MY CONDITION IS IF IT IS DIVISIBLE BY 2 AND REMAINDER IS 0 THEN ADD THE PREVIOUS EVEN NUMBER TO IT
        //SO ITS CONSTANTLY ADDING AS THE EVEN NUMBER CONDITION IS TRUE// WE ARE NOT PRINTING EVEN NUMBERS
        //WE WANT THE SUM OF ALL THE EVEN NUMBERS COMBINED THROUGH 30
    }
}
