package StaticKeyword;

public class car {

    //even if you dont create a constructor method java will create one by default .

    //instance vriables
    String brand;
    int yearMake;
    double price;
    String color;

    public car(String brand, int yearMake, double price, String color){//our constructor must be the same name as our
        //class
        this.brand=brand;//we are clarifying to java that we mean our instance variable = to our variable in our
        //parameter
        this.yearMake=yearMake;
        this.price=price;
        this.color=color;

    }

    public car(String brand, int yearMake){//the difference between this method and the previous one is the amount of
        //parameters passed, by doing so java understands that they are different. this is one way to overload a method
        this.brand = brand;
        this.yearMake=yearMake;

    }
    public String toString(){//is used to pass information about my class.
        //it will also give concise information about my class. anytime i pass object
        //name to println. it will also convert my object to String and will return object as string.

        return yearMake+ " , "+brand + " , "+price;
    }

    public void getCarBrandAndYear(){
        System.out.println("brand is " +brand);
        System.out.println("year is "+yearMake);

    }
}
