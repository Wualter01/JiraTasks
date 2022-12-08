package PolymorphismIntro;

public abstract class Phone {

    /*
    // 1. create an abstract class called Phone
attributes: brand, model, price, size
abstract methods: callinq()._texting()
instance method: toString)


create subclasses called iphone and samsung
--create a static block to assign brand at beginning for iphone and samsung
--create a constructor to assign model, prize and size for iphone and samsung
--override abstract methods from parent Phone class
     */

    //below are our variables (attributes) brand, model.
    public static String brand;//static means we cannot have multiple copies, logic i'll assign once in child class
    //so if im working with iphone i dont need to keep changing it, it'll be the same throughout child class.
    //then when i move on to samsung i can reassign again for each object.
    public String model;
    public double price;


    //now we create our abstract methods calling and texting.
    public abstract void texting(long number);//since this method will be abstract it does not have a body. this method
    //is meant to be overridden in child class. we've also made access modifier public and specifier void so it has
    //no return type
    public abstract void calling(long number);

    public String toString(){
        return "phone brand : "+ brand+ " Phone Model "+ model+" Phone Price "+price;
    }

}

interface downloadable{
    public static final boolean download=true;
    abstract void downloadApp();
}

interface appleStore extends downloadable{
    //with keyword extends ive inherited download variable and downloadApp method.
    //download is a variable because it has no parameters().we do not need to override download method because we
    //are inheriting to another abstract class

    String storeName="Apple";
}

interface playStore extends downloadable{
    //with keyword extends ive inherited download variable and downloadApp method.
    String storeName="playStore";
}
