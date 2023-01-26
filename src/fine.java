import java.util.Scanner;

public class fine {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the no days ");
        int days = read.nextInt();


        if (days <= 5) {
            System.out.println("The fine for first 5days is Rs :1");

        }else if (days >5 &&  days <10){
            System.out.println("Fine for next 5days is Rs: 5");

        }else if (days >=15){
            System.out.println("fine is Rs :10");
        }
        else {
            System.out.println("no fine if book returned in  time");
        }
    }
}
