package inheritance_overriding.FacebookLogin.CarTask;

public class Tesla extends Car {
    @Override
    public void consumes(){
        System.out.println("is an electric vehicle");
        // we have overridden consumes gas method because tesla is an electric vehicle. this is the logic behind
        //overriding
    }

}


