package PolymorphismIntro.PolymorphismPractice;

public class Dog extends Animal{

  //create a fish class that extends Animal
    // belows will be inherited
    // age, gender
    // eat, grow, animalMethod

    //create a constructor that will take DogName, gender and age

    public String DogName;
    public Dog(String DogName,int age, char gender){
        this.age=age;
        this.gender=gender;//we've inherited age and gender from parent class and we are specifying that age and gender
        //constructor parameters are the same ones inherited.
        this.DogName=DogName;
    }

//override methods eat grow for fish
// create a run method for Dog


    //everything we have overridden was not abstract we could have done an abstract class as well but since we did
    //not we have to manually override. if we do not default data in animal class would run in object class
    @Override
    public void eat(){
        System.out.println(DogName+" is eating ");
    }
    @Override
    public void growing(){
        System.out.println(DogName+" is growing");
    }

    public void run(){
        System.out.println(DogName+" is running ");
    }

}
