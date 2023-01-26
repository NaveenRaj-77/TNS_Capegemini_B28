import java.util.Scanner;

public class main5 {


    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter the row");
        rows = read.nextInt();


        System.out.println("Enter the colums");
        columns = read.nextInt();
        System.out.println("Enter the symbol");
        symbol = read.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j= 1; j<= columns; j++) {
                System.out.print(symbol);

            }

        }
    }

}


