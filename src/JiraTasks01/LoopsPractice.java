package JiraTasks01;

public class LoopsPractice {
    public static void main(String[] args) {
        //finding the sum of even numbers 0-30

        int sum= 0;
        int start=0;

       while(start<=30){
           if (start%2==0){
               System.out.println("adding " +start + " to sum");
               sum+=start;
           }//end off if curly bracket
           start++;//still in loop
       }
        System.out.println("sum = " + sum);
        System.out.println("*************");

        int sum2=0;

        for (int i=0; i<=30; i++){
            if (i%2==0){
                System.out.println("adding "+ i + " to sum2");
                sum2+=i;
            }
        }
        System.out.println(sum2);
    }
}
