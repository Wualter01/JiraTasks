package RecapAfterGitHub;

public class Array3 {
    public static void main(String[] args) {
        int [] arr={5,-15,35};
        System.out.println(arr.length);

        int [] arr2= new int[20];//length is 20
        System.out.println(arr2.length);
        System.out.println(arr2[5]);//default value 0 because we have not assigned data
        //default value for string =null boolean= false int=0

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");

        //store numbers 3-22 in array
        for (int i=0; i<=arr2.length-1; i++){
            arr2[i]=i+3;//this is adding 3 to our index so that we get the sequence we are looking for 3,4,5 etc

            System.out.println(arr2[i]); //this will print each number at i as it loops

        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%");

        int [] numbers={5,8,10};
        System.out.println(numbers[1]);//8 before reassigning

        numbers[1]=20;
        System.out.println(numbers[1]);//20 after reassigning now your array consists of {5,20,10}

        numbers[0]=numbers[2]; //number at index 0 gets reassigned to number at index 2 which in this case is 10
        //you'll have now 10,20,10

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);


    }
}
