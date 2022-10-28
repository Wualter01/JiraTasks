package Part2Recap;

import java.util.Scanner;

public class ScannerNextLine {
    //for strings we can use .next or .nextLine

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* System.out.println("Enter full name");
       // String FullName = scan.next(); //.next WILL ONLY TAKE ONE WORD, IF YOU HAVE MORE THAN ONE WORD IT IS BEST TO
        // USE .NEXTLINE.

        String FullName= scan.nextLine();//this will take more than one word

        System.out.println(FullName); */


        Scanner input= new Scanner(System.in);
        System.out.println("Employee first name");
        String firstName= input.next();
        System.out.println("First name is : "+firstName);

        input.nextLine();//this line to accept enter without this line  will not be able to continue because
        //when .nextLine consumes it when i press enter.. to avoid that  i need to write it again so that enter
        //does not consume it and allows me to continue.
        //ITS IMPORTANT TO REMEMBER THAT .NEXT DOES NOT ACCEPT ENTER ONLY .NEXTLINE ACCEPTS ENTER.

        System.out.println("Employee fullName");
        String FullName = input.nextLine();//accepts enter
        System.out.println("full name is : "+FullName);

    }
}
