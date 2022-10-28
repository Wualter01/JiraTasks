package Part2Recap;

public class Ternary {
    //ternary is just another way of using if else block
//create java program that prints maximum number between 2 numbers
    public static void main(String[] args) {
        int number1 =10;
        int number2 =20;

        int max=0;//this variable will be used to store max number
        String message= "";//this variable will be used for storing result as a message

        System.out.println(max);
        System.out.println(message);

        if (number1>number2){
            max = number1;//since this is false java wont run this and moves on to else portion

        }else{
            max = number2;//if number1 is not bigger than number two by default it has to be the latter because there
            //are only two options. we are always writing max= either number1 or = number2 since we want that filled
            //with whichever statement is true

            message="maximum number is : "+ max; //this is our message string reassigned
            System.out.println(message);

            //ternary (another way to do if else block)
            int number3=13;
            int number4=11;

            int max2;

            max2=(number3 > number4) ? number3 : number4;
            //if ()= condition must be in () followed by ? question mark being if statement
            //THIS READS MAX EQUALS NUMBER3>NUMBER4 IF TRUE ASSIGN ? NUMBER3 TO MAX2 :<-- ELSE NUMBER4 IS ASSIGNED
            //BY DEFAULT
            //: represents your else condition
            System.out.println("your max number = " +max2);


            String result=(true) ? "java" : "python";
            System.out.println(result);//if false it moves onto python and true prints java BASICALLY IM TOGGLING
            //BETWEEN JAVA AND PYTHON USING TRUE FOR FIRST OPTION SINCE TRUE WILL NOT EXECUTE ELSE OR FALSE TO SKIP
            //FIRST OPTION AND MOVE TO SECOND OPTION

            //THIS IS THE SAME THING AS THE CODE ABOVE USING IF ELSE LITERAL
            if (false){
                result="java";
            }else{
                result="python";
            }//remember if you want to see a result you must print result otherwise you wont output anything
            System.out.println(result);

        }

    }
}
