package classesVsObjects;

public class ShoeExample {
/*
custom classes which will be your library for shoes

ArrayList class examples                  shoe
data : can be any type of object          data:shoe object
functions : add, remove , size ,get..     functions : brand,size, color
                                          wear() , getShoeInfo

idea of creating object from class
ArrayList <> list   =new ArrayList();
Class refName          OBJECT

shoe nike = new Shoe(); - shoe is my class name nike is the reference to my class or having to do with my class
=new shoe and now ive created an object of my shoe class

class :  It is where you actually implement your code. you store variables methods inside your class
this is where you create an object from . Class will explain behaviour of objects

local variables: local variables that we declared with in block(main method, other methods „static plock)
instance variables: object variables that we create inside of class
instance variables can not have static specifier
needs to be declared outside of methods or blocks

access-modifier =public , protected , default , private / defines level of access
    specifier  : static, final, abstract,  synchronized
    return type : void, any dataType(int,string,char,int []....)
    some methods have parameters some don't.
 */

    String brand;//brand, size, and color serve as my instance variables. all of these are attributes of my shoe
    int size;//instance variables are declared outside a method body like so.
    String color;


    //static String brands2;//this is static variable. how do you know it is a static variable? because
    //we have used key word static

    public void wear(){//function of shoe class..this is a method
        System.out.println("She/He is wearing " +brand+" ");

    }

    public void getShoeInfo(){
        System.out.println(brand+ " ,"+size+" ,"+color);//logic is if i print this method or call this method ill get
        //the brand size and color. we have specified this method is void so it has no return type parameters are
        //optional.
    }

    public void setShoeInfo(String shoeBrand, int shoeSize, String shoeColor){//these parameters serve the purpose
        //of attributes/ also this method will set shoe object information
        brand=shoeBrand;
        size=shoeSize;
        color= shoeColor;

    }

    public String toString(){//toString method gets executed automatically whenever we pass object name into
        //the print statement.

        return brand+ " / "+size+ " / " +color;
    }
}

