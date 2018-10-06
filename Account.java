public class Account{
    private double balance;
    public Account(double initialbalance) {
         
         if(initialbalance > balance ) {
             balance = initialbalance;
         }
    }
    public void credit(double creditamount){
        balance = balance + creditamount;
    }
    public void debit(double debitamount){
        if(debitamount > balance ){
            balance = balance;
          System.out.print("insufficient balance");
        } else 
        {
            balance = balance - debitamount;
        }
    }
    public double getBalance() {
        return balance;
    }
}
