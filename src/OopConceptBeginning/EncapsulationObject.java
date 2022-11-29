package OopConceptBeginning;

public class EncapsulationObject {
    public static void main(String[] args) {
        OopEncapsulation object = new OopEncapsulation();
        //class          object       default constructor

        //object.name="hello world";
        //name age and ID no accessible in this class because they are private variables
        object.setName("Hello");
        System.out.println(object.getName());
        object.setIDNum(12929292992922l);
        System.out.println(object.getIDNum());

    }
}
