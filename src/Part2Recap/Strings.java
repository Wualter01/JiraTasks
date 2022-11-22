package Part2Recap;

//no need to import string because java imports everything under lang package
public class Strings {
    public static void main(String[] args) {

        //to create a string
        String str="hello world";

        //example: by String literal using double quotations
        String str1 ="hello";//java will check string pool and since we dont have hello it will create a new string
        //in pool memory

        String str2="hello"; //if the string already exists in the pool memory, a reference to the pooled instance
        //is returned.. this string wont create a new string under pool memory since we already have hello in pool
        //memory.

        //THE REASON JAVA USES STRING LITERAL LOGIC IS SO THAT JAVA MEMORY IS MORE EFFICIENT

        //SECOND WAY TO CREATE A STRING OBJECT IS THE FOLLOWING
        String str3= new String("hello"); //java will create an object (string) called hello under heap
        //memory (NOT POOL MEMORY)

        //STRING CONSTANT POOL IS IN HEAP MEMORY, AFTER CREATING A STRING LITERAL EX: HELLO JAVA WILL NOT CREATE A NEW
        //STRING IN STRING CONSTANT POOL IT WILL INSTEAD RETURN THE REFERENCE OF THE FIRST HELLO
        //IF YOU CREATE A HELLO BY KEYWORD EX: STRING STR2= NEW STRING("HELLO") THIS NEW HELLO WILL CREATE A
        // NEW HELLO AND BE STORED IN HEAP MEMORY INSTEAD OF STRING CONSTANT POOL . EVERYTIME YOU CREATE A NEW STRING
        //USING KEYWORD IT WILL STORE IT IN HEAP MEMORY AND CREATE A NEW OBJECT

        System.out.println(str1==str2);
        System.out.println(str1==str3); //even tho str3 contains hello it is not equal to str1 hello str3 is created
        //with keyword and it is stored in different part of memory and immutable
        //immutable means object cannot be changed or modified

        String s1="New York";  //this will be placed under string pool


        s1="Virginia";
        //even though we have reassigned s1 to virginia it doesnt change s1 since it is immutable instead what we did
        //was create a new object virginia in pool and referenced s1 to it. hence why java strings are immutable
    }
}
