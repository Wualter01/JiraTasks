package inheritance_overriding.FacebookLogin;

public class FacebookChrome extends FacebookLogin1{
    //all of these browser classes are examples of inheritance with extends keyword to build parent
    // and child relationship between classes

    @Override //using the same method name and parameters allows me to override method and change data
    //override annotation confirms ive successfully overridden my method because no error appeared
    public void OpenBrowser(){
        System.out.println("chrome browser has started");
        //only chrome browser will be unique since it has been overridden all the other browser pages where ive used
        //OpenBrowser method will remain the same. to check results for all browser classes we've created object of
        //facebook login there is where i can call my inherited methods for each browser.
    }
}
