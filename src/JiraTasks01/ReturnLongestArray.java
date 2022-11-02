package JiraTasks01;

import java.util.Arrays;

public class ReturnLongestArray {
    public static void main(String[] args) {
        //return longest Array String from the given Array
        String [] names = {"denver","Texas","Orlando","Toronto","Jennifer","Sevgin","RenasTech"};
        System.out.println(names[2]);//i can print single index data using sout only when i try to print the whole array
        //do i have to use sout(Arrays.toString(names);

        System.out.println(Arrays.toString(names));//this the entire array printed using toString

        int MaxLengthIndex1 = names[0].length();

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]+" has length of "+ names[i].length());//this is so we can see what's going on
            //as it loops

            if (names[i].length()>MaxLengthIndex1){
                MaxLengthIndex1=i;
            }

        }
        System.out.println(names[MaxLengthIndex1]);

    }
}
