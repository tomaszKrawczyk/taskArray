import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tomek Krawczyk on 22.07.2017.
 */
public class Task5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] numbers=new int[n];

        System.out.println("Fill array of numbers");

        for (int i=0;i<n;i++){

            numbers[i]=sc.nextInt();

        }

       /* int min=numbers[0];
        int max=numbers[0];

        for (int i=1;i<n;i++){

            if (min>numbers[i]){
                min=numbers[i];
            }

            if (max<numbers[i]){
                max=numbers[i];
            }

        }*/

       // second way!!!!!

        Arrays.sort(numbers);

        System.out.println("Min = "+numbers[0]);
        System.out.println("Max = "+numbers[n-1]);

    }
}
