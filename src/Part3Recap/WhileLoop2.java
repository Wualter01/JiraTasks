package Part3Recap;

public class WhileLoop2 {
    public static void main(String[] args) {
        //print *************

        int i=1;//starting point

        while(i<=20){//ending point 20
            System.out.print("*");//using print so we dont break the line
            i++;//iteration +1
        }

        //print the figure below
        /*

        ****
        *  *
        *  *
        *  *
        *  *
        *  *
        *  *
        ****

         */
        int i1=1;
        System.out.println();
        System.out.println("****");
        while(i1<=6){
            System.out.println("*  *");
            i1++;//if i dont tell it to increase i by one each time it'll never reach 8 and loop will be infinite

        }
        System.out.println("****");
    }
}
