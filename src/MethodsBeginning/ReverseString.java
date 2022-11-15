package MethodsBeginning;

import MyUtils.GenericUtils;

import static MethodsBeginning.MethodsRealBeginning.hello;

public class ReverseString {
    public static void main(String[] args) {
        //Arrays.sort(); we call the class Arrays and the method is sort.
        MethodsRealBeginning.hello();//same thing we call the class then we select or name method. remember your class
        //must be called in main method.We can call all public methods or classes.

        GenericUtils.hello();//is taking my .hello method from my genericUtils class that is where ill store
        //repetitive codes

        StringReverse("dog");//then we call our StringReverse method and itll ask for 1 string parameter we
        //called in this case "name". we dont need to call the class because we are in the same class as the method was
        //declared in.
        StringReverse("Yelnats stanley");


    }
    public static void StringReverse(String name){//name is what we'll call in our loop
       String reversedResult="";//this serves as our container
       for (int i =name.length()-1; i>=0; i--){//we do i>=0 because we run til condition is false making it i<=0
           //would start as off as false and loop breaks. loop runs as long as condition is true.
           reversedResult+=name.charAt(i);
       }
        System.out.println(reversedResult);
    }
}
