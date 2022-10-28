package Part3Recap;

public class ForloopStart {
    public static void main(String[] args) {
       //loops will help you with continuous actions, you will always need to specify starting point, ending point
        //and iteration

        for (int i=0; i<=10; i++) {//this will run 10 times like we have specified ex: below
         //starting point 0, ending point 10
            //iteration increased by +1
            System.out.println("Java is fun");
            //if you start at 0 and it at 10 it will have 11 results because of 0
        }

        for (int i=0; i<8; i+=2 ){
            //starting point =2  Ending point = 7 because we want to be less than 8 iteration = increased +2
            System.out.println("ran 4 times because of 0");//make sure your math is correct
        }
        for (int k=1 ; k<=10; k+=3){
            //starting point=1 ending point =10 iteration increased by 3
            //1,4,7,10 this is how it'll loop
            System.out.print("Larva ");//you will start to run with whatever is at the start ex: 1,0 will count as 1
            //turn or loop// this is also an example of print instead of println
        }


    }
}
