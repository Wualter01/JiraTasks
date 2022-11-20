package List;


import MyUtils.GenericUtils;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        /*
        create a list of Integers, add 4 numbers and return maximum number
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(29);
        numbers.add(300);
        numbers.add(2);
        numbers.add(0);

        Integer max=0;
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i)>max){
                max=numbers.get(i);
            }

        }
        System.out.println(max);
        GenericUtils.StarSeparation();
        System.out.println(MaxNumber(numbers));

    }
    public static Integer MaxNumber(ArrayList<Integer> FindMaxNumber){//same concept would work for min number
        Integer max2=0;//OR YOU CAN COMPARE TO THE MIN NUMBER ALLOWED IN INTEGER WITH .MIN_VALUE SO YOU KNOW NOTHING
        //BY DEFAULT CAN BE SMALLER. we passed integer because we are returning a single number not whole arrayList
        for (int i = 0; i < FindMaxNumber.size(); i++) {//if youre going to use size()-1 then you need to add <= or else
            //its going to index count and not size count.. size starts from 1 index from 0!
            if (FindMaxNumber.get(i)>max2){
                max2=FindMaxNumber.get(i);
            }

            //FOR INTEGER WE CAN USE *.MAX_VALUE AND .MIN_VALUE* THIS COMES IN HANDY FOR EXAMPLE FOR MIN NUMBER WE CANT
            //START AT 0 WE WOULD NEED SOMETHING ELSE TO COMPARE IT TO. SO WHY NOT THE MAX NUMBER AVAILABLE FOR INTEGER
            //NOW YOU KNOW NOTHING IS GOING TO BE GREATER AND YOU DIDNT MISS A NUMBER

        }

        return max2;

    }
}
