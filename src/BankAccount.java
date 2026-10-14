public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double bankBalance;

    BankAccount(String accountHolder,String accountNumber, double bankBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.bankBalance = bankBalance;
    }
    void Deposit(double amount){
        if (amount<=0)
        {
            System.out.println("The deposit amount should be greater than zero.");
        }else{
            System.out.println("You have deposited:"+ amount);
            System.out.println("Your balance is now:"+(amount + bankBalance));
        }


    }
    void Withdraw(double withdrawnAmount){

        if (withdrawnAmount>bankBalance)
        {
            System.out.println("Insufficient funds");
            System.out.println();
        }else {
            System.out.println("You have withdrawn:"+ withdrawnAmount);
            System.out.println("Your balance is now:"+ (bankBalance - withdrawnAmount));
            System.out.println();
        }

    }
    void getBalance(){
        System.out.println("Balance:" + this.bankBalance);
        System.out.println();
    }
}
