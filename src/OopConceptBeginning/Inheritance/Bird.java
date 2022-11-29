package OopConceptBeginning.Inheritance;

public class Bird extends Animal{

    //since we have used extends keyword to get parent class (animal class) for bird class (child class)
    //we have now inherited all variables, methods extended to your bird class

    public void canFly(){
        System.out.println(name + " can fly "+color+age+weight);
        //we have inherited variables from parent class Animal
    }

}
