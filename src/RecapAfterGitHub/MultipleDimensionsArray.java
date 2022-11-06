package RecapAfterGitHub;

import java.util.Arrays;

public class MultipleDimensionsArray {
    public static void main(String[] args) {
        /* declaration of an array: 1 dimension array = Data type [] name ={}
        2 dimensional array: data type [] [] name =
        { data1,data2,data3},
        {data1,data2},
        {data1,data2,data3}, logic is container inside of container 3 dimensional is rare to use in the industry
        mostly only two are used scenario Ex: you are trying login credentials for facebook and you want to try 10
        different
        login credentials. if you do one dimensional array you can only do username if you do 2 dimensional you can have
        username and password. or multiple data.

         */

        int [] arr={1,2,3,4,5};
        System.out.println("arr1Dimensional : "+arr.length);

        int [] [] arr2={ {10,20,30} , {0,2,40} , {20,40 }, {50} };
        //multiple dimension array has 2 or more indexes 1st: container index / 2nd: individual data index
        //EX: arr2= 3 containers index numbers are 0,1,2 and then individual index numbers starting at 0.
        //with each new container index for individual data will start at 0 it will not continue on from last
        //container

        System.out.println("3 containers equal the length for this 2Dimensional arrays : "+arr2.length);
        System.out.println(arr2[2].length); //this how to find the index number of the data in the containers
        //or container this is saying whats the length of the second container which equals the last container, last
        //because index starts ar 0

        //the first bracket is always the container number and the second bracket is the variable number [] []

        System.out.println(arr2[1][2]);//output container 2 and variable at index 2 which is 4

        //tak: print 30
        System.out.println(arr2[0][2]);
        //task print 50
        System.out.println(arr2[3][0]);//i cannot just say 3 for container at index 3 i still have to specify i want
        //the data at index 0 even if it is the only data in that container. printing only the container would give me
        //hashcode

        //task get length of each container
        System.out.println(arr2[0].length); //this is how you get the length of container at index 0
        System.out.println(arr2[1].length);

        System.out.println(Arrays.toString(arr2[1]));//this is how you print whole container and its values
        //if you try to pass the whole arr2 with toString method youll get hashcode for your containers and values

        int [] container0 =arr2[0]; //you can store a 2 dimensional container into a one dimensional container array
        //this is how you do it we've taken container 0 and placed it into its own array container



    }
}
