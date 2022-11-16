package MyUtils;

import java.util.Arrays;

public class GenericUtils {
    public static void hello(){
        System.out.println("Hello Hello");
}
    public static void StringReverse(String name) {//name is what we'll call in our loop
        String reversedResult = "";//this serves as our container
        for (int i = name.length() - 1; i >= 0; i--) {//we do i>=0 because we run til condition is false making it i<=0
            //would start as off as false and loop breaks. loop runs as long as condition is true.
            reversedResult += name.charAt(i);
        }
        System.out.println("reversedResult = " + reversedResult);
    }

    public static void StarSeparation(){
        System.out.println("*****************************");
    }

    public static int [] SmallToLarge(int [] descendingArray){

        Arrays.sort(descendingArray);

        int [] descendingArr2 = new int[descendingArray.length] ;
        int lastIndex= descendingArray.length-1;

        for (int i = 0; i <descendingArr2.length; i++) {
            descendingArr2[i]=descendingArray[lastIndex];
            lastIndex--;


        }
        return descendingArr2 ;
    }
}

