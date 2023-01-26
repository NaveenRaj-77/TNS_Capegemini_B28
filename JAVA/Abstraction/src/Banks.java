import java.util.Scanner;

//Selecting the bank of your Accounts
public class Banks{
String  str1="SBI";
    String  str2="HDFC";
    String  str3="CANARA";
   public void bank() {
        System.out.println("Welcome");
       Scanner read =new Scanner(System.in);
        String name;
        System.out.println("Enter the bank Name");
        name =read.nextLine();
       if (name.equals(str1)){

           System.out.println("You are using SBI BANK ACC");
        }
       else if (name.equals(str2)) {
           System.out.println("You are using HDFC BANK ACC");
        }

        else if (name.equals(str3)) {
            System.out.println("You are using Canara BANK ACC");
        }


    }
}
