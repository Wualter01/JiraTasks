package inheritance_overriding.FacebookLogin;

class Test3{
    int number=25;

    public Test3(int i){
        System.out.println("i = "+i);
    }

    public Test3(){
        System.out.println("default constructor test3");
    }

    public void method1(){

        System.out.println("hello method1");

    }


}

public class ConstructorSuper2 extends Test3{
    //inherits the constructor for Test3 including method and int everything...

    public ConstructorSuper2(){
        super(2);
        System.out.println("default constructorSuper2");
    }

    public static void main(String[] args) {
       ConstructorSuper2 object = new ConstructorSuper2();
    }

}
