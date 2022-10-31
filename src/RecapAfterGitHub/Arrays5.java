package RecapAfterGitHub;

import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        //find the sum of the total numbers provided in int array

        int [] numbers={4,-90,200,5 };//119 should be total
        int sum=0;
//i could've also passed last index= numbers.length-1; then done i<lastIndex
        for (int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];//or you can do sum+=numbers[i];
            System.out.println("sum = " + sum);//i have put this inside my loop so i can see it as it adds numbers til
            //it gets to 119.. if i wish to just get the sum put this outside of your loop

        }
        System.out.println("%%%%%%%%%%%%%%%%%");
        System.out.println(sum);
        System.out.println("******************");

        int [] ages= new int[5];//when you do it this way creating the object you need to specify the length of your
        //array like we have done above. if you decide to print your array by default when you do not add data is 0.

       // System.out.println(ages[10]);//out of bounds exception because we are out of the realm of our array length
        ages[2]=50;
        System.out.println(ages[2]); //assigning data to our empty array
        System.out.println(ages[3]);//will return the default for int in this case 0

        boolean [] foundJob= new boolean[3];//length of your array or how much data it will contain

        System.out.println(foundJob[0]);//will print false because it is unassigned and default for boolean is false
        foundJob[2]=true;
        System.out.println(foundJob[2]);//after ive assigned true to my boolean index at 2 which is last position
        //since index starts at 0..0,1,2= 3 and 3 is my length

        System.out.println("&&&&&&&&&&&&&&&&&&&&&");

        /*ARRAY UTILS
        array is a java library which has some methods
         */

        String [] FutureSdets={"Wualter","libby","Jennifer","Abe","rosa"};
       //this wont work you have to call specific data by index System.out.println(FutureSdets);
        //output will be a hashcode it is the id in our jvm

        //THERE IS A WAY TO PRINT ALL OF YOUR STRINGS INSIDE YOUR ARRAY USING THE FOLLOWING:
        System.out.println(Arrays.toString(FutureSdets));
        //shortcut= Arrays.toString.sout will give you the above

        int [] numList={0,1,4,5,6,90};
      //  System.out.println(numList);//will again print hashcode
        System.out.println(Arrays.toString(numList));//WILL WORK FOR INTEGERS AS WELL NOT JUST FOR STRINGS
        //TO.STRING IS A METHOD THAT WILL RETURN THE VALUE GIVEN TO IT IN STRING FORMAT./thats why it works with #s


    }
}
