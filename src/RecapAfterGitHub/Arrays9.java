package RecapAfterGitHub;

import java.util.Arrays;

public class Arrays9 {
    //ArrayEqual

    public static void main(String[] args) {
        //we will be comparing arrays to see if they are equal or not
        int [] arr1={3,5,7};
        int [] arr2={5,3,7};
        int [] arr3={3,5,7};
        int [] arr4={3,4,7};

        //Arrays.equals is a ready method that Arrays has in its library and we simply call it and import it.
        //then we have put them in a boolean variable so that it can return true/false
        boolean b1= Arrays.equals(arr1,arr2);//false
        boolean b2 = Arrays.equals(arr1,arr3);//true
        boolean b3=Arrays.equals(arr2,arr3);//false
        boolean b4=Arrays.equals(arr3,arr4);

        System.out.println(b1 + " , "+b2+" , "+ b3+ " , "+b4 );

        Arrays.sort(arr1);//{3,5,7}
        Arrays.sort(arr2);//{3,5,7}
        Arrays.sort(arr3);//{3,5,7}
        Arrays.sort(arr4);//{3,4,7}

        //after sorting them it makes 1,2,3 equal because they are the same in value and in sequence

        boolean b11= Arrays.equals(arr1,arr2);
        boolean b21 = Arrays.equals(arr1,arr3);
        boolean b31=Arrays.equals(arr2,arr3);
        boolean b41=Arrays.equals(arr3,arr4);

        System.out.println(b11 + " , "+b21+" , "+ b31+ " , "+b41 );
    }
}
