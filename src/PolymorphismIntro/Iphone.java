package PolymorphismIntro;

public class Iphone extends Phone implements appleStore{
    //IN THIS EXAMPLE IPHONE HAS TWO PARENTS BOTH PHONE AND APPLE STORE

    static {
        brand="------Apple------";//static block gets executed before anything else brand variable is inherited
        //by phone parent class
    }

    public Iphone(String model, double price){
        //constructor is created using access modifier equal or less restriction followed by class name
        //and parameters it'll take if any.

        this.model=model;
        this.price=price;//we have to specify we mean our instance variables == to our variables in our parameters

    }

    @Override
    public void texting(long number) {
        System.out.println(brand+ " "+model+" is texting "+number);
    }

    @Override
    public void calling(long number) {
        System.out.println(brand+ " "+model+" is calling "+number);
    }

    @Override
    public void downloadApp() {
        System.out.println(brand+ " "+model+" is texting from "+storeName);//storeName comes from AppleStore method in
        //appleStore interface
    }

    public void iMessage(long number){
        System.out.println(brand+ " "+model+" is iMessaging "+number);
    }
}
