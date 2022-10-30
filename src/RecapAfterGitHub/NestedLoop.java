package RecapAfterGitHub;

public class NestedLoop {
    public static void main(String[] args) {
        /*nested if : if inside another if statement
        nested loop: loop inside of another loop

        Examples:
        for loop inside for loop
        while loop inside for loop
        doWhile inside while all of these are valid and can be done inside any loop
         */

        for (int i=0; i<3; i++){
            System.out.println("Java"); //will run 3 times because it starts from 0
            //anything inside this loop will run three times
            //parent loop will run this child loop 3 times for condition 0,1,2
            for (int j=1; j<5; j++){//this is 3x4 3 being the amount of times it will run its entirety and 4 times
                //when entering child loop so as it runs 3 times it enters to run 4 times then continues with parent
                //loop for a total of python=12 and java=3
                System.out.println("Python");

            }
        }
        System.out.println("***************");

        for (int i=1; i<4; i++){//will run 3 times as parent loop
            System.out.println("Parent loop start point");

            for (int k=3; k<6; k++){
                System.out.println("child loop running i is "+i + " , k is "+k);
            }
            System.out.println("Parent loop end");//runs 3 times because we have already identified that our parent
            //loop runs 3 times because of our condition
        }
        //TASK: print 10 rows and 2 columns using nested loop
        System.out.println("---------------------------------------------------------");

        int totalRow=7;
        int totalColumn=4;
        for (int i=1; i<=totalRow; i++){//this is our rows

            for (int j=1; j<=totalColumn; j++){//our columns
                System.out.print("* ");//we'll need to break this line since we used print and not println
            }
            System.out.println(); //this will break the line for child loop so that we have the rows and columns we're
            //looking for
            //without println we would have them all in a row ********** and without our print and only our println
            //we have them :
            //*
            //* like this so we need first print and then println after child loop to break line and start another row
        }
        //this is how you can print an american flag the easiest, above code
        System.out.println("---------------------------------------------------------");

        int totalRow2=4;
        int totalColumn2=4;
        for (int i=1; i<=totalRow2; i++){
            int j=1;
            while (j<=totalColumn2){
            System.out.print("* ");
            j++;
        }
        System.out.println();
    }
        //YOUR TOTAL AMOUNT OF ROWS WILL DEPEND ON YOUR PARENT LOOP AND YOUR COLUMNS WILL BE YOUR CHILD LOOP

}}
