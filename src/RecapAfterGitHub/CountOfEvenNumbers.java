package RecapAfterGitHub;

public class CountOfEvenNumbers {
    /*TASK: from 2D array, create a java program that will print odd and even numbers
    count of even and odd.... also it will print sum of odd numbers and sum of even numbers
     */

    public static void main(String[] args) {

        int [][] number2={

                {1,2,3,4},
                {5,6,7,25},
                {8,9,10,11,55}

        };
        // we establish variables that will contain even numbers, odd numbers and the sum of both.
        int evenNumbers=0;
        int oddNumbers=0;
        int sumOfEvenNumbers=0;
        int sumOfOddNumbers=0;

        for(int[] each1D : number2){//since we have a 2 dimensional array we'll need a nested for each loop to go
            //through and fetch all the data. it starts by bringing the containers

           for (int eachValue : each1D){//after getting containers i can finally reach values.
               if (eachValue%2==0){//then comes my if statement for my even numbers

                   System.out.println(eachValue+ " is even number");
                   evenNumbers++;//then ill need to increase the count of even numbers every time it loops to an even
                   //number the count will increase by one
                   sumOfEvenNumbers+=eachValue;//now i want to add all the even numbers as they loop so i can get a
                   //total/   this is saying 0+first even number and so on and so forth adding each new even number to
                   //my total.

               }else{//we'll follow the same process for odd numbers
                   System.out.println(eachValue+" is odd number");
                   oddNumbers++;
                   sumOfOddNumbers+=eachValue;
               }
           }

        }
        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);
        System.out.println("sumOfEvenNumbers = " + sumOfEvenNumbers);
        System.out.println("sumOfOddNumbers = " + sumOfOddNumbers);
    }}

