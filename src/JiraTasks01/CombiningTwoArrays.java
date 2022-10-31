package JiraTasks01;

import java.util.Arrays;

public class CombiningTwoArrays {
    public static void main(String[] args) {
        int [] list1={29,2,22};
        int [] list2={5,30,33,34};

        int [] list3= new int[list1.length+ list2.length];//this gives me the length of both to make up the total length
        //for list 3 which is 7. values are still empty to get values we need a loop

        for (int i = 0; i < list1.length ; i++) {
            list3[i]= list1[i];

        }
        System.out.println(Arrays.toString(list3));// so now we have placed the values of list1 from index 0-2
        //we need another loop for list2 values
        for (int i = 0; i < list2.length ; i++) {
            list3[list1.length+i]=list2[i];

        }
        System.out.println(Arrays.toString(list3));

    }
}
