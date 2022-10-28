package Part3Recap;

public class ForLoopPractice {
    /*Task: Write a program that will check numbers 1-50
    If the number is divisible by 2 print JA            / to check whether number is divisible by 2 number % 2==0
    If the number is divisible by 3 print VA           / number %3 ==0
    If the number is divisible by 2 and 3 print JAVA number% 2  / number %2==0 && number %3 ==0
    if it is not divisible by 2 or 3 print number itself     number %2!=0 && number %3 !=0
    find your logic that will apply to you program like we have started with if conditions
    then your loop where to start where to end and iteration or how many times it needs to increase or decrease
    as it loops
     */
    public static void main(String[] args) {
      // int i=6; after using for loop and defining our int we do not need this here
        //SIDE-TASK GET THE COUNT OF NUMBERS DIVISIBLE BY 2 AND 3 AT THE SAME TIME

       String result="";

       int count2And3=0;
       //i can do the same for count for just 2 and just 3

       for(int i=1; i<51; i++){

        if (i%2==0 && i%3==0) { //this needs to be first due to logic because if you have 6 it will first
            //tell you that it is true for first condition and not print or even check the rest
            result+="JAVA ";
            count2And3++; //this will add it to our variable every time a number is divisible by 2 and 3
            //then we simply print outside the loop to see our total

        }else if(i%3==0){
            result+="VA ";
        }else if (i%2==0){
            result+="JA ";

        }else{
           result+=i+ " ";//you will have a number  //result = 1
        }
    }
        System.out.println("result = "+result); //make sure you are printing outside of your loop
        System.out.println("count for 2And3 = "+count2And3);
}
}
