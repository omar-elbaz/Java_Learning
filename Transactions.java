//********************************************************************
//  Transactions.java       Author: Lewis/Loftus
//
//  Demonstrates the creation and use of multiple Account objects.
//********************************************************************
import java.util.Scanner;


public class Transactions
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      String name = "";
      Integer account = 0;
      double initial = 0;

      Scanner Scan = new Scanner(System.in);

      System.out.println("Enter acc1 Name: ");
      name = Scan.nextLine();
      System.out.println("Enter acc1 Number: ");
      account = Scan.nextInt();
      System.out.println("Enter acc1 Balance: ");
      initial = Scan.nextDouble();
      Account acct1 = new Account(name, account, initial);

      System.out.println("Enter acc2 Name: ");
      name = Scan.next();
      System.out.println("Enter acc2 Number: ");
      account = Scan.nextInt();
      System.out.println("Enter acc2 Balance: ");
      initial = Scan.nextDouble();
      Account acct2 = new Account(name, account, initial);


      System.out.println("Enter acc3 Name: ");
      name = Scan.next();
      System.out.println("Enter acc3 Number: ");
      account = Scan.nextInt();
      System.out.println("Enter acc3 Balance: ");
      initial = Scan.nextDouble();
      Account acct3 = new Account(name, account, initial);

      acct1.deposit(25.85);
      System.out.println(acct1.name + " balance after deposit: " + acct1.balance);

      acct2.deposit(500.00);
      System.out.println(acct2.name + " balance after deposit: " +
                          acct2.balance);
      System.out.println(acct2.name + " balance after withdrawal: " + 
                          acct2.withdraw (430.75, 1.50));

      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();

      System.out.println();
      System.out.println(acct1);
      System.out.println(acct2);
      System.out.println(acct3);
   }
}
