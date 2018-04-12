import java.util.Scanner;

/**
 * Created by Tomek Krawczyk on 22.07.2017.
 */
public class Task1 {





    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Get n number elemnts of array");
        int n=sc.nextInt();

        int [] numbers= new int [n]; // create array




        for (int i=0;i<=numbers.length-1;i++){

            numbers[i]=sc.nextInt();





        }

        for (int  i=numbers.length-1;i>=0;i--){

            System.out.println(numbers[i]);
        }



    }
}
