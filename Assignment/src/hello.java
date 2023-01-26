import java.util.Arrays;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        int[] arr =new int[5];
        Scanner read =new Scanner(System.in);
        for (int i =0;i< arr.length;i++){
            System.out.println("Enter the numbers");
            arr[i] =read.nextInt();

        }
        for (int i =0; i< arr.length; i++){

            System.out.println(Arrays.toString(arr));
        }


    }
}
