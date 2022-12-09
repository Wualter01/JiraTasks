package PolymorphismIntro.PolymorphismPractice;

public class Abstraction1 extends test1 implements test2 {
    //this is an example of achieving abstraction using interface and abstract class
    @Override
    public void method1() {

    }

    @Override
    public void method3() {

    }

    @Override
    public String methods4() {
        return null;
    }
    //what is abstraction? the process of showing user functionality but hiding implementation
    //either through abstract class or interface. if by abstract class you make your methods and class
    // abstract so that they
    //may be overridden during inheritance. if through interface you specify class as interface and by default all
    //methods are public and abstract. in regular class you use inheritance through keyword implements to reach
    //and override methods
}

abstract class test1{
    public abstract void method1();//Remember abstract methods have no body
    public void method2(){

    }
}

interface test2{
    void method3();//by default this is public and abstract
    String methods4();

    int number=100; //our variables by default are public, final and static


}

interface test3{

}