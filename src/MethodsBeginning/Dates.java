package MethodsBeginning;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        //logic if i need to name packages or files with the dates that i run or time.
        //you can use different names as long as its dynamic
        //LocalDate class is coming from java library
        LocalDate obj1=LocalDate.of(2022,11,17);
        //we create objects from classes

        System.out.println(obj1);

        LocalDate localDate2=LocalDate.of(2021,05,21);
        System.out.println("localDate2 = " + localDate2);

        boolean b1=localDate2.isAfter(obj1);//false
        boolean b2=localDate2.isBefore(obj1);//true
        boolean b3=localDate2.isEqual(obj1);//false

        System.out.println(b1 + " / "+b2+" / "+b3);

        //todayDate method
        LocalDate todaysDate=LocalDate.now();
        System.out.println(todaysDate.toString().replace("-",".")); //we are replacing dashes with
        //dots for aesthetic / LocalDate brings a lot of methods you can explore using .etc..



    }
}
