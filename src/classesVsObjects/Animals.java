package classesVsObjects;

public class Animals {

    String type;
    double age;
    String color;
    String name;//all the above are instance variables meaning they aren't declared inside a method
    //so they all can be shared between methods

    public void getAnimalInfo(){//will print all animal information
        System.out.println(name + " ,"+age+" ,"+color+" ,"+type);
    }

    public void setAnimalInfo(String animalType, double animalAge,String animalColor,String animalName){
        //this method will set information we passed in our parameters when we call it
        type=animalType;
        age=animalAge;
        color=animalColor;
        name=animalName;

    }
    public void eating(String food){
        System.out.println(name+ " is eating "+food);
    }

    public void getAnimalType(){

        System.out.println(name + " is a "+type);
    }

    public String toString(){

        return "Name of Animal : "+name+ " : age of animal : "+age+" : color of the animal : "+color+
                " : type of animal is : "+type;

    }
}
