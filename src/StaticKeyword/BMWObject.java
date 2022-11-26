package StaticKeyword;

public class BMWObject {
    public static void main(String[] args) {
      BMW carSeries3 = new BMW(); //i made my object of my class model BMW the car type in this case 3 series bmw
        carSeries3.setCarInfo(2022,45000.00);
        System.out.println(carSeries3);//my output will be everything ive included in my method beginning with
        //parameters modelYear and price, followed by my boolean variable ..anytime i print ill get my toString
        //method and everything included in its method.

        System.out.println("carSeries3.getPrice() = " + carSeries3.getPrice());//this instance method needs to be called
        //by object of class BMW because it is instance.
        System.out.println(BMW.hasEngine);
        System.out.println(BMW.brand);//hasEngine and brand were called by class reference only not through object
        //because it is static, you dont need multiple copies for different object it'll be the same for every object
        //created.

        BMW BMWSuv = new BMW();
        System.out.println(BMWSuv);//only my static variables that wont change for each object will have value
        //output = BMW , 0 , true , 0

        System.out.println(BMW.isHasEngine());//since this method has a return type i have to put it in println
        //we do this so i can manipulate if it were void it would just print but i could not manipulate result.

        System.out.println(BMWSuv.price);//since it is not static method i have to call using object and since it has
        //a return type i must put it in a println to print.




    }
}
