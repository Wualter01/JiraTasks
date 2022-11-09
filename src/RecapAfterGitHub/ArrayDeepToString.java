package RecapAfterGitHub;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDeepToString {
    public static void main(String[] args) {
        int [] number={1,2,3};
        System.out.println(Arrays.toString(number));

        //2nd
        int [] [] number2D={ {1,2} , {2,3,4} , {4} };
        System.out.println(Arrays.toString(number2D));//helps you to move -1 dimension
        System.out.println(Arrays.toString(number2D[0]));//one container [1,2] so it -1 dimension
        System.out.println(Arrays.deepToString(number2D));//to print 2 dimensional arrays as a string
    }
}
