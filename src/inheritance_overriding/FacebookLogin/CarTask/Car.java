package inheritance_overriding.FacebookLogin.CarTask;

public class Car {
    //functions of a car : start, stop

    void startCar(){//access modifier default meaning we can access it within class package
        System.out.println("car has started");
    }

    public void stopCar(){
        System.out.println("car is stopped");
    }

    public void consumes(){
        System.out.println("consumes gas");
    }
}
