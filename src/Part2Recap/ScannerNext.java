package Part2Recap;

import java.util.Scanner;

public class ScannerNext {

    //for strings to be able to use scanner you'll need to call .next method from library
    //there are to ways to create string scanner 1. .next and .nextLine
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
       // String firstName="Wualter";
        String firstName= scan.next();
        System.out.println("First name is : "+firstName);

        System.out.println("Enter last name");
        String lastName= scan.next();
        System.out.println("Last name is : "+lastName);

        String fullName= firstName + " "+lastName;
        System.out.println("Full name is : " +fullName);

        //WHEN YOU USE .NEXT AND HAVE MORE THAN ONE WORD FOLLOWED BY SPACE ITLL TAKE THE SECOND WORD AND USE IT FOR
        //NEXT LINE WITHOUT ASKING USER FOR INPUT. TO FIX THIS WE USE THE 2ND METHOD .NEXTLINE.
        //.NEXTLINE CAN STORE MORE THAN ONE WORD

        System.out.println("Grade for student");
        int grade= scan.nextInt();

        System.out.println(fullName+ " grade is "+grade);



    }
}
