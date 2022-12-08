package Abstract;

public interface InterfacePractice {


        /*there is only one access modifier allowed in interface -->public
        what is allowed in interface?
        variables: static and final by default
        methods: abstract methods, static methods, default method

        in interface, we cannot have constructor, instance variable, instance methods, and blocks

         */

       // public InterfacePractice()--> interface cannot have a constructor, we cannot create an object from it


    //public void method1(){}--> in interface methods cannot have body they must either be abstract,static, or default

    int number=100;//this variable by default is static and final
    final static int number2 = 200;//words final and static are both dull because by default variables are final and
    //static

    public static void main(String[] args) {//public is dull because everything in interface is public
        System.out.println(number);
        //number=300 <-- this is not allowed since variables are final they cannot be reassigned or have multiple
        //copies of them

    }
}
