package Part2Recap;

public class NestedIfPractice {
    /*create a java program to check if person is eligible to give blood
    requirements to give blood:
    person needs to be older than 18
    person weight needs to exceed 50lbs
     */
    public static void main(String[] args) {

        String personName = "wualter";
        int personAge = 19;
        double personWeight = 50.5;//weight is not always a solid number hence why we used double
        String result = "";

        if (personAge > 18) {

            if (personWeight > 50.0) {
                result = "person is eligible to give blood";
            } else {

                result = personName + " is not eligible to give blood";
            }

        } else if (personAge > 0 && personAge <= 18) {

            result = personName + " needs to be older than 18";
        } else {

            result = "invalid age entered " + personAge;

        }
        System.out.println(result);
    }
}
