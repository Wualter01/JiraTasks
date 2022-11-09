package RecapAfterGitHub;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {

        String[][] names = {{"adalyn", "katalina", "jennifer" }, {"wualter", "damian", "sebastian" }};


        String boyName3 = names[1][2];
        System.out.println("boyName3 = " + boyName3);
        String boy2 = names[1][1];
        System.out.println("boy2 = " + boy2);

        //store all boy names
        String[] boyNames = names[1];
        System.out.println(Arrays.toString(boyNames));
        //store all girls names
        String[] girlNames = names[0];
        System.out.println(Arrays.toString(girlNames));
        Arrays.sort(boyNames);
        System.out.println(Arrays.toString(boyNames));//after sorted array.. if you capitalize letters itll change ascii
        //value and sort them differently .

        int[][][] number3d =  {     { {1, 2, 3}, {4, 5} }, { {6}, {7} },   { {8} }     };
        //child container index      0                     1               2
        //grandchild container index   0         1            0    1          0
        // data index                   0, 1, 2   0, 1        0     0          0

        System.out.println(number3d[0][0][0]);//1
        System.out.println(number3d[2][0][0]);//8
        System.out.println(number3d[1][0][0]);//6try your best to follow along its best if you do it this way and try
        //to arrange index as best as you can
        System.out.println(number3d[0][1][0]);//4
        System.out.println(number3d[0][1][1]);//5

    }
}
