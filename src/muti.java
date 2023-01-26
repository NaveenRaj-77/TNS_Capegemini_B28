import java.util.Scanner;

public class muti {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number");
          int num = read.nextInt();

        if (num%3 ==0){
            System.out.println("The Number is multiple of 3");

        }
        else{
            System.out.println("The number is multiple odf 3" );
        }
    }
}
