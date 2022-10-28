package JiraTasks01;

import java.util.Scanner;

public class ReverseStringPractice {
    public static void main(String[] args) {
        String str = "rosa vasquez";
        String container= "";

        for (int i=str.length()-1; i>=0; i--){
            container+=str.charAt(i);

        }//second way to do it using scanner
        System.out.println(container);
        System.out.println("******************");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scan.nextLine();
        String reverse="";
        int lastIndex= word.length()-1;

        for (int i=lastIndex; i>=0; i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);

    }

}
