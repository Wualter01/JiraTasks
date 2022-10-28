package Part3Recap;

import java.util.Scanner;

public class TwitterLoginVerification {
    /*create a logic that will check login function of facebook, twitter, gmail.
    correct username = renastech
    correct password = renastech123

    use scanner here to pass usernames and passwords
    do validation of those usernames and passwords matching with the correct credentials
     */

    public static void main(String[] args) {
        String ExpectedUsername= "renastech";
        String ExpectedPassword= "renastech123";

        /*correct credentials ---should pass
        true username and true password
        incorrect credentials ---should fail
        false username true password
        false password true username
        false username false password
         */

         Scanner scan = new Scanner(System.in); //this will create an object from scanner

        System.out.println("Enter username : ");
        String userInputForUsername= scan.nextLine();
        System.out.println("Enter password : ");
        String userInputForPassword= scan.nextLine();

        if (userInputForUsername.equals(ExpectedUsername) && userInputForPassword.equals(ExpectedPassword)){
            System.out.println("You have successfully logged in");
        }else{
            System.out.println("Login function has failed");
            System.out.println("invalid credentials, please check your credentials");
            System.out.println("credentials are : "+userInputForUsername + " / "+userInputForPassword);
        }
    }
}
