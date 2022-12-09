package PolymorphismIntro.PolymorphismPractice;

import MyUtils.GenericUtils;

public class Objects {

    public static void main(String[] args) {
        Dog dog1= new Dog("Gambit",5,'M');
        dog1.eat();
        dog1.growing();
        dog1.animalMethod();//this method we have inherited we didnt override it so it'll be whatever is in parent
        //method
        dog1.run();

        GenericUtils.StarSeparation();

        Animal animal1 = new Animal();
        animal1.eat();
        animal1.growing();
        animal1.animalMethod();
        // we cannot use animal1.run(); because it is specific to Dog class. it is not in our Animal class

        GenericUtils.StarSeparation();

        Animal animal2 = new Dog("Ace",1,'M');
        animal2.eat();//result comes from Dog
        animal2.growing();//result comes from Dog because it was overridden and they are also in dog class
        animal2.animalMethod();
        //animal2.run(); we cannot use run method because we have used polymorphism to change our object it is no
        //longer dog it will now act as parent. and parent class animal does not have a run method
    }
}
