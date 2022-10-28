package Recap;

public class Variables {

    public static void main(String[] args) {
      /* for numbers: byte, short, int, long, float, double,
      whole number: byte, short, int, long
      decimal numbers: float, double
      range :double> float> long> int> short> byte>
      byte               1 byte             Stores whole numbers from -128 to 127
       */

        byte number = 125; //we have to stay within the range of our byte range 128 would exceed that
        //we cannot assign decimals to whole numbers
        byte number2=-2;

        //variables are numbers put into words or saved into something. THE USE OF PUTTING NUMBERS IN VARIABLES IS
        //SO THAT WHEN WE USE THEM AND CALL THEM IN OUR CODE AND WE SHOULD HAPPEN TO NEED TO CHANGE OUR NUMBER IN
        //VARIABLE WE DONT HAVE TO CHANGE IT EVERY TIME WE USED IT IN OUR CODE WE CAN JUST GO TO OUR VARIABLE
        //AND MAKE THE CHANGE THERE AND ITLL CHANGE IT IN WHOLE CODE
        System.out.println(35);// you can run numbers without putting them in quotation marks
        System.out.println(number2); //in this example we are calling our variable,
        // you can do it this way as well or like the bottom example
        System.out.println(-2);//this still works
        //EACH VARIABLE MUST BE UNIQUE YOU CANNOT REPEAT VARIABLE NAME

        //short       2bytes        stores whole numbers from -32,768 to 32, 767
        short s1= 128;
        short s2=25;
        short s3=2000;
       // short s4=40000; out of range will not be allowed

        System.out.println("*******&******");
        System.out.println(s1);
        System.out.println(s2);

        //INT IS USED AS THE DEFAULT BECAUSE OF WHAT IS RANGES FROM. SHORT AND BYTE ARE NOT OFTEN USED
        //ITS RANGE IS IN THE BILLIONS SO THAT YOU ARENT WARY OF THE RANGE ALL THE TIME

        int walt = 1000000;
        int yamoms = 450000;
        System.out.println(walt+yamoms);//if it is done like this it will sum the two numbers and print the result
        System.out.println("35");//will be taken as a text
        System.out.println(35); //this is taken as the literal number
        //35 can be assigned multiple variables, but if not assigned java will by default read it as an integer
        int yo=10;
        int tru=5;
        System.out.println(yo/tru);// you can add multiply etc. basically any math can be done using this method

      //long    8 bytes      stores whole numbers from-9,223,372,036,854,775,808 to a number just as big starting with
        //positive 9

        long L1=20000; // long range is covers a lot: WHEN YOU MOVE OUT OF INTEGER RANGE BY DEFAULT JAVA THROWS
        //ERROR IT NEEDS TO BE CLARIFIED THAT IT IS A LONG VARIABLE USING L AFTER YOUR NUMBER like shown below
        long L2 = 200000000000L;

        //we can use any of our variables in our class to do math by calling them

    }

}
