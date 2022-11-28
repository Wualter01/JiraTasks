package Constructor_AccessModifier;

public class AccessTestingSamePackage {
    public static void main(String[] args) {
        AccessModifier object1 = new AccessModifier();
        //class        object        constructor
        //PRIVATE is the only access variable we will not be able to call. public, default, and protected we'll
        //be able to call them in this class

        System.out.println("object1.publicVariable = " + object1.publicVariable);
        System.out.println("object1.protectedVariable = " + object1.protectedVariable);
        System.out.println("object1.defaultVariable = " + object1.defaultVariable);
    }
}
