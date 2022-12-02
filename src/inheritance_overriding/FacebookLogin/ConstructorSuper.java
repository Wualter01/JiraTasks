package inheritance_overriding.FacebookLogin;

public class ConstructorSuper extends Test2 {
    //parent class constructors will be inherited

    //constructor chaining from base class: by using super() keyword to call constructor from the base class
    public ConstructorSuper(){
        super(35);//if your parent class has more than one constructor when you create your constructor you'll
        //get an error. java will ask you which constructor do you wish to run in your child class so you specify with
        //keyword SUPER() and pass your constructor parameter you wish to use
        System.out.println("constructor default");
    }

    public static void main(String[] args) {
        ConstructorSuper object1 = new ConstructorSuper();
        ConstructorSuper object2 = new ConstructorSuper(45,"hello");

    }

    public ConstructorSuper(int num1,String str1){//everytime i create an object both constructors
        //for parent and child will run since my parameters are different for this one i have to specify again which
        //constructor from parent class do i want to run. even default constructor ill have to use keyword super()
        //with blank parameters to specify default constructor
        super("hello");
        System.out.println("constructor string and int");

    }

}

class Test2{

    public Test2(String str){
        System.out.println("Test2 String");
    }
    public Test2(int num){//this parent constructor will run first then your constructor in your class
        System.out.println("test2 int");
    }

}
