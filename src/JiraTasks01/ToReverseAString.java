package JiraTasks01;

import java.util.Scanner;

public class ToReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word= scan.nextLine();
        int lastIndexOfWord=word.length()-1;
        String reverse="";

        for (int i=lastIndexOfWord; i>=0; i--){
            reverse=reverse+word.charAt(i);
        }
        System.out.println(reverse);
    }
}
