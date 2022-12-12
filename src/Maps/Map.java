package Maps;

import MyUtils.GenericUtils;

import java.util.LinkedHashMap;

public class Map {

    /*Data Structure :
    Array (fixed, primitives & objects)
    Collection (dynamic, only objects)
    Map (dynamic, only objects)

    Map Interface: accepts key and value. cannot be primitives.
    key MUST be unique
    Map methods:
    put (key, value): inserts key and value to map
    get (key): returns the value of the given key
    remove (key): removes the given key and it's value from the map
    size():
    containsKey (key): checks if the key is contained in the map. boolean
    containsValue (Value): checks if the value is contained in the map. boolean
    clear(): clears everything

    isEmpty (): boolean
    keySet(): returns all the keys from the map as Set
    values(): returns all the values from the map as Collection
    setEntry():

    HashMap: does not keep the insertion order
    accepts null
    HashTable: is synchronized, thread-safe ==> one thread at a time
    slower
    does not accept null.

    LinkedHashMap: keeps the insertion order as is.
    put & remove are faster accepts null

    TreeMap: sorts the keys in ascending (sorted map)
    does not accept null
     */

    public static void main(String[] args) {
        java.util.Map studentInfo= new LinkedHashMap<>();//this is also an example of polymorphism
        //we have the interface Map and we cannot create the object of interface so we use child class
        //and use Map in a different form to create the object.
        //array and collection would not allow for two data types but map does one for key and value
        //key : will be string that we will use for student names
        //key has to be unique

        //value : will be integer and we will use for student numbers
        //only accepts object types

        //put(key,value): inserts key and value to map
        studentInfo.put("ACP",20);
        studentInfo.put("Wualter",17);

        System.out.println(studentInfo);

        System.out.println("studentInfo.size() = " + studentInfo.size()); //size is two because we have 2 students
        //this is how you get size for map

        //get(key): returns the value of the given key
        System.out.println("studentInfo.get(\"Wualter\") = " + studentInfo.get("Wualter"));

        //remove (key): removes the given key and it's value from the map
        studentInfo.remove("Wualter");//punctuation matters
        System.out.println(studentInfo);

        studentInfo.put("Katalina",10);
        studentInfo.put("Jennifer",10);
        studentInfo.put("Katalina",8);//when we have the same key with different value we override we have basically
        //told java it was 10 and we have reassigned to 8. it will not add another Katalina because key is unique
        studentInfo.put("Gambit",10);//more than one key can have the same value, in this scenario bot gambit and
        //jennifer have value of 10. //key goes first then value.* value can be duplicate

        System.out.println(studentInfo);

        //LinkedHashMap<String, double> list //map only accepts objects and not primitive values (double)
        LinkedHashMap<String, Double> studentAge = new LinkedHashMap<>();

        studentAge.put("wualter",29.0);//pay attention to the values defined in your linkedHashSet ive said Double
        //so i cannot enter numbers without a decimal.
        studentAge.put("Jennifer",22.5);
        studentAge.put("Gambit",5.0);
        studentAge.put("Katalina",1.9);

        System.out.println(studentAge);
        System.out.println("studentAge.get(\"Katalina\") = " + studentAge.get("Katalina"));
        System.out.println(studentAge.get(1.9));//prints null because i have no KEY with value of 1.9

        /*get method will only accept key and if key is present in your map you will see the value of key
        if it is not present in your map you will see the value "null"
         */

        boolean b1 = studentAge.containsKey("wualter");
        System.out.println("b1 = " + b1);//true
        boolean b2 = studentAge.containsKey("Katalina");
        boolean b3 = studentAge.containsValue(1.9);

        System.out.println("b3 = " + b3);//we are saying value and not key so itll look for values matching 1.9

        //clear(): clears everything
        //isEmpty(); boolean

        GenericUtils.StarSeparation();
        System.out.println(studentAge);
        studentAge.clear();
        System.out.println(studentAge);
        System.out.println("studentAge.isEmpty() = " + studentAge.isEmpty());//returns true or false

    }
}
