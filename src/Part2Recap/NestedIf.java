package Part2Recap;

public class NestedIf {/*nested if is if conditions inside of if conditions
if the main condition is true then you will check sub if conditions
in order to comment out an entire area you can select highlight desired area then press command+/ or uncomment
command z to undo
TASK: CREATE A JAVA PROGRAM THAT TAKES THE SCORE OF STUDENT AND PRINTS THE GRADE OF STUDENT
51 to 100 is grade A
0 to 50 is grade B
if number is not between 0-100 grade 0 "invalid number"
if student is absent
LOGIC FOR THIS CLASS OR PROGRAM IS THAT IF STUDENT WAS PRESENT CHECK GRADE IF NOT, NO NEED TO CHECK GRADE.
CHILD ATTENDING IS MAIN IF FOLLOWED BY SUB OR CHILD CONDITIONS IN THIS CASE GRADE.
DID NOT ATTEND OR ABSENT IS OUR 2ND MAIN IF OR PARENT FOLLOWED BY SUB CONDITIONS OR IFS AS IN NOT PRESENT OR ABSENT
FOLLOWED BY ENTERING AN INVALID NUMBER AS LAST ELSE CONDITION BECAUSE IT CAN STILL BE A POSSIBILITY TO ENTER WRONG
 NUMBER WE MUST COVER EVERYTHING
*/

    public static void main(String[] args) {
        int score=190;
        String attend="no";//can either be yes/no
        String result ="";

        if(attend=="Yes" || attend =="yes") {//java is case sensitive this is why weve placed it twice. MAIN IF
           if (score>=51 && score<=100){
               result="student was present, score is : " + score +" grade A";
           }else if (score>=0 && score<=51){
               result="student was present and score is : "+ score + " grade is B";
           }else{
               result="student was present and score is : "+" invalid number";//LAST SUB IF CONDITION FOR PARENT IF
           }
        }else if (attend == "no" || attend=="No"){//SECOND MAIN IF CALLED PARENT
            result="-------- student was absent, no need to check score";
        }else{
            result=" !! invalid text entered for attendance, please enter \"yes\" or \"no\" : entered text= " + attend;
        }//ABOVE IS THE LAST SUB OR CHILD IF FOR 2ND MAIN PARENT IF
        System.out.println(result);
    }
}
