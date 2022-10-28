package Part3Recap;

public class StatementContinued {
    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            System.out.println("before break");

            if (i==2){
               break;
            }
            System.out.println("After if ");
        }

        //print only even numbers from 1-10
        //first way to do it is (i%2==0) then print i
        //second way you can skip odd numbers by using continue statement

        for (int i=1; i<=10; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("****************");

        for (int i=1; i<=0; i++){

            if (i%2 !=0){//odd number// this will be true for odd numbers
                //which we want to skip odd numbers and print even
                continue;//this will skip odd numbers

            }
            System.out.println(i);
        }

        for (int i=0; i<5; i++){
            System.out.println("Before continue "+i);//0, 1, 2, 3, 4

            if(i==2){
                continue;//when you get to 2 you skip it but you dont break loop you move back to top
                //since 2 was skipped "after continue will not run since it is still part of loop
            }
            System.out.println("after continue "+i);//0, 1, 3, 4 // 2 gets skipped because of continue this is still
            //within our loop
        }
    }
}
