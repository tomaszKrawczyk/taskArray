import java.util.Scanner;

/**
 * Created by Tomek Krawczyk on 22.07.2017.
 */
public class Task4 {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int [] numbers=new int[n];


        for (int i=0; i<n;i++){
            numbers[i]=sc.nextInt();
        }

        int sum=0;


        for (int i=0;i<n;i++){

            sum=sum+numbers[i];

        }


            int average=sum/n;

        System.out.println("Sum of numbers in array is "+ sum);
        System.out.println("Average of numbers in array is "+average);






    }
}
