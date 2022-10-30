package RecapAfterGitHub;

public class Array4 {
    public static void main(String[] args) {
        /*create a condition that will check list of array and it will print even numbers from the list

         */
        int [] numberList={1,2,45,67,8,10,500,2,40};

        //initialize logic what is your starting point, ending point and iteration? ending point length-1

        for (int i=0; i<numberList.length; i++){

            if (numberList[i]%2==0){
            System.out.println("number " + numberList[i]+" is even");
        }else{
                System.out.println("number " +numberList[i]+ " is odd");//i chose to do this for practice
            }

        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //create a condition that will print min and max number from given array

        int [] numberList2={200,1,2,45,67,8,10,500,2,40,-10,-100};
        int maxNumber=numberList2[0];
        int minNumber=numberList2[0];

        for (int k=0; k<numberList2.length; k++){
            if (numberList2[k]>maxNumber){//if will check all the numbers as opposed to for loop it breaks when false
                maxNumber =numberList2[k];
            }
            if (numberList2[k] < minNumber){//we need another if statement because we are comparing 2 separate variables
                //we dont have to tell java to start at index 0 again because we have already defined where to start
                //with our variable k
                minNumber=numberList2[k];//this is saying reassign my min number to the number at numberlist2[k]
            }
        }
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);

    }
}
