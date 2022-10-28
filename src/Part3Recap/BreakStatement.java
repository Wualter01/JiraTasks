package Part3Recap;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){
            System.out.println("java");

            if (i==4){
                System.out.println("java2");
                break;//loop will be stopped here anything after will not execute within loop

            }
            System.out.println("******************");

            //Break Statement- anytime java reaches break statement, java will cease to run. anything after break
            //won't be executed


        }
    }
}
