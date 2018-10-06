import java.util.Scanner;

public class AccountTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Account David = new Account(500.00);
        Account Samuel = new Account(7000.00);
        
        System.out.printf("David your account balance is %f.\n", David.getBalance());
        System.out.printf("Samuel your account balance is %f .\n", Samuel.getBalance());
        double depositamount;
        System.out.print("David,how much do you want to deposit into your accoutn?:");
        depositamount = input.nextDouble();
        David.credit(depositamount);
        System.out.println();
        
        System.out.printf("David ,your current account balance is %f. \n", David.getBalance());
        
        
        double withdrawalamount;
        System.out.print("David,how much do you want to withdraw from your accoutn?:");
        withdrawalamount = input.nextDouble();
        David.debit(withdrawalamount);
        System.out.println();
        
        System.out.printf("David ,your current account balance is %f. \n", David.getBalance());
        
        
        
    }
}
