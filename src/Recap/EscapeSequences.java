package Recap;

public class EscapeSequences {
    /*
    \t: paragraph space
    \n: new line
    \": prints double quote " on console
    \\:prints \ on console
    \' prints single quote
    \:pints single quote
     */

    public static void main(String[] args) {
        //\t: paragraph space : makes a paragraph indent, you can use it multiple times
        System.out.println("\tRenasTech");

        //\n: new line
        System.out.println("hello world");
        System.out.println("hello \nworld"); //you could also use indent as well combined ex: hello \nworld\t
        //now your word "world" will print in a new line followed by an indent

        //prints \ on console
        System.out.println("\\");//prints one back slash for two youll need to do it 4 times "\\\\"

        // \\: prints double quote " on the console so that you can see them
        System.out.println("Today is \"Tuesday\" ");

        //prints single quote
        System.out.println("Today is \'Friday\'"); //you can do this regular way since single quotes dont serve a
        //purpose
    }
}
