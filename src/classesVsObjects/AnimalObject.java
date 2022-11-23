package classesVsObjects;

public class AnimalObject {
    public static void main(String[] args) {

       Animals  animal1 = new Animals();//animal1 can be labeled as your instance of your classgit

       animal1.type="Dog";
       animal1.color="brown and black";
       animal1.age=5;
       animal1.name="Gambit";
        System.out.println(animal1);

        animal1.getAnimalInfo();
        animal1.eating("kibble");
        animal1.getAnimalType();

        Animals animal2 = new Animals();
        animal2.setAnimalInfo("Horse",2,"brown","lightning");
        System.out.println(animal2);

    }
}
