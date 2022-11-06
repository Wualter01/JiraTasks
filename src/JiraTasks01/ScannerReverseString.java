package JiraTasks01;

import java.util.Scanner;

public class ScannerReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String yourString= scan.nextLine();
        String container = "";

        for (int i = yourString.length()-1; i >=0; i--) {
            container+=yourString.charAt(i);

        }
        System.out.println("your reversed String = "+container);
        System.out.println("*******************");
        //task return longest string from array
        String [] cityNames={"denver","Texas","Orlando","Toronto","Jennifer","Sevgin","RenasTech"};
        int MaxLength=cityNames[0].length();//i am assuming name at index 0 has max length but i am also telling
        //java to read the max length by using .length method if i were to print this i would get 6
        System.out.println(cityNames[0].length());


        for (int i = 0; i < cityNames.length ; i++) {
            if (cityNames[i].length() > MaxLength) {
                MaxLength = i;
            }
        }
        System.out.println(cityNames[MaxLength]);//is equivalent to me saying soutCityNames[6]
        System.out.println(cityNames[6]);//thats why if i just wrote MaxLength itll give me 6 because 6 is the index
        //number i was in and i is checking the indexes of cityNames so i have to define it to reach the value
        //thats why we do sout cityNames[6] = sout cityNames[MaxLength]= i or index 6

    }
}
