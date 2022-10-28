package Part2Recap;

public class SwitchContinued3 {
    public static void main(String[] args) {
        //when using switch you cannot name your cases or pass variables as case names they must be constant or literal
        //ex: case1, case,2 you cannot say case caseNumber1 as a variable
        //default and break; are optional but if i use default in the middle of my code i must still use break;
       //ACCEPTED DATA TYPES INCLUDE THE FOLLOWING: char, byte, short, int, String. we cannot have true or false
        //boolean since we are just comparing with switch, default is int

        byte b1=1;//allowed because the default range for switch is integer anything smaller you may use anything
        //bigger switch will not take
        short s1=2;//allowed because it is smaller than integer
        int number=3 ;
        long l1=2;//not accepted
        float f1=4;//not accepted
        double d1=10;//not accepted because it is a decimal number

        //EVEN IF YOU HAVE DEFAULT IN THE MIDDLE OF YOUR CODE IT WILL STILL CHECK ALL OTHER CASES AND THEN ONLY AFTER
        //NOT MATCHING WILL IT DIFFER TO DEFAULT
        String dayName;

        switch(number){
            case 1: dayName= "Monday";
            break;
            case 2: dayName = "Tuesday";
            break;
            case 3 : dayName = "Wednesday";
            break;
            case 4 : dayName = "Thursday";
            break;
            case 5 : dayName = "Friday";
            break;
            case 6 : dayName = "Saturday";
            break;
            case 7 : dayName = "Sunday";
            break;
            default: dayName = "not a valid day of the week";
        }
        System.out.println(dayName);

        String dayType;

        switch (number){//we still pass our number holding the specific day ex:mon-sun
            case 1 : // we dont need to keep reassigning dayType since we are okay with all above 5 being assigned
                //weekday since there is no break it will take whatever is before break and assign it to dayType

            case 2 :

            case 3 :

            case 5 : dayType="weekday";
            break;
            case 6 :
            case 7 : dayType="weekend";
            break;
            default: dayType ="invalid day type";

        }
        System.out.println(number + " is a " +dayName);
        System.out.println(number + " is a "+ dayType);
        System.out.println(dayName + " is a "+dayType);
    }
}
