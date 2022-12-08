package PolymorphismIntro;

public class Samsung extends Phone implements playStore{

    static {
        brand="------Samsung------";
    }

    public Samsung(String model, double price){
        this.model=model;
        this.price=price;

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
        System.out.println(brand+ " "+model+" is texting from "+storeName);
    }

    public void helloSamsung(){
        System.out.println(brand+model+" is here");
    }
}
