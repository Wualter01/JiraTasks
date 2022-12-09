package PolymorphismIntro.PolymorphismPractice;

public class Encapsulation {

    //we make our variables private and use getter and setter methods to update them

    private String password;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

class encapsulationTask{
    public static void main(String[] args) {
        Encapsulation object1 = new Encapsulation();
        object1.setPassword("Wualter01");
        object1.setUserName("kidink1993@gmail.com");

        System.out.println("object1.getUserName() = " + object1.getUserName());
        System.out.println("object1.getPassword() = " + object1.getPassword());
    }
}
