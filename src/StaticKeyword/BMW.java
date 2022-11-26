package StaticKeyword;

public class BMW {
    /*
    logic for creating a class for specific vehicle in this case BMW
    methods we can have or attributes such as..

    modelYear - since model year differs from each object BMW we should make this instance so we can change it depending
    on the year.
    price - price will also vary depending on model year and make so we should also make this instance
    color - color also varies from object to object so instance is required
    miles- instance
    brand - static since we are only talking about BMW's it should stay the same
    horsePower - instance

    if you are not going to create multiple copies from object its better to use static variables
    ex : folderPaths, environmentName, specific url

    THIS CLASS IS WHERE MY METHODS WILL GO FOR MY OBJECT CLASS OF BMW EX: BMW SERIES 3 VEHICLE WILL BE AN OBJECT
    OR SERIES 2 ETC..
     */

    static String brand = "BMW"; //if this were instance i would have to continuously reassign
    static boolean hasEngine=true;
    int modelYear;
    double price; //made this instance variable price instance because it'll vary from vehicle to vehicle, also
    //made it double because price could be decimal

    public void setCarInfo(int modelYear , double price){
       this.modelYear=modelYear;//this is saying model year instance variable is = to the int variable im passing in
       //parameters.. "This" keyword is used to define my instance in the class.. to clarify that instance
        //and int price and modelYear are referring to the same instance variable

       this.price=price; //same as on top im letting java know that price instance variable is same as price in
       //parameter.. we do this so java doesnt get confused if we use same name.
    }

    //create a method that returns only price

    public double getPrice(){
        return price;
    }

    //to return "has engine"
    public static boolean isHasEngine(){
        return hasEngine;
    }

    public String toString(){
        return brand + "----"+ modelYear + " has engine "+hasEngine + " ====== " +price;
    }

}
