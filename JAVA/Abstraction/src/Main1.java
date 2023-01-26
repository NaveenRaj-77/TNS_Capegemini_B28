import java.util.Scanner;

class USers extends Bank{
    int amt;
    int Acc_bal =20000;

    String name;
    String Acc_type;
    long Acc_no;
    Scanner read= new Scanner(System.in);

    //withdrawing the cash while larger than minimum
       void Withdraw() {
           if (Acc_bal> amt){

              int ans = Acc_bal-amt;
               System.out.println(ans);
               System.out.println("Withdraw Your Cash "+ amt);
               System.out.println("Balance is " + ans);
           }
       }

// Deposit the cash while insufficient
       void Deposit() {

           if (Acc_bal< amt){

               int ans= Acc_bal+amt;
               System.out.println(ans);

               System.out.println(" Cash deposited in your account successfully " + amt);
               System.out.println("Balance is " + ans);

           }




       }

       //Collecting the user Details
       void Userdetails() {

           System.out.println("Enter the Account type");
           Acc_type=read.nextLine();
           System.out.println("Enter the Name");
           name= read.nextLine();

           System.out.println("Enter the amt");
           amt= read.nextInt();

       }

}







