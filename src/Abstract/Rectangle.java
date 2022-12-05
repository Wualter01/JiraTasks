package Abstract;

public class Rectangle extends Shape{
    //inherited shapeName, shapeArea. These two methods are meant to be overridden during inheritance
    //at class initiation you'll have red error until you override your methods in your abstract class. you do this by
    //making its accessibility more accessible example default to --> public like shown below. you also give your
    //abstract methods a body with curly brackets that your abstract class did not have.If you were to make these
    //methods again abstract they would not be allowed a body**

    public final String shapeName="Rectangle";
    public double width;
    public double length;

    public Rectangle(double width, double length){

        //remember when clarifying that your instance variable is same as variable in parameters you must use this.
        this.width=width;
        this.length=length;

    }

    @Override
    public void shapeName(){

        System.out.println("shapeName = " + shapeName);
    }

    @Override
    public void shapeArea(){

        //rectangle area is = width * length
        double area = width * length;
        System.out.println("Area of "+ shapeName + " is "+area);

    }

}
