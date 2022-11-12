package MethodsBeginning;

public class MethodsRealBeginning {//<-- this  is a class
    /*declaration of a method
    public             static        void           main          (String [] args){
    access-modifier    specifier    return type    methodName     (parameter)
    statements , code
    you'll be able to substitute any of these with the corresponding type defined below in its category. Name can
    be anything we choose.
    }

    access-modifier =public , protected , default , private / defines level of access
    specifier  : static, final, abstract,  synchronized
    return type : void, any dataType(int,string,char,int []....)
    some methods have parameters some don't.
    I CAN IMPORT THESE METHODS AND USE THEM ACROSS CLASSES DEPENDING ON LEVEL OF ACCESS
     */

    public static void main(String[] args) {//  <--this is also a method called main method, in java we can create our
        //own methods. you won't always use your main method.

        //in order to print java ten times we have to call our method "printJava10" in our main method**
        printJava10();//this is how we call printJava10 method

        hello();//like above method (printJava10) we must call this method in main method

        evenNumber100();



    }

    public static void printJava10(){
        //TASK: create a method that will print java 10 times
        for (int i = 1; i <=10; i++) {
            System.out.println("java");

        }
    }

    //print hello
    public static void hello(){
        System.out.println("Hello Hello");
    }
    //create a method that will print even numbers between 1-100/ name method= evenNumber100
    public static void evenNumber100(){

        for (int i =1; i <=100; i++) {//another way to do this is int i=2; i<101; i+=2<- this is saying add 2 every
            //time it loops and then i wouldnt need the if statement. i would just sout(i+" ");
            if (i%2==0){
                System.out.print(i+" ");//this will print the numbers that are divisible by 2 as it loops if i do
                //container+=i itll add the sum of all even numbers

            }

        }
        System.out.println();
    }
}
/* void method (without parameters)
void method(with parameters)
return method(without parameters)
return method(with parameters)

 */