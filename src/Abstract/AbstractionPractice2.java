package Abstract;

public class AbstractionPractice2 implements test1,test2,test3{ //extends can only be used one per class to inherit
    //but with implements keyword we can inherit more than one interface.. remember to override abstract methods so
    //that you have no issues.. EVEN IF YOUR METHODS IN INTERFACE DO NOT SPECIFY PUBLIC OR ABSTRACT REMEMBER THAT
    //EVERYTHING IN INTERFACE IS PUBLIC AND THAT INTERFACE ONLY ALLOWS METHODS TO BE DEFAULT, ABSTRACT, AND STATIC
    //SO IF IT DOES NOT SAY DEFAULT OR STATIC IT MUST BE ABSTRACT. abstract has no body {}

    public void method1(){

    }

    public int method2(){
      int int1 = 0;

      return int1;
    }

    public void method3(){

    }


}

interface  test1{
    void method1(); //by default public and abstract because it has no body.
}

interface test2{
  abstract int method2(); // specifier doesn't always need to be void like in this case we've made it int. since we've
    //made it int specifier when we override we'll have to include a return type
}

interface test3{
    public abstract void method3(); //we did not need to write public abstract since by default in interface all are
    //public and when not defined abstract
}

class test4{

}

class test5{

}
