package Recap;

public class IfTernaryNested {
    public static void main(String[] args) {
        /*starting point is 0              print you are at starting point
          ending point is 10               print you are at ending point
          between those numbers (1-10)     print you are on your way
          anything left will be wrong way  print some warning message
         */
//step one we must give an int variable with some value that your program will take
        int point=11;
//then we must start off with if == so that your logic makes sense otherwise code would break before program met
        //specified conditions
        if(point==0){
            System.out.println("you are at starting point");
        }else if (point==10){
            System.out.println("you are at ending point");

        }
        //we do it this way so that we can get values bigger than 0 and less than 10 everything in between
        //we do not want to include 0 in on your way or 10 as on your way 0 is starting and 10 is ending
        else if (point>0 && point<10){
            System.out.println("you are on your way");
        } else{
            System.out.println("check your point " +point);
            System.out.println("you are going the wrong way, adjust your variable value within 0-10");

        }
    }
}
