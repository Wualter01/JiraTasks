package StaticKeyword;

import MyUtils.GenericUtils;

public class CarObject {
    public static void main(String[] args) {
        car WualterCar = new car("Honda",2016,20000.00,"dark blue");
        //since we have constructor methods in our car class we cannot leave parameters
        //empty we have overloaded our car constructor method and it is asking which one you wish to use.

        //ive set information about object Wualter's car now i can print specific data about the car
        System.out.println(WualterCar.color);
        System.out.println(WualterCar.yearMake);

        //if i want to print all information about Waulter's car i can pass object name to print and toString
        //method will convert object to string and pass everything ive included in return type
        System.out.println(WualterCar);

        car jennifersCar= new car("Hyundai",2020,29000.00,"dark green");

        System.out.println(jennifersCar.yearMake);
        System.out.println(jennifersCar.brand);
        System.out.println(jennifersCar);

        GenericUtils.StarSeparation();

        jennifersCar.getCarBrandAndYear();

        GenericUtils.StarSeparation();

        car WualtersDreamCar = new car("Honda",2022);
        System.out.println(WualtersDreamCar.brand);
        System.out.println(WualtersDreamCar.yearMake);
        System.out.println(WualtersDreamCar.color);//null because in our constructor we used the one that only
        //passed brand and yearMake
        System.out.println(WualtersDreamCar.price);//0.0 because we have passed double

        GenericUtils.StarSeparation();

        car car4 = new car("Kia suv",2022,40000.0,"white");
        System.out.println(car4.color);//constructor will check what has been assigned to car4 and print
    }
}
