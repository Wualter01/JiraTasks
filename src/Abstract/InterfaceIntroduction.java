package Abstract;

public interface InterfaceIntroduction {
    /*
there is only one access modifier allowed in interface ==> public
you can implement inheritance in the interfaces by using implements keyword (instead of extend)
you can implement multiple interfaces
differences between abstract class and interface?
A class can inherit from one class only (extends)
A class can inherit multiple interfaces (implements)

what we can have in interface?
variable: static & final by default
methods: abstract methods, static methods, default method

what we cannot have in interface? constructor, instance variables, instance methods, and blocks
     */

   // void method1(){}; we cannot have an instance method in interface

    //everything in interface will be public and default/ that is why they are dull below
    default void method(){};//default method
    static void method2(){};//static method
    abstract void method3();//abstract method
    public abstract void method4();
    void method5();


}
