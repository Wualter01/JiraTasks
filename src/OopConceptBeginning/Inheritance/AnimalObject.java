package OopConceptBeginning.Inheritance;

import MyUtils.GenericUtils;

public class AnimalObject {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name="Cheetah";
        animal1.age=5;
        animal1.color="yellow & black";
        animal1.gender='m';

        Bird bird1 = new Bird();//with inheritance i can call the object of bird class and still use variables from
        //animal parent class because it was extended to  bird class
        bird1.name="hawk";
        bird1.color="black and white";
        bird1.eat("worms");
        bird1.canFly();
        bird1.gender='m';
        System.out.println(bird1);

        GenericUtils.StarSeparation();
        Fox fox1 = new Fox();
        fox1.name="foxy";
        fox1.age=3;
        fox1.color="orange";
        fox1.smileFox();
    }
}
