package MethodsBeginning;

import MyUtils.GenericUtils;

import java.util.Arrays;

public class UtilsPractice {
    public static void main(String[] args) {
        GenericUtils.hello();
        GenericUtils.StarSeparation();
        GenericUtils.StringReverse("Kayak");
        GenericUtils.StarSeparation();

        int [] Practice={29,30,32,5,22,2,0};
        System.out.println(Arrays.toString(GenericUtils.SmallToLarge(Practice)));
    }
}
