package JiraTasks01;

public class TaskDay1 {
    public static void main(String[] args) {
        String walt="vasquez";
        String Ogun="";
//we only have define what our INT = once then java knows what i is
        for (int i=walt.length()-1; i>=0; i--){
            Ogun=Ogun+walt.charAt(i);

        }
        System.out.println(Ogun);
    }
}


/*Looping in Java is defined as performing some lines of code in an ordered fashion until a condition is false.
The condition is important because we do not want the loop to be running forever. As soon as this condition is false, the loop stops.
while loop: A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
The while loop can be thought of as a repeating if statement.
Java do while loop executes the statement first and then checks for the condition.Other than that it is similar to the while loop.
The difference lies in the fact that if the condition is true at the starting of the loop the statements would still be executed,
however in case of while loop it would not be executed at all.
for loop: for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization,
condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.Looping in Java is defined as performing some lines of code in an ordered fashion until a condition is false.
The condition is important because we do not want the loop to be running forever. As soon as this condition is false, the loop stops.
while loop: A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
The while loop can be thought of as a repeating if statement.
Java do while loop executes the statement first and then checks for the condition.Other than that it is similar to the while loop.
The difference lies in the fact that if the condition is true at the starting of the loop the statements would still be executed,
however in case of while loop it would not be executed at all.
for loop: for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization,
condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.

 String str= "yobnugo";
    String reverse = "";

    for (int i =str.length()-1; i>=0; i--){

        reverse=reverse+str.charAt(i);
if you print this here you can see the steps as it loops, if you put this bracket then youll only see the reversed
string after its met its for loop condition
        System.out.println(reverse);
    }




}}
*/

