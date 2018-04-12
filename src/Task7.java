/**
 * Created by Tomek Krawczyk on 15.09.2017.
 */
public class Task7 {


    public static void main(String[] args) {


        int[] array = {1, 1, 2, 2, 3, 3, 3, 5};

        boolean isTrue = false;


        for (int firstLoop : array) {
            int counter = 0;
            for (int secondLoop : array) {
                if (firstLoop == secondLoop) {
                    counter++;
                }

                if (counter >= 3) {

                    isTrue = true;
                    break;
                }

            }
        }
        if (isTrue) {
            System.out.println("Yes, some number repeat 3 times");
        } else
            System.out.println("No, any number don't repeat 3 times");
    }
}