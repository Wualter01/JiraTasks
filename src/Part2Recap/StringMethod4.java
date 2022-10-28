package Part2Recap;

public class StringMethod4 {
    public static void main(String[] args) {

        String sentence= "Hello world . Java is here lo";
                       // 012345678910
        char ch= sentence.charAt(3);
        System.out.println(ch);
        System.out.println(sentence.charAt(2));

        //indexOf()             returns the position of the FIRST FOUND occurrence       return type =   int
        //                       of specified character in a string

        System.out.println(sentence.indexOf("l"));//it will first check for matching character specified and then
        // it'll give you the index of the first l found in the string in this case 2
        System.out.println(sentence.indexOf("ll"));//still 2 because of where it starts
        System.out.println(sentence.indexOf("lo"));//will be 3 because it starts
        //even if i had two "lo" it'll look for the first matching lo and return it
        
        int index=sentence.indexOf(" lo");//this will give you index of space that you had at last, if you need
        //to have index of 1 +1

        System.out.println(index);//output 26
        System.out.println(index+1);//will get you index of l = 27

        //get last index of letter e
        //"e lo"
        //re + 1
        // e space
        System.out.println(sentence.indexOf("e lo"));
        System.out.println(sentence.indexOf("e "));
        System.out.println(sentence.indexOf("re")+1);

       // LastIndexOf()         returns the positions of the last found occurrence of            int
        //                          specified characters in a string.

        System.out.println(sentence.lastIndexOf("e"));
        System.out.println("*****************");
        String sentence2= "Hello world . Java is here llllllo";

        //to get index of last l
        System.out.println(sentence2.lastIndexOf("l"));

        //index of first l
        System.out.println(sentence2.indexOf("l"));
        int indexOfFirstL= sentence2.indexOf("l");
        int indexOfLastL= sentence2.lastIndexOf('l');
        int indexOfSecondL= sentence2.indexOf("lo");
        int indexBeforeLastL=sentence2.lastIndexOf('l')-1;
        System.out.println(indexOfLastL);
        System.out.println(indexBeforeLastL);
    }
}
