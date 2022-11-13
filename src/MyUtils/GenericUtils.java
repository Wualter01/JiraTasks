package MyUtils;

public class GenericUtils {
    public static void hello(){
        System.out.println("Hello Hello");
}
    public static void StringReverse(String name){//name is what we'll call in our loop
        String reversedResult="";//this serves as our container
        for (int i =name.length()-1; i>=0; i--){//we do i>=0 because we run til condition is false making it i<=0
            //would start as off as false and loop breaks. loop runs as long as condition is true.
            reversedResult+=name.charAt(i);
        }
        System.out.println(reversedResult);
}}

