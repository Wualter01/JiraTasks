package Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Map3 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> gMailCredentials = new LinkedHashMap<>();
        gMailCredentials.put("user1","pass1");
        gMailCredentials.put("user2","pass2");
        gMailCredentials.put("user3","pass3");
        gMailCredentials.put("user4","pass4");
        gMailCredentials.put("user5","pass5");
        gMailCredentials.put("user6","pass6");
        gMailCredentials.put("user7","pass7");
        gMailCredentials.put("user1","pass8");
        //key has to be unique it cannot have a duplicate exactly the same
        //user1 value will be reassigned

        System.out.println(gMailCredentials);
        //keySet will get us all keys as set from map and not value

        for (String eachKey : gMailCredentials.keySet()){
            System.out.println("eachKey = " + eachKey);
        }

        //Values(): returns all the values from the map as a collection
        for (String eachValue : gMailCredentials.values()){
            System.out.println("eachValue = " + eachValue);
        }

        //if i wanted to store usernames in arrayList
        ArrayList<String> usernames = new ArrayList<>(gMailCredentials.keySet());
        ArrayList<String> passwords = new ArrayList<>(gMailCredentials.values());

        System.out.println("usernames = " + usernames);
        System.out.println("passwords = " + passwords);

    }
}
