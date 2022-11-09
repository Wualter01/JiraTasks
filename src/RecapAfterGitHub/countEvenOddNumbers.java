package RecapAfterGitHub;

public class countEvenOddNumbers {
    //create a java program that will print count of odd numbers and even numbers from in array

    public static void main(String[] args) {
        int [] numberList={33,4,5,6,7,0,19,24,66,78,100,33,35,38,39};
        //even numbers=8
        //odd numbers=7
        /*identify logic in this case we dont need a beginning or ending point since we want to check all data provided
        so for each loop is ideal.
         */

        int evenCount=0;
        int oddCount=0;

        for (int a : numberList){//when we declare our int variable we can call it anything we want. keep that in mind
            if(a%2==0){
                evenCount++;//since we are not trying to directly add the numbers that are even to evenCount we write
                //even count++ which will just count and increase every time we have an even number

            }else{
                oddCount++;
            }
        }
        System.out.println("evenCount = "+evenCount +" oddCount = "+oddCount);
        System.out.println("***********************");
        //for loop
        int evenCount2=0;
        int oddCount2=0;
        for (int i=0; i<numberList.length; i++){
            if (i %2==0){
                evenCount2++;
            }else{
                oddCount2++;
            }
        }
        System.out.println(evenCount2);
        System.out.println(oddCount2);
    }
}
