package inheritance_overriding.FacebookLogin.CarTask;

public class BMW extends Car{

    @Override//when this has no issues no errors that means you've successfully overridden your method
    public void startCar(){
        System.out.println("BMW car has started");
    }
}
