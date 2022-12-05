package Abstract;

public class AbstractionPractice extends AbstractClass1{
//ive inherited method 2 and abstract method, which ill have to override in order for error to go away.
    //also inherited method 2.

    @Override
  public void abstractMethod(){
        //since i have wrote the same method name, access modifier, and included curly brackets for body ive
      // successfully overridden abstract method from abstractClass1.
        System.out.println("abstract method in abstract class");
    }

}


abstract class AbstractClass1{

    public abstract void abstractMethod();//remember abstract methods do not have bodies. this will be overridden
    //during inheritance in child class using keyword extend

    //we can have regular methods in our abstract class
    public void method2(){
        System.out.println("method 2");
    }
}

abstract class abstractClass2 extends AbstractClass1{//no issues because class is also abstract
    //ive inherited method2 and abstract method i do not have to create a body for abstractMethod or override it

    abstract void abstractMethod3();
}

class class3 extends abstractClass2{
    public void abstractMethod(){//since we are inheriting abstractClass2 which has no methods but the class is
        //inheriting from abstractClass1 which has abstract method and one non abstract method ill have to override
        //the abstract method since this class is not abstract. through inheritance ive also inherited method2

        }

        void abstractMethod3(){
        //since ive added an abstract method to parent class of class3 i will also be inherited and will need to be
            //overridden in order for error to go away

    }
}
