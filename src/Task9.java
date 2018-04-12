import java.util.Scanner;

/**
 * Created by Tomek Krawczyk on 22.07.2017.
 */
public class Task9 {

    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);

        System.out.println("Get number in arrays");

        int n=sc.nextInt();


        int [] numbers=new int[n];

        System.out.println("Do array");

        for (int i=0;i<n;i++){

            numbers[i]=sc.nextInt(100);

        }

        System.out.println("Get k");

        int k=sc.nextInt(100);

        int quantity=0;

        for (int i=0;i<n;i++){

            if (k==numbers[i]){
                quantity++;
            }


        }

        System.out.println("Number " + k + " shows " + quantity + " times");




    }
}
