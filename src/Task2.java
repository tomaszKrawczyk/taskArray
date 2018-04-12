import java.util.Scanner;

/**
 * Created by Tomek Krawczyk on 22.07.2017.
 */
public class Task2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Get number of elements");
        int n=sc.nextInt();

        int [] numbers=new int[n];

        System.out.println("Get numbers to arrays");

        for (int i=0;i<=numbers.length-1;i++){

            numbers[i]=sc.nextInt();
        }

        int min=numbers[0];

        for (int i=0;i<=numbers.length-1;i++){

            if (numbers[i]<min){

                min=numbers[i];
            }
        }

        System.out.println("Min=" + min);


    }




}
