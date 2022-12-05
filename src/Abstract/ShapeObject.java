package Abstract;

public class ShapeObject {

    public static void main(String[] args) {
       Rectangle rectangle1 = new Rectangle(3,5);
       //area of rec 1 == width(3) * length(5) = 15
        rectangle1.shapeName();
        rectangle1.shapeArea();

        Square square1 = new Square(4); //length*length (4*4)=16
        square1.shapeName();
        square1.shapeArea();

        //logic of making our shape class abstract is because we know each shape will be unique and area will be
        //unique so we make methods abstract so we can override with unique data for each
    }
}
