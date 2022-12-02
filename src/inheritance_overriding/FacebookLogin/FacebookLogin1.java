package inheritance_overriding.FacebookLogin;

public class FacebookLogin1 {
    /* steps to test facebook login
    try this with chrome , firefox , opera ,safari, edge
open browser
go to facebook url
passing credentials (Username password) // (successfully Logged in)
close browser./ THIS WILL SERVE AS OUR BASIS FOR ALL OF OUR CLASSES WE CREATE FOR DIFFERENT BROWSERS USING
INHERITANCE OOP CONCEPT. EXTENDS WILL CREATE THE PARENT CHILD RELATIONSHIP BETWEEN MY CLASSES SO THAT I MAY CALL MY
CLASSES. THEN I CAN CREATE IN A DIFFERENT CLASS AN OBJECT FOR ALL BROWSER HAVING NO INHERITED MY METHODS AND VARIABLES
     */

    //Variables needed for this class
    //Username, password, email all instance variables so that they can be unique to the user

    //methods
    //open browser(), go to url, pass credentials, close browser

    private String Username;
    private String Password;
    //how do we get our private variables? through encapsulation. we achieve this by hiding sensitive data and
    //using getter and setter methods (special methods to see and assign data)
    // our variables are instance so that they are unique to each object passed


    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;

    }

    //methods
    //open browser(), go to url, pass credentials, close browser

    public void OpenBrowser(){
        System.out.println("Browser is starting");
    }

    public void GoToUrl(){
        System.out.println("on facebook url");
    }

    public void passingCredentials(String Username, String Password){
      setUsername(Username);//we have used setUsername, and setPassword method instead of saying "this" to define our
        //variables in our parameters since weve already assigned those private variables to getter and setter
        //methods
      setPassword(Password);
    }

    public void closeBrowser(){
        System.out.println("closing browser");
    }

}
