package Part2Recap;

public class StringMethods3 {
    public static void main(String[] args) {
       //equals()      compares two strings, returns true if the strings are equal (true,false)  return type = boolean

        //equalsIgnoreCase compares twi strings, ignoring case sensitivity         return type = boolean

        String word1="Hello";
        String word2="Hello";// will be under string pool memory
        String word3= new String("Hello");//heap memory
        String word4= new String("Hello");
        String word5= "Java";

        System.out.println(word1.equals(word2));//this is comparing both strings and will return true or false
        //in this case true
        System.out.println(word2.equals(word3));//true because we are checking only the text and not the creation value
        //if we were using == it would be false
        System.out.println(word2.equals(word3));//true
        System.out.println(word3.equals(word4));//true
        System.out.println(word1.equals(word5));//false

        System.out.println("********************");
        System.out.println(word1 == word2);//true
        System.out.println(word2 == word3);//false because word3 created with keyword and will be in heap memory
        System.out.println(word3 == word4);//is false because they are both created with keyword and are in heap memory
        //as new object
        System.out.println(word1 == word5);//false simply because contain different words

//.equals looks for exact text match, it wont check how variables get created

        //== operator will care how it was created, anything created with keyword is totally a new object in heap

        //equalsIgnoreCase compares twi strings, ignoring case sensitivity         return type = boolean
        System.out.println("****************");
        String str1="Java";
        String str2="JAVA";
        String str3="JaVa";

        System.out.println(str1.equals(str2));//false because it is not an exact character sequence match (uppercase)
        System.out.println(str1.equalsIgnoreCase(str2));//true because we are ignoring case sensitivity
        System.out.println(str1.equalsIgnoreCase(str3));

        boolean b1=str1.equalsIgnoreCase(str3);//true
        boolean b2=str1.equals(str2);//false
        boolean b3 =str3.equalsIgnoreCase(str2);//true

        if (b1){
            System.out.println("b1 is true"); //will print 1st

            if (b2){//nothing in b2 if () will run
                System.out.println("b2 is true");
                if (b3){
                    System.out.println("b3 is true");
                }else {
                    System.out.println("b3 is false");
                }
            }else{
                System.out.println("b2 is false");//will print 2nd
            }
        }else{//would run or check if b1 was false since its whatever is left
            System.out.println("b1 is false ");
        }

        }

    }

