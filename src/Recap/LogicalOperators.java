package Recap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class LogicalOperators {
    public static void main(String[] args) {
        //&&---and   - true only if both expression 1 and expression 2 are true if even one is false result is false
        //||--or     -true if either expression1 or expression2 is true, if even one is true result will be true
        //!--not     -true if expression is false and vice versa

        System.out.println((4>2) && (2>4 ));//false -when true and false conditions are compared result is false
        System.out.println((10<=5) && (0==0));//false -this is also true for these conditions
        System.out.println((1>=2) && 2!=2);//-if both conditions are false then you have false as a result
        System.out.println((10>=10) && (10<=10));//true - only when both are true conditions will you have true
        //IF EVEN HAVING ONE CONDITION FALSE WILL MAKE WHOLE OUTCOME FALSE EX: TRUE, TRUE, TRUE, FALSE = FALSE

        System.out.println("******************");

        //  || or condition

        System.out.println((4>2) || (2>4 ));//true/false = true because one condition is true
        System.out.println((10<=5) || (0==0));//false/true = true because one condition is true
        System.out.println((1>=2) || 2!=2);//false/false = false because not even one condition is true
        System.out.println((10>=10) || (10<=10));//true/true = true because both conditions are true and if even one is
        //true EX: false, false, false, false, false, true = when using or(||) condition will be true because one is
        //true

        //! not condition

        boolean bool1=true;
        boolean bool2= !(10 !=15);

        System.out.println(bool1 && bool2);//true / false since we are using && if even one condition is false outcome
        //will be false

        boolean b3= !!!!!!bool1;//each exclamation mark will cause it to change from either true or false so you must
        //apply it the amount of times specified by ! marks so in this case 6x it makes it true
        boolean b4= !(15>=15);//false

        System.out.println( (b3 || b4) && true); // now we are comparing true and true since our or statement condition
        //demands that if even one is true outcome is true. RESULT = TRUE

        System.out.println(("jennifer" == "abe") || ("wualter"=="Wualter"));//false since neither condition yields true
        //even tho wualter is equal to Wualter java is CASE SENSITIVE SO RESULT WILL STILL BE FALSE also anything
        //in quotations must be the same including spaces

    }
}
