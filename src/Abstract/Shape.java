package Abstract;

public abstract class Shape {//a sign of making your class abstract is you'll see you class logo have white stripes
    //in package

    //SPECIFIER IS ABSTRACT FOR CLASS
    //abstraction is another oop concept in java
//main idea of abstraction: abstraction is a process of hiding the implementation details (hiding body)
// from the user,
// only the functionality will be provided to the user.
// In other words, the user will have the information on what the object does instead of how it does it

//2 ways to achieve abstraction
//1.Abstract Class , abstract methods
// 2.Interface

    //specifier is :Abstract
//abstract classes are meant to be inherited
// can not be final

//abstract method: these methods will be without body
// these methods are meant to be overridden
// these methods can not be final, static or private.

//public void method (){body}
// public abstract void method();

//task:
// create an abstract base class called shape which will have method call area, shapeName
//create child classes called rectangle , square that will override method area, shapeName

    abstract void shapeName(); //abstract methods have no body because their meant to be inherited and overridden in
    //child class
    abstract void shapeArea();


}
