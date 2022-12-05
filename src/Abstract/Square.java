package Abstract;

public class Square extends Shape {

    //if i extend parent class that has abstract methods those methods need to be overridden otherwise your class
    //will prompt issues

    public final String shapeName="Square";
    public double length;

    public Square(double length){
        this.length=length;
    }

    void shapeName(){
        System.out.println("shapeName = " + shapeName);
    }
    void shapeArea(){

        double area = length* length;
        System.out.println("Area of "+shapeName + " is "+area);

    }
}
