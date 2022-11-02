package RecapAfterGitHub;

import java.util.Arrays;

public class Arrays8Practice {
    public static void main(String[] args) {
        //Task: create a program that will print numbers from biggest to smallest in given array

        int [] numbers={34,50,90,99,-99}; //expected output 99,90,50,34,-99
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));//this will sort them from smallest to biggest

        int [] biggestToSmallest= new int[numbers.length];// this is the best way to do it so that you can add and
        //subtract as many numbers as you want without disturbing this part of the code itll always cover all your
        //numbers since we have defined it as length
        int temp=0;//this is so we can pass what index number to begin storing our new biggestToSmallest numbers at 0
        //which is beginning
        for (int i = numbers.length-1; i >=0; i--) { //since we defined that we would like to start with our last
            //index number 4 then we must go back down to 0 so we want to do i is greater than or ==0 so when we reach
            //0 we want to stop.
            biggestToSmallest[temp]=numbers[i];//this is saying begin storing numbers at [i] biggestToSmallest at
            // 0(temp)
            temp++; //we must tell temp to move from index 0 and increase by one til our condition is false
        }
        System.out.println(Arrays.toString(biggestToSmallest));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
        /*TASK: write a program that can return the largest String of text from an array
        EX: String [] names = {"denver","Texas","Orlando",Toronto","Jennifer","Sevgin","RenasTech"}
        output: RenasTech
         */

        String [] names = {"denver","Texas","Orlando","Toronto","Jennifer","Sevgin","RenasTech"};
        //length of index 2
        System.out.println(names[2].length());
        int MaxLengthIndex=names[0].length();//this is assuming the string at index 0 holds the longest length

        for (int i = 0; i < names.length; i++) {
            if (names[i].length()>MaxLengthIndex){
                MaxLengthIndex=i;
            }


        }
        System.out.println(names[MaxLengthIndex]);
        
    }
}
