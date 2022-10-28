package Part2Recap;

import java.time.Month;

public class SwitchStatements {
    /* create a java program that will take numbers between 1-12
    and print months name depends on number ex: 1 = january 5= may
     */
    public static void main(String[] args) {
        int monthNumber=13;
        String MonthName;

        switch (monthNumber) {//switch will ask you to pass a variable that will be compared with cases
            //break is used to break code so that java doesnt continue to check the rest of the cases
            //without break java will continue to check the rest of the cases remaining so as soon as it matches
            //it will fill name with corresponding month and break/ if break is not present it will continue ro check
            //and fill month name with the next available string etc. ex: case 9 : monthName="sep"
            //                                                            case 10 : monthName="oct"
            //                                                            case 11 : monthName="nov"
            //                                                             break;
            //if my monthNumber was 9 and no break was present it would continue to check the rest and fill
            //monthName with whatever else follows til break is present so output=nov even if its false
            case 1 : MonthName="January";
            break;
            case 2 : MonthName="February";
            break;
            case 3 : MonthName="March";
            break;
            case 4 : MonthName="April";
            break;
            case 5 : MonthName="May";
            break;
            case 6 : MonthName ="June";
            break;
            case 7 : MonthName ="July";
            break;
            case 8 : MonthName ="August";
            break;
            case 9 : MonthName ="September";
            break;
            case 10 :MonthName ="October";
            break;
            case 11 : MonthName ="November";
            break;
            case 12 : MonthName ="December";
            break;
            default:MonthName="invalid number entered, number must correlate with numbers of the 12 months";
//default is last condition so no break is necessary since there are no more cases to check afterwards
                //it is also telling java that anything besides these numbers in cases available print
                //invalid number

        }
        System.out.println(MonthName);
    }
}
