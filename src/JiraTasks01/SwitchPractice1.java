package JiraTasks01;



import java.util.Scanner;

public class SwitchPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Month Number");
        int MonthNumber = scan.nextInt();
        String MonthName;

        switch (MonthNumber){
            case 1 : MonthName= "january";
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
            default: MonthName="invalid month number entered";
        }
        System.out.println(MonthName);
    }
}
