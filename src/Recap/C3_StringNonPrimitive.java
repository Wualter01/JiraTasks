package Recap;

public class C3_StringNonPrimitive {

    public static void main(String[] args) {
     ///variable type followed by name and then value assigned ;

     String nameOfStudent = "Wualter vasquez";//text
     String SchoolName = "RenasTech";//text

     int studentId = 12345; //literal number
     String id = "123456"; //text

        System.out.println(nameOfStudent);
        System.out.println("name of student : "+ nameOfStudent +  " ,Student id : " +id);
        //if you want to print in different line use the following
        System.out.println("Name is : " + nameOfStudent + "\nSchool Name : "+SchoolName);

        String number1="100 ";
        byte number2=100;

        System.out.println(number1+10);//this will concat our string and number meaning combine or merge
        System.out.println(number2+10);

    }
}
