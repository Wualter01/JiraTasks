package JiraTasks01;

public class MinMaxArrayPractice {
    public static void main(String[] args) {
        int [] numbers={-200,1,5,500,300};
        int max = numbers[0];
        int min = numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            for (int j = 0; j < numbers.length ; j++) {
                if (numbers[i]<min){
                    min=numbers[i];

                }

            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
