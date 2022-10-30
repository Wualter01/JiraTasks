package RecapAfterGitHub;

public class ArrayContinued {
    public static void main(String[] args) {
    int [] numberList= {10,20,30,40};

    String [] Names={"Java","Python","C#","Wualter","Jennifer","PS5"};

        System.out.println(Names[1]);//to print python using index we pass index number in []

        System.out.println("numberList = " + numberList[2]);
/*to print all the names i need to use a loop.
Start by identifying your starting and ending point followed by iteration
then variable i will print your names 1 by one til condition is met
 */

        for (int i=0; i<=5; i++){
            System.out.println(Names[i]);

        }

        int [] numbers={ 1,5,19,35,36,100,200 };
        //numbers[4] this is saying bring me the number at index 4
        System.out.println("numbers list length = " + numbers.length); //if i have a list of numbers and i cant count
        //them all i can do this to get the number of items in my array and then subtract 1 to have index total.

        if (numbers[2] > numbers[5]){
            System.out.println("2nd index from numbers list is bigger than index number 5");
        }else{
            System.out.println("2nd index from numbers list is smaller than index number 5");
        }

        String engineer= new String();// this will store only one engineer
        String [] engineers= new String[5];//size for this container is defined as 5 index numbers =0-4
        //array size is fixed. You will need to specify the length when you create an array.
        //size has to be passed between brackets[]
        //for engineers we have size ==5 (number will be assigned as soon as you create the array)
        //since we didnt define index numbers with data all the index spaces will be null and return "null".
        //we must define when declaring an array using key word or creating the object we will not be able to leave
        //size empty or undefined we can only leave the data inside undefined if we please.

        System.out.println(engineers[2]);//this will return null until we define it.
        engineers[2]="Wualter";
        System.out.println("engineers = " + engineers[2]);//this will no longer return null and return whatever we
        //have assigned to it.
        engineers[4]="dev1";//[5] would give us exception
        System.out.println("engineers = " + engineers[4]);//you'll get out of bounds exception because 5 is outside of
        //our index realm. When we defined our engineers array we passed five as length or (size) of our container
        //but here after it will take index number and size will be fixed...if it were[5]

        //length of array
        int length = engineers.length;
        System.out.println("length = " + length);//length =5

        for (int i=0; i<=engineers.length-1; i++){//IF YOU JUST WANTED TO PASS LENGTH WITHOUT -1 DO i<engineers.length
            //THIS WOULD ALSO WORK
            System.out.println("engineers = " + engineers[i]);

        }

        //can you create a boolean container? (array)
        boolean[] ListOfBooleans ={true,false,true,false,true};
        boolean[] ListOfBooleans2 = new boolean[3];
        //if you dont assign anything to booleans, java will take false as a default
        System.out.println(ListOfBooleans2[0]);//output default= false

        ListOfBooleans2[0]=true;
        ListOfBooleans2[1]=true;
        ListOfBooleans2[2]=false;
        System.out.println(ListOfBooleans2[0]);
        System.out.println(ListOfBooleans2[1]);
        System.out.println(ListOfBooleans2[2]);

        System.out.println("*************************");

        boolean [] list1={true,false,true,true,true,false,true};

        //create a java program that will check boolean values
        //if value is true print passed
        //if value is false print failed

        for (int i=0; i<= list1.length-1; i++){

            if(list1[i]){//you dont need to say if it is ==true because if checks for true or false already
                //adding an ==true would be a redundancy. you pass your variable i in list so that it checks list
                //one by one
                System.out.println("Passed");
    }else{
                System.out.println("Failed");
            }
        }
    }
}
