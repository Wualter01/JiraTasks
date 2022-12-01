package inheritance_overwriting.FacebookLogin;

import MyUtils.GenericUtils;

public class FacebookLoginObject {
    public static void main(String[] args) {
        FacebookLogin1 object1 = new FacebookLogin1();
        //i cannot directly assign my instance variable username because it is private i must use my setter method
        //for userName
        object1.setUsername("Wualter01");
        object1.setPassword("Java");

        System.out.println("object1.getPassword() = " + object1.getPassword());
        System.out.println("object1.getUsername() = " + object1.getUsername());

        //now i can create my objects and use different browsers for them all with my fb login methods and variables

        FacebookChrome chrome = new FacebookChrome();
        chrome.OpenBrowser();
        chrome.passingCredentials("Wualter01","java");
        System.out.println("chrome.getPassword() = " + chrome.getPassword());
        System.out.println("chrome.getUsername() = " + chrome.getUsername());
        chrome.closeBrowser();

        GenericUtils.StarSeparation();
        FacebookFirefox firefox = new FacebookFirefox();
        firefox.OpenBrowser();
        firefox.GoToUrl();
        firefox.passingCredentials("Wualter01","JavaLavaBingBong");
        System.out.println("firefox.getUsername() = " + firefox.getUsername());
        System.out.println("firefox.getPassword() = " + firefox.getPassword());
        firefox.closeBrowser();


    }
}
