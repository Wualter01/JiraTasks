package Recap;

public class IfStatements {
    public static void main(String[] args) {

        boolean b1=10>5;//true
        boolean b2= 10 == 12; //false

        System.out.println("Wualter");

        if (2>2) {// opening bracket for if statement//false

            System.out.println("kat");//if my If statement is false it will not read anything in our if statement
            //or check anything in our body of if statement

        }//closing bracket for if statement/ JAVA READS TOP TO BOTTOM BY LINE*

        System.out.println("sanjay");

        if (1==1){
            System.out.println("this is an if condition being run because it is true");
        }

        if (b2){//false so java wont read inside if statement or execute the body of this statement

            System.out.println(b2);
            System.out.println(b2);
        }else{

            System.out.println("ran because my if statement was false for b2");
        }
        if (true){//this ran because we ran our true condition in parameters

            System.out.println("this will print");
        }


    }//closing for main method

}//closing for class
