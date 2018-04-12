import java.util.Scanner;

/**
 * Created by Tomek Krawczyk on 22.07.2017.
 */
public class Task6 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        /*int n = sc.nextInt();

        int[] numbers = new int[n];

        int sum=0;


        for (int i = 0; i < n; i++) {

            numbers[i]=sc.nextInt();
            sum=sum+numbers[i];

        }

        int [] numbers2=new int[n];

        numbers2[0]=sum;

        for (int i = 1; i < n; i++) {

            numbers2[i]=numbers2[i-1]-numbers[i-1];
        }

        for (int i=0;i<n;i++){

            System.out.print(numbers2[i]+" ");
        }*/

        //second way!!!!!!!!!!


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int x = i; x < numbers.length; x++) {
                sum = sum + numbers[x];
            }
            result[i] = sum;

        }

        for (int operation : result) {
            System.out.println(operation);
        }


    }
}