package MethodsBeginning;

public class UniqueLetterFromArray {
    public static void main(String[] args) {
        /*Write a program that can print unique values from a string array
        Ex: if arr{"A","A","B","C","C"} unique is b

        if arr= {A,B,B,C} unique=B,C

        how do you know if a value is unique? - because it only happens once
        how to solve (logic) we can say if the count of each character is 1 it is unique
        we should only print string that has the count of one
        so we need to check the letter count, you will need to compare with all letters and when the count is more than
        1 you increase count++. for-each loop is ideal in this situation because we'll be looking at all the values
        in our array.
         */

        String [] letters= {"A","A","B","C","C","D","D","G"};

        for (String eachLetter : letters){//we establish our container variable and then we need to identify where
            //we'll be getting our data values from "letters"
            int count=0;//our count will go in each of our if statement to set our condition if it is ==1 sout
            //"is unique/ WHY DID WE INCLUDE INT COUNT= 0 INSIDE OF FOR LOOP? ANSWER: SO COUNT IS UNIQUE TO THE
            //INDIVIDUAL VALUES. IF IT WERE OUTSIDE IT WOULD INCREASE FOR EVERY VALUE AND INSTEAD WE WOULD HAVE A TOTAL
            //FOR ALL VALUES.EACH TIME IT LOOPS I RESETS TO UNIQUE VALUE EX: A RESET, B RESET,C RESET
            for(String eachLetter2 : letters){//this for each loop will check the first value and compare it to the
                //rest of the array values and if it equals (same as)  whats at the first eachLetter increase count by 1
                //this loop will go through all of my data til the end of my array. in parent loop it is going through
                //each value. in child loop it is comparing each value to the rest of the values. parent if statement
                //is checking to see if there is duplicates using .equals method. Child if is checking to see if the
                //count is 1, making it unique
                if (eachLetter2.equals(eachLetter)){//if i have more than one unique number it will match my condition
                    //to print so ill have two lines printed with unique values
                    count++;
                }

            }
            if (count==1){
                System.out.println(eachLetter+ " is unique"); //now im saying and if count is equal to 1 the value
                //at "eachLetter" is unique
            }

        }
        System.out.println("*************************");
        String [] arrYouReadyKids={"A","C","B","C"};
        uniqueFromArray(arrYouReadyKids);

    }
    public static void uniqueFromArray(String [] exampleLetters){
        for (String eachLetter : exampleLetters){//since we are making this generic meaning we want to use this to pass
            //other string arrays we pass exampleLetters which user will fill with his array we dont need our previous
            //variable "letters" 1 specific array now we may use it for multiple.
            int count=0;
            for(String eachLetter2 : exampleLetters){
                if (eachLetter2.equals(eachLetter)){//if i have more than one unique number it will match my condition

                    count++;
                }

            }
            if (count==1){
                System.out.println(eachLetter+ " is unique");
            }

        }

    }
    public static void uniqueFromArray2(String [] letters1){//unique from array using for-loop
        //String [] letters = {"A","A","B" "C","D","D"}
        for (int i=0; i<letters1.length; i++){//this starts at 0 and however long the array is lets say 7 length which
            //means index which is what i is traveling at will be 6 and less than works because loop will stop at 6
            //this will sart with A
            int countChocula=0;
            for (int i1=0; i1<letters1.length; i1++){//this will take our first "A" value and loop it and compare it to
                //the rest of the values in array ex: A,A,B, C,D,D
                if (letters1[i1].equals(i)){
                    countChocula++;
                }

        }
            if (countChocula==1){
                System.out.println(letters1[i]+ " is unique");
            }
        }
    }
}
