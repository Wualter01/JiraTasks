package Constructor_AccessModifier;

public class StudentObject {
    public static void main(String[] args) {

        Student.setSchoolName("RenasTech"); //since this is static it'll be the same school name for all objects
        //created

        Student student1 = new Student("Wualter");
        System.out.println(student1);//when i print my toString method will override object and print everything in
        //return

        Student student2 = new Student("Jennifer");
        System.out.println(student2);//ID will be two now anytime i create a new object and print the object
        //ID number will increase because i have included ID in toString method and anytime i invoked my
        //setStudentNumber number will increase..

        Student student3 = new Student("Katalina");
        System.out.println(student3);
    }
}
/*
constructor calls: (chaining) by using this () keyword
1. only constructor can call other constructor
2. constructor cannot be called by its name this() is used for calling
3. constructor call needs to be at the first step
4. One constructor can only call one constructor
5. Contructor cannot call itself or conatin itself
 */