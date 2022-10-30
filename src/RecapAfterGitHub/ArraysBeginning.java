package RecapAfterGitHub;

public class ArraysBeginning  {
    public static void main(String[] args) {
        /*
        if you want to store multiple values in one container we'll use arrays.
        arrays have some ready methods that you can modify your variables.
        to declare an array ex: DataType [] nameOfYourContainer ={data1,data2,data3..} data==variable
        your array may only have one data type assigned at a time but multiple values of that data type stored
        Arrays also have index numbers

         */

        int [] MyNumbers={29,22,2,0};
        String [] Names={"wualter","jennifer","Katalina","adalynn"};
        //getting index numbers EX: 29 is at index 0 and so on. if you wanted to get the last number length-1 because
        //index starts at 0 and length starts at 1
        //to get a single character we had been doing charAt method
        //to get single data from our array we'll use the following method
        System.out.println(MyNumbers[0]);//this is how we can call single data from our array using index [] passes
        //our index number
        System.out.println(Names[1]+" " +MyNumbers[0]);//this is an example of how to get both with one sout
        //since we know our array contains integers we can reassign them to other variables containing integers EX:
        int secondNumber=MyNumbers[1]; //this is assigning number at index 1 in my array to variable second number
        System.out.println("secondNumber = " + secondNumber);


    }
}
