package Part3Recap;

public class StringMethodPractice {
    public static void main(String[] args) {
        String sentence ="Hello java is planet, java is fun and java is best language";
        //task split from second java
        String sentence2=sentence.substring(22);//only when doing start and finish will it not include the # you finish
        //at ex:0-3 whatever is at 3 will not be included so you must do 0-4
        System.out.println(sentence2);
        System.out.println(sentence.indexOf(", j")+2);//to find index of our unique second java 'j'
        //sout.indexOf"java is f" would work as well or ", j"+2
        System.out.println(sentence.indexOf(", j")+2);
        System.out.println(sentence.charAt(22));
        //another way to do it is
        int indexOFJ=sentence.indexOf(", ")+2;
        System.out.println(indexOFJ);
        String SplitSentence=sentence.substring(indexOFJ);
        System.out.println(SplitSentence);

        System.out.println(sentence.length());
//task get the last index number of sentence
        System.out.println(sentence.length()-1);//this works because index starts from 0 and length starts from 1
        //so automatically it will put you at the last index number id you use this method
        System.out.println(sentence.lastIndexOf('e'));

    }
}
