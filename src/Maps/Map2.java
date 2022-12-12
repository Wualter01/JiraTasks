package Maps;

import java.util.LinkedHashMap;

public class Map2 {
    public static void main(String[] args) {
        //Task: create a map that will have student names and exam scores.
        //key : Student name : String we cannot have exam scores as keys because some student could have the same score
        //thus rendering our key not unique
        //value : exam score : integer
        //for this we can use collection data type but for this example we'll use linkedHashMap because it keeps
        //insertion order and accepts null also put and removes faster

        LinkedHashMap<String,Integer> studentScore= new LinkedHashMap<>();
        studentScore.put("WV",87);//A
        studentScore.put("JA",100);//A
        studentScore.put("KV",90);//A
        studentScore.put("AV",85);//A
        studentScore.put("GG",42);//C
        studentScore.put("KO",20);//D
        studentScore.put("EC",10);//F

        //Scores more than 85 will be A
        //Scores between 70-85 will be B
        //Scores between 40-70 will be C
        //Scores between 20-40 will be D
        //Scores between 0-20 will be F

        LinkedHashMap<String, Integer> scoreA = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> scoreC= new LinkedHashMap<>();

        System.out.println("scoreA = " + scoreA);
        System.out.println("scoreC = " + scoreC);

        //KeySet(): returns all the keys from the map as a set

        //this for loop will take my temporary container "eachStudent" and using .keySet i can get all keys from
        //studentScore linkedSet then i create int container where the int values of the keys will go
        //and that will = studentScore.get(key) since i have to pass key and eachStudent holds each value as it loops
        //we get them using .get. then i continue on to my if statement where i specify what grade goes into what
        //linkedHashMap like below using put method
        for (String eachStudent : studentScore.keySet()){
            int eachStudentScore = studentScore.get(eachStudent);

            if (eachStudentScore >=85){
                scoreA.put(eachStudent,eachStudentScore);
            }else if (eachStudentScore >=40 && eachStudentScore <70){
                scoreC.put(eachStudent,eachStudentScore);
            }
        }

        System.out.println("scoreA = " + scoreA);
        System.out.println("scoreC = " + scoreC);
    }
}
