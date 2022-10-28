package Part2Recap;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Empolyee First Name : ");
        String firstName = scan.next();//next will only accept one word and does not accept enter

        System.out.println("first name is: " +firstName);

        //to handle enter that comes after .next use line below if you wish to continue to take words
        //if not you may leave it alone
        scan.nextLine();

        System.out.println("Enter Full Name For Employee");
        String FullName = scan.nextLine();//takes enter

        System.out.println("Enter Employee Age: ");
        int age = scan.nextInt();//this also does not accept enter so after .nextInt ill need to do scan.nextLine
        System.out.println("Employee age is : "+age);

        scan.nextLine();//this is so that enter is consumed after passing age

        System.out.println("Enter employee city");
        String cityName= scan.nextLine();
        System.out.println("city name is : "+cityName);

        System.out.println("Enter salary for employee");
        double salary = scan.nextDouble();
        System.out.println("Salary is : "+salary);


    }
}
