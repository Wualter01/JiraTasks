package classesVsObjects;

public class ShoesObject2 {

    /*since shoe is in the same package you will be able to call your shoe library
    if it is not in the same package you'll need to import and create
    different objects from this shoe library

    idea of creating object from class
    ArrayList< >    list =        new ArrayList();
    class       referenceName        Object
     */

    public static void main(String[] args) {

        ShoeExample shoe1 = new ShoeExample();//created an object from shoe library (class)

        shoe1.color="pink";
        shoe1.size=14;
        shoe1.brand="Nike";

        System.out.println(shoe1);//this is your toString method at work somehow it works without invoking it

        ShoeExample shoe2= new ShoeExample();

        System.out.println(shoe2);//output since we haven't assigned any values to our attributes variables
        //null, 0, and null since we've passed two strings and int

        shoe2.setShoeInfo("Filas",9,"DarkBlue");
        System.out.println(shoe2);
        System.out.println(shoe2.brand);
        System.out.println(shoe1.size);
    }
}
