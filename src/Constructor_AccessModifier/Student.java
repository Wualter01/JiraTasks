package Constructor_AccessModifier;

public class Student {
    //what can a student have? name, ID, Age, Grade,School name

    String name;//instance variable
    int ID;//instance
    static String schoolName;//static

    static int countOfNumbers=0;//we made it 0 and created a method so that it would increase with each new object
    //since it is static it is not unique to each object it picks off where it left off. you can see studentID count
    //increase for each object if it were instance it would be at 1 each time because instance means you can have
    //multiple copies for each object

    public Student(String name){
        //constructor, all you need is access modifier and class name to declare.
        //if we dont have a constructor in our class java will have a default constructor automatically

        this.name=name;
        ID=setStudentNumber();
        //since im in the same class and method is static i dont have to reference the class name.
        //i assign ID to setStudentCount

    }

    //create a method that will set student ID automatically
    public static int setStudentNumber(){
        countOfNumbers++;//doing it this way will make each student's ID unique. no one number will be repeated
        //then we can simply return that number.
        return countOfNumbers;
    }

    public String toString(){
        return "name : "+name+" ID : "+ID+" school name : "+schoolName;

    }

    public static void setSchoolName(String school){
        schoolName= school;//since schoolName is static and "this" keyword is used for instance variables ill have to
        //change the name in parameters and reassign my static schoolName to equal school variable passed in parameters

    }
}
