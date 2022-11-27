package StaticKeyword;

import MyUtils.GenericUtils;

public class multiClassPractice {


}

class lab1{
    public static void main(String[] args) {
        lab02.lab2Answer();
        lab1.reverse();
        GenericUtils.StringReverse("kayak");

    }
    public static void reverse(){
        System.out.println("reverse method");
    }
}
class lab02{
    public static void main(String[] args) {

    }
    public static void lab2Answer(){
        System.out.println("lab2Answer");
    }
}
