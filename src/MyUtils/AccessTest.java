package MyUtils;

import Constructor_AccessModifier.AccessModifier;
//since im outside of package ill have to import this Access modifier class

public class AccessTest {
    //Default - access modifier not accessible outside of package
    //protected - only accessible in same package and outside package only through child class
    //private - only accessible within same class declared in
    public static void main(String[] args) {

        AccessModifier object1 = new AccessModifier();


        System.out.println("object1.publicVariable = " + object1.publicVariable);

    }
}
