package Part2Recap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TernaryContinued {
    public static void main(String[] args) {
        /*if else with ternary

       TASK:
       1:create a java program that takes the score of student and prints the grade of student
       100 to 85 is grade A
       70 to 84 is grade B
       60 to 69 is grade C
       40 to 59 is grade D
       0 to 39 is grade F
       if number is not between 0-100 grade 0 and print "invalid number"
         */

        //if==?
        //Else == :
        //:?== else if

        int score=39;
        char grade='0';

        String result= "";
        //we must do it like this so we keep the range between 85-100 otherwise it would take scores like 101 200
        if (score>=85 && score <=100){
            grade='A';
        }else if (score>=70 && score<=84){//you could also say less than 85 but for me it makes sense my way
            grade='B';
        }else if (score>=60 && score<=69){
            grade='C';
        }
        else if (score>=40 && score<=59){
            grade='D';
        }else if (score>=0 && score<=39){
            grade='F';
        }else{
            System.out.println("invalid number");
        }
        result="student grade is " +grade;
        System.out.println(result);

        //TERNARY
        //if ?
        //else :
        //else if= :()?

//you directly link your char grade2 = you dont have to do it like if else statement
        char grade2=(score>=85 && score<=100)? 'A' : (score>=70 && score<=84)? 'B'
           :(score>=60 && score<=69) ? 'C' : (score>=40 && score<=59) ? 'D'
            : (score>=0 && score<=39) ? 'F' :'0';

         String result2="student grade is "+grade2;
        System.out.println(result2);

    }
}
