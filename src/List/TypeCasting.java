package List;

public class TypeCasting {
    public static void main(String[] args) {
        Integer myInt=10;
        int myInt2=myInt;
        Integer Number1=new Integer(11);//this is how you make an object of your class
        int number2=Number1;
        //all the above are examples of type casting -->unboxing when you convert an object of wrapper class
        // to primitive int

        Character myCh='w';//is an example of autoboxing we are taking primitive value into an object of corresponding
        //wrapper class

        char ch2=myCh;//is an example of unboxing

        System.out.println("ch2 = " + ch2);
        System.out.println("myCh = " + myCh);

        int number=100;//primitive

        Integer myInt3=number;//wrapper class and it is type casting autoboxing
        Byte myByte=26;//wrapper class
        byte b1=myByte;//unboxing because we are converting object to its corresponding primitive value



    }
}
