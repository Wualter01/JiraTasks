package Recap;

public class BooleanChar {
    public static void main(String[] args) {
       //this is how you initiate a data type dataType variableName=data;
         //this is less than < symbol ex: 4<7 this is read 4 is less than 7
        //this is > the greater than symbol ex:9>7 this is read 9 is greater than 7

        boolean b1=true;
        boolean b2=false;

        boolean b3= 10>15; //false

        System.out.println(b3);
        System.out.println(b1);

        //boolean logic check the condition and give result as true and false
        //char will help you store a single character or letter you MUST USE SINGLE QUOTATIONS WHEN USING CHAR ' '
        //if you are storing more than one character java will ask you to use a string

        char ch1= 'w'; //if you wish to print this character you must use sout by calling it and passing it in
        //our parameters
        System.out.println(ch1);

        boolean bool1= 25 == 30; //== means equals != means not equal true
         boolean bool2=20 != 21; //false
        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println(true == false);
        //!true= false this is saying not true is actually false
        //!false = true this is saying not false is really true
        System.out.println(!true == false);

        System.out.println(!(true==true)==(false == !true));

        //      char          2bytes            stores a single character/letter or ASCII values
   //all of these are valid to store in char as long as it is a single character
        char c1='a';
        char c2='2';
        char c3='@';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //ascii table
        //from ascii table number 97 is equal to lowercase a
        //65 is capitol A
        int i=97;
        char Ch1=97;

        //java interprets char number 97 as a based on its ascii table value since you are using char and not int
        //java reads a and not the literal number 97
        System.out.println(i);//97 will be printed
        System.out.println(Ch1);//a literal a will be printed

        int i1=65;//our result will be the literal number 65 since we defined it as an integer
        char ch22=65;//since we have defined it as a char and for every char value according to ascii table every
        //number value has a character assigned to it we will get the single character letter A
        char ch23 = 'A';//since here we are printing a single character under single quotations we will get the literal
        //letter A, it is very IMPORTANT TO KNOW THAT 65 PRINTS A CAPITAL A AND NOT A LOWERCASE a

        System.out.println(i1);
        System.out.println(ch22);
        System.out.println(ch23);

        System.out.println(i1+ch22); //instead of trying to take the ascii value it will take the number value and add
        //because we used an int value by default java will take the number value



    }
}
