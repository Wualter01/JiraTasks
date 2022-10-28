package Recap;

public class StringPractice {
    public static void main(String[] args) {
        String student1= "wualter vasquez";
        String student2 ="jennifer ayala";
        String student3 = "katalina vasquez";

        byte KatsAge= 2;
        int jennifersAge= 22;
        int wualterAge=29;

        System.out.println(student1 + " age is : " + wualterAge);
        System.out.println(student2 + " age is : " + jennifersAge);
        System.out.println(student3 + " age is : " + KatsAge);

        //if we do not put it in double quotes java will concat the string and the ages together so we must
        //tell java to first get us the sum of the ages then write our string
        System.out.println("the sum of all their ages = " + (KatsAge+wualterAge+jennifersAge) );
        //another way to write is the following using our sum as a variable
        int sumOfAge= KatsAge+wualterAge+jennifersAge;
        System.out.println("sum of persons age = "+sumOfAge);
    }
}
