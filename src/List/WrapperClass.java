package List;

public class WrapperClass {//when you use the keyword New youre creating an object of that class

    public static void main(String[] args) {
        int i1 =10;//primitive data type
        Integer i2=10; //Wrapper class object
        //wrapper class is used because array list only accepts objects not primitive data types so in order to get
        //around this we use wrapper class objects. which are the same as primitive data types just capital letters
        //or for examples char is now Character
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);//when i print them nothing changes it will still print the same way
        Double myDouble=5.5;//wrapper class object
        Character ch='a';//wrapper class

        short sh1=100;//primitive
        int i3=25;//primitive

        Integer myInt=i3;//this is wrapper class because we are reassigning int to Integer in wrapper class.
        //WE CAN REASSIGN PRIMITIVE DATA TYPES TO WRAPPER CLASS LIKE THE ABOVE EXAMPLE
       // Integer myInt2=sh1;Integer is another form of primitive data type so you cannot do implicit casting
        //(go from smaller to bigger) it has to be int

        int letsSee=sh1; //this is an examples of implicit casting since int is bigger range itll automatically make
        //the switch for me. Even with wrapper class objects you cannot do implicit casting

        Byte b1=11;//wrapper
        byte b2=13;//primitive
        Byte b3=b2;//wrapper

        //Integer number1=b2; we cant reassign primitive data types to wrapper class unless they are the same data type
        System.out.println(b3);

        //toString can be used to convert wrapper objects to string/ Ex: as follows..
        Integer i10=555;

        String str=i10.toString();//now this is read as a string "555"
        System.out.println("str = " + str);
    }
}
