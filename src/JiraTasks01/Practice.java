package JiraTasks01;

import java.util.Arrays;

public class Practice {//reverse a string practice.

    public static void main(String[] args) {
        String Sentence= "Stanley Yelnats";
        String container="";

        for (int i = Sentence.length()-1; i >=0 ; i--) {
            container+=Sentence.charAt(i);//remember that charAt will get you your character at given index
            //if you just say container+=i; i is the index number so you'll get 76543210 instead of the actual char

        }
        System.out.println(container);
        System.out.println("%%%%%%%%%%%%%%%%%%%%");
        /*TASK REVERSE A STRING TO READ: string = java is fun output= fun is java
        1st) we must put our sentence in a string 2nd) we must declare a string array and call it something related to
        what you're trying to do ex: splitSentence 3) split your sentence at the " " spaces so it becomes an array of
        words [java, is, fun] 4) make a new String to form a container so you have somewhere to store your words at
        variable i as you loop 5) create a for loop starting from sentence.length-1 so it begins at the last index
        and your iteration should be i-- and your condition should be to go from high to low or >=0
         */


        String sentence2 = "Java is fun";
        String [] SplitSentence = sentence2.split(" ");
        System.out.println(Arrays.toString(SplitSentence));

        String container2="";
        for (int i = SplitSentence.length-1; i>=0 ; i--) {
            container2+=SplitSentence[i]+" ";

        }
        System.out.println(container2);
    }
}
