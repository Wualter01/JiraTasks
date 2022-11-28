package Constructor_AccessModifier;

public class MalePerson {
    // attributes for male person
    //name, gender, age, ID

   public static char gender = 'M';//static variable and default access modifier so as long as its in the same
    // package i can call this variable. being that it is static ill call using reference to class. since it is
    //in same class i can just call method. this method started off as default and was later changed to public
    //meaning it can be called from anywhere in project.

    public static boolean isHuman=true; //static variable since we are referring to male and males are human.
    //since access modifier is public it can be accessed anywhere within project

    public String name;//this is better left as an instance variable because each name will differ for each
    // object created. also access modifier defined as public so it is accessible anywhere

    int age; //also better left as instance variable so that i may assign different age to each object created.
    //access modifier is default meaning it is only accessible within its package.

    private static long ID=298329927483l;//when you exceed default data type for java which is integer it'll ask you
    //to make sure you want long data type by adding an l at the end of your number for "long"
    //being that this variable is private it is only accessible by class its in.



}
