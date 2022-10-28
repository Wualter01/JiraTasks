package JiraTasks01;

import java.util.Arrays;

public class ArrayFindMinimum {
    public static void main(String[] args) {
        int arr[] ={-12, 30, 10, -2, 89, 10};

        int min = arr[0];//this is saying index 0 which in this case is -12
        int max = arr[0]; //this is also at -12 since we specified our array at index 0

        //this loop is saying if there is any number smaller than -12 then make it my arr[i] variable so as it loops
        //it checks for lesser numbers and replaces them with the least number available which will become [i]
        //arr.length is taking the size of our array and going through it to meet our condition without .length
        //java cannot see our numbers in our array
        for (int i=0; i< arr.length; i++){

            if (arr[i] < min){
                min =arr[i];

            }

            //this is saying also check if there are numbers bigger than -12 make it my arr[i] to = max so as it looks
            //it checks to see if new  number is greater than number at current variable arr[i] and if it is replace it
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(" Smallest " +min+" Largest " +max);
    }
    }

