package RecapAfterGitHub;

public class nestedForEachLoop {
    public static void main(String[] args) {
     //any loop type can be in any loop (nested).

        int [] arr={10,5,10};

        for (int each : arr){//syntax for : for each loop you declare your variable that will server as your container
            System.out.println(each);//for each you print inside loop curly brackets
            //remember for each loop will check whole data in array without having to declare starting and ending point
        }

        int [][] arr2D={  {1,2,3},  {4,5},  {6,7,8,9,10,11,12}  };
        /*logic for getting data values from 2D array using nested for each loop first loop will get containers then
        your nested for each loop will get the values from containers.
        we start by creating an int array that will store our containers from 2D. we must break it down to reach
        our values. examples shown below
         */

        for (int [] eachContainer1D : arr2D){//the containers must be stored into in array int until we can reach values

            for (int eachValue : eachContainer1D){//the values can be stored into an int variable without using an array
                System.out.print(eachValue+" ");
            }
            System.out.println();

        }
    }
}
