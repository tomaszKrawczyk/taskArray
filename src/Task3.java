import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tomek Krawczyk on 22.07.2017.
 */
public class Task3 {

    public static void main(String[] args) {



       /*Scanner sc=new Scanner(System.in);

       System.out.println("Get number");

        int n=sc.nextInt();


        int[]array=new int[n];

        System.out.println("Fill array of number");

        for (int i=0; i<n;i++){
            array[i]=sc.nextInt();
        }

        Arrays.sort(array);


        int theMostRepeatNumber=array[0];
        int howManyRepeat=1;
        int theMostRepeat=1;

        for (int i=1;i<n;i++){
            if (array[i]==array[i-1]){
                howManyRepeat++;
            }else
                howManyRepeat=1;
            if (theMostRepeat<howManyRepeat){
                theMostRepeat=howManyRepeat;
                theMostRepeatNumber=array[i];
            }




        }

        System.out.println("The most repeat number is "+ theMostRepeatNumber+". This number repeat "+theMostRepeat+" times");
*/



// Second way !!!


        int [] array={1,45,234,11,1,1,2,5,92,2,5,10,5,5,10,100,5,15,121,5,10000,87,5,6,1,5,12,111,105,5,6,4,5,5,1,6,6,5,5,1010,12,5,10};


        int winnerInt=array[0];
        int lastCounter=0;

        for(int firstLoop:array){
            int counter=0;
            for (int secondLoop:array){
                if (firstLoop==secondLoop){
                    counter++;
                }

                if (lastCounter<counter){
                    lastCounter=counter;
                    winnerInt=secondLoop;
                }
            }
        }
        System.out.println("The most repeat number is "+winnerInt+ " .This number repeat "+lastCounter+ " times.");





    }
}
