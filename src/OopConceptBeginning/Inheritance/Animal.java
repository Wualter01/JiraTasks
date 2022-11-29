package OopConceptBeginning.Inheritance;

public class Animal {

    /*
    Inheritance is an important pillar of 00P (object-Oriented Programming).
It is the mechanism in java by which one class is allowed to inherit the features (fields variables and methods)
of another class.

Important terminology:

Super Class: The class whose features are inherited is known as superclass (or a base class or a parent class)
Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class
The subclass can add its own fields and methods in addition to the superclass fields and methods of the existing class

how to use inheritance in java

the keyword is used for inheritance is "extends"

     */

    public String name;
    public int age;
    public double weight;
    public String color;
    public char gender;

    public void eat(String food){
        System.out.println(name + " is eating "+food);
    }

    public void grow(){
        System.out.println(name+ " is growing");
    }

    public String toString(){
        return "name is : " +name +" : age is : "+age+" : weight is : "+ weight+ " : color is : "+color+
                " : gender is : "+gender;
    }
}
