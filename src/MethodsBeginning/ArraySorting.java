package MethodsBeginning;

import MyUtils.GenericUtils;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[] numbers = {5, 45, 67, 89, 0, 2, 4, 21, 47};
        Arrays.sort(numbers);//. sort will always go from smallest to largest
        System.out.println(Arrays.toString(numbers));
        int[] numbers2 = {5, 45, 67, 89, 0, 2, 4, 21, 47};
        descendingSort(numbers2);
        GenericUtils.StarSeparation();
        System.out.println(Arrays.toString(SmallToLarge(numbers2)));//using return int [] type
        //you could also do int [] descendingResult=SmallestToLarge(numbers2)
        //and then sout(Arrays.toString(descendingResult)); this is us storing it in a variable which we cannot do with
        //void return type
    }
    //create a method that will sort array - might be an interview question cannot use .sort
    public static void descendingSort(int [] arr){
        //first i will sort it and then reverse array so i can have array going from large to small.
        Arrays.sort(arr);//anything after this array will be sorted.

       int [] descendingArr = new int[arr.length] ;//we'll need to store our new array from large to small and this will
        //serve as our container.. we have passed arr as our length so it can be the same length as arr no matter if
        //they increase decrease doesnt matter because we have specified the length of arr.
       int lastIndex= arr.length-1;//this is specifying the starting point and where to draw the data from arr and the
        //last index length-1 so whatever value is there.

        for (int i = 0; i <descendingArr.length; i++) {//this loop is saying loop as many times as the length of arr
            //beginning at the index 0.
            descendingArr[i]=arr[lastIndex];//this is saying descendingArr value at 0 equals whatever the value is at
            //the last index of arr and we've passed last index so that java knows where to draw the value from.
            lastIndex--;//then as it loops it will decrease in index so if last index is 5 iteration is 4,3,2,1 and itll
            //fill descending array with values as it goes. DESCENDING ARRAY INCREASES AND ARR ARRAY DECREASES
            
        }
        System.out.println(Arrays.toString(descendingArr));

    }

    //create a method that will print array in descending order
    //logic is to take an array and return that array in descending order
    //that means my return type is integer array
    public static int [] SmallToLarge(int [] descendingArray){

        Arrays.sort(descendingArray);

        int [] descendingArr2 = new int[descendingArray.length] ;
        int lastIndex= descendingArray.length-1;

        for (int i = 0; i <descendingArr2.length; i++) {
            descendingArr2[i]=descendingArray[lastIndex];
            lastIndex--;


        }
        return descendingArr2 ;
}}
