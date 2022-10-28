package Part2Recap;

public class SwitchPractice {
    /*
     3 cases using a, b, c
     if the case is a, result should be hello a
     if the case is b, result should be hello b
     if the case is c, result should be hello c
     if letter is something other than options given print hello invalid
     */
    public static void main(String[] args) {
        char char1='C';
        String result; //we can also define it here so we dont have to reassign it every time after case ex:
        //String result="hello"

        switch(char1){
            case 'a' : result= "hello a";// also possible to do result +="a"; if string is defined
            break;
            case 'b' : result="hello b";
            break;
            case 'c' : result="hello c";
            break;
            default: result="hello invalid";
        }
        System.out.println(result);
        //when using switch first it will check for matching case and then it will execute all the lines after matching
        //if no "break;" is present if there is break it will execute same line then and break the rest of code
    }
}
