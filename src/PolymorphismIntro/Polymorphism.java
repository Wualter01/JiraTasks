package PolymorphismIntro;

public class Polymorphism {
    //it is another concept of oop

//Polymorphism in Java is the ability of an object to take many forms.
// To simply put, polymorphism in java allows us to perform the same action in many different ways

//    //WebDriver driver=new ChromeDriver ();
//   //WebDriver driver=new FirefoxDriver();

    public static void main(String[] args) {

        car car1=new car();
        BMW bmw1 = new BMW();
        Toyota toyota1 = new Toyota();
        Tesla tesla1= new Tesla();

        //Polymorphism in java is the ability to take many forms
        car bmw2= new BMW();
        car toyota2 = new Toyota();

        //BMW bmw3 = new car(); <-- not allowed because car is parent of BMW we cannot create the object using child
        //class

        //car tesla2 = new Tesla();<-- we also may not do this because Tesla is not child of car we did not create
        //the relationship using extends keyword therefor it cannot take a different form

        car []arr1={car1,bmw1,toyota1,bmw2,toyota2};

        //BMW [] arr2={bmw1,bmw2} we cannot put bmw2 in bmw array because bmw2 has form of parent which is car
    }
}

class car{

}

class BMW extends car{

}

class Toyota extends car{

}

class Tesla{

}