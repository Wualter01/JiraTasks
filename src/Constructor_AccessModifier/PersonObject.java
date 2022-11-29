package Constructor_AccessModifier;

public class PersonObject {
    public static void main(String[] args) {

      MalePerson  male1 = new MalePerson();

        System.out.println("MalePerson.isHuman = " + MalePerson.isHuman);
        System.out.println("MalePerson.gender = " + MalePerson.gender);

        male1.name = "wualter";
        male1.age = 29;

        if (MalePerson.isHuman && MalePerson.gender == 'M' && male1.age<55){
            System.out.println("person name " + male1.name);
            System.out.println("Age "+male1.age);
            System.out.println("person is younger than 55");
        }
    }
}
