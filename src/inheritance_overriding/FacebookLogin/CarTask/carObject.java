package inheritance_overriding.FacebookLogin.CarTask;

import MyUtils.GenericUtils;

public class carObject {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.startCar();//when making the object class you dont have to extend your class car. you only have to
        //extend or have your audi class inherit methods from car class so that you may use them here
        audi.consumes();
        audi.startCar();

        GenericUtils.StarSeparation();

        BMW bmw = new BMW();
        bmw.startCar();
        bmw.consumes();
        bmw.stopCar();

        GenericUtils.StarSeparation();

        Tesla tesla = new Tesla();
        tesla.startCar();
        tesla.consumes();
        tesla.stopCar();

        GenericUtils.StarSeparation();

        bmw.startCar();
        //when overriding you can only change the access modifier everything else has to be the same. you can only
        //make it more visible example if it is default we can make it public
    }
}
