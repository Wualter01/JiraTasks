package MethodsBeginning;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String firstName="Hello";
        String lastName="World";
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.concat(" "+lastName));//concat both strings
        System.out.println(concat("jennifer", "Ayala"));//remember you still have to use sout to print
        //method like any other ready method think of it that way.

        System.out.println(equalNames("wualter", "rosa"));//i can also get the same result doing it as follows
        //boolean result= equalNames("Hello","Hello); --> sout(result);
        System.out.println(comparingNumbers(100, 100));//personally i think this way is easier

    }

    //create a method that will concat 2 strings
    public static String concat(String str,String str1){
        return str+" "+str1;
        //or i could've even used the ready string method concat ex: str.concat(" " +str1)
    }
    //create a logic that will check given names are equal
    //need to be able to compare two strings return a true or false answer= boolean return type
    public static boolean equalNames(String name1,String name2){
        return name1.equals(name2);// i can still pass a strings in my parameters with my boolean return type
        //boolean will just return true or false and it is compatible with strings im comparing.
        //i could also use boolean with numbers like in the following method.

    }
    public static boolean comparingNumbers(int number01,int number02){
        return number01==number02;
    }
}
