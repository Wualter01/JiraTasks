package Constructor_AccessModifier;

import MyUtils.GenericUtils;

public class AccessModifier {

    // Access modifiers: public, protected, default, private
// access modifiers explain your access level to the variable method or class
//Private: The access level of a private modifier is only within the class.
// It cannot be accessed from outside the class.
//Default: The access level of a default modifier is only within the package.
// It cannot be accessed from outside the package.
// If you do not specify any access level, it will be the default.
//Protected: The access level of a protected modifier is within the package
// and outside the package through child class.
// If you do not make the child class, it cannot be accessed from outside the package.
//Public: The access level of a public modifier is everywhere.
// It can be accessed from within the class, outside the class, within the package and outside the package
//access modifier for main method = public

    public int publicVariable=10;
    private int privateVariable=20;
    int defaultVariable=30;
    protected int protectedVariable=40;
    //all the above are instance variables and need to be accessed through object

    public static void main(String[] args) {
        //class    and   object     default constructor
        AccessModifier object1= new AccessModifier();

        System.out.println("object1.privateVariable = " + object1.privateVariable);
        System.out.println("object1.publicVariable = " + object1.publicVariable);
        System.out.println("object1.protectedVariable = " + object1.protectedVariable);
        System.out.println("object1.defaultVariable = " + object1.defaultVariable);


    }
}
