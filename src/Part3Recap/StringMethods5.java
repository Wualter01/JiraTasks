package Part3Recap;

public class StringMethods5 {
    public static void main(String[] args) {
        //replace()     Searches a string for a specified value, and returns a new string where the specified values
        //are replaced

        String word="Hello world 123 hello world 123";

        System.out.println(word.replace("e","x"));
        //removed all letters e with x
        System.out.println(word);//String are immutable so it will only work when using .replace method from so on
        //word will return to its original value

        String updatedWord = word.replace("e","x");
        System.out.println(updatedWord);//this is how we get around immutable strings we reassign variable with
        //new word

        //replaceFirst()    replaces the first occurrence of a substring that matches the given regular expression
        //with the given replacement           return type string

        String str="Java is here , planet is Java , Java is planet";

        String newStr=str.replaceFirst("Java","Python");
        System.out.println("new str = "+newStr);
        //output will be pyhton is here, planet is java, java is planet it replaces only the first occurrence of the
        //word you've provided everything else gets left how it is

        System.out.println(str.replace("Java","Python"));
        //WHEN USING .REPLACE IT WILL REPLACE ALL OF THE MATCHING OCCURRENCES OF THE WORD PROVIDED LIKE THE ABOVE CODE
        //WILL OUTPUT
        //if you wanted to change just the first two javas you would have to use .replaceFirst twice

        System.out.println("**************");
        //startsWith() checks whether a string starts with specified characters   return type boolean
        //endsWith() checks whether a string ends with the specified character(s)  return type boolean

        String sentence="Java hello Java 123 world Java";
        //task check if sentence either starts with or ends with "java"
        //you can take this literal use the key word or to figure out how to go about solving your task

        boolean b1 = sentence.startsWith("Java") || sentence.endsWith("Java");
        System.out.println(b1);//when using or if even one is true output will be true && if even one is false
        //output will be false
        boolean b2 = sentence.startsWith("Java") && sentence.endsWith("Java");

        if (b1){//since i have already declared my boolean condition above i do not have to pass it again here
            //depending on the true or false return output my if condition will go off of
            System.out.println("Sentence starting or ending with Java");

            if (b2){//this is a nested if condition so that if the first if statement is true then we move on to 2nd
                //condition and print if it starts with and ends with Java
                System.out.println("Sentence starts and ends with Java");
            }else{//nested else if second if condition does not pass print since b1 is true one part is java
                System.out.println("since b1 is true one part is Java");//this was ignored because first condition was
                //true: if this were to print then 1st condition was true we can make the assumption that one had to
                //either start with or end with java
            }
        }else{//original else condition for first if condition if both conditions are false print
            System.out.println("sentence doesnt start with or end with Java ");
        }
        //REMEMBER ELSE CONDITIONS ONLY RUN IF YOUR IF STATEMENT IS FALSE THEN ELSE WILL PRINT OTHERWISE ELSE IS
        //IGNORED EVEN IF THEY ARE PARTIALLY TRUE WATCH OUT FOR THIS PAY ATTENTION TO YOUR IF CONDITIONS

        System.out.println("****************");
        //subString   extracts the characters from a string , beginning at a specified start position
        //and through the specified number of characters      return type=string
        //we have two methods for this First: substring (beginning index , ending index) : this will print starting
        //given index until the ending index ( excluded ending index) ex: start 3-8, 8 will not print
        //SECOND: substring (beginning index) : this will start printing from given index to end of the sentence

        //Task print world, is fun
        String letters= "hello world, java is fun";
        System.out.println(letters.substring(6,17)); //technically it ends at 16 but since substring does not print
        //ending specified character we need to add one so it prints the full characters we want
//task print everything after and at index 6
        System.out.println(letters.substring(6)); //this will print everything after index 6 including character
        //@ 6 output= world, java is fun

        //task print world
        System.out.println(letters.substring(6,11)); //could have done also 6,10+1

        //task print hello
        System.out.println(letters.substring(0,5));

        //print java
        System.out.println(letters.indexOf('j'));//remember it is case sensitive
        System.out.println(letters.lastIndexOf('a'));//have to do last index of because there are multiple a's
        System.out.println(letters.indexOf("a "));//this will also work since a and space are unique to this string
        //you can put it in an int indexOfA= so that it is more readable for the next person
        System.out.println(letters.substring(13,17));

    }
}
