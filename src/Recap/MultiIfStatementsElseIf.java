package Recap;

public class MultiIfStatementsElseIf {
    public static void main(String[] args) {
        /*check 2 numbers
        first check if theyre equal to each other
        second check if one is bigger than the other
        last check if number is smaller than the other
        it is more efficient to use multi if statements if you have more than one condition
        ELSE CAN ONLY BE DONE ONCE BUT IF ELSE CAN BE DONE VARIOUS TIMES AS WELL ELSE IF
        START WITH IF ELSE AND THEN ELSE IF AND ELSE FOR LAST CONDITION
         */
//THIS MUST BE DONE WITH == STATEMENT FIRST OTHERWISE IF IT WERE >= GREATER THAN OR = TO IT WOULD PRINT X IS GREATER
        //THAN WHY... THIS IS THE REASON WHY YOUR LOGIC MUST MAKE SENSE AND BE IN SOME TYPE OF ORDER IF THEY HAVE MORE
        //THAN ONE IN COMMON
        int x=25;
        int y=15;

        if (x==y){
            System.out.println(x+ " equal to "+y);
            //else if allows us another condition like so
        }else if (x>y){
            System.out.println(x +" is greater than "+y);
        }else{//so if above statement is false then we can say by default that it is smaller with following code
            System.out.println(x +" is smaller than "+y);
        }
    }

}
