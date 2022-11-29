package OopConceptBeginning;

public class OopEncapsulation {
    /*00P PRINCIPLES: object oriented programing language
•Encapsulation : (Data Hiding)
• Inheritance
•Abstraction
•Polymorphism
00P will combine group of related variables and functions to unit (object).

     */

    //1st step hide data using access modifier private
    private String name;
    private long IDNum;
    private int age;
    //nobody will have direct access to above variables
    //since all the variables are private which will make them not accessible from outside
    // you will need to assign or modify them
    // there should a way to do this
//2.Provide public setter and getter methods to modify and view the variables values.
//this process is called encapsulation

    public void setName(String name){//considered my setter method this will help me assign or view in another class
        //since variables are private
        this.name=name;
    }

    public String getName(){//this will serve as my getter method so that i may see or assign data outside the class
        return name;
        //making our variables private and our getter and setter method public allows us to assign and view these
        //variables outside our class therefor achieving encapsulation
    }

    public void setAge(int age){//setterMethod and it is best to name it this way to avoid getting confused
        this.age = age;
    }

    public int getAge(){//getter method
        return age;
    }

    public void setIDNum(long IDNum){//setter
        this.IDNum=IDNum;
    }

    public long getIDNum(){//getter
        return IDNum;
    }

}
