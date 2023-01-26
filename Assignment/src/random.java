import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the time ");
        int time = read.nextInt();


        if(time <=24){
            if (time <= 6 && time <18) {
                System.out.println(" turn off the lights" );
            } else if (time >=  18 && time <21) {
                System.out.println("Turn on the lights");
            }
        }   else {
                System.out.println("Sleeping Time");
            }
        }
    }



