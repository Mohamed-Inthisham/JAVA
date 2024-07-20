package Variable;

public class BankAccount {
    public static int totalAccounts;
    double balance;

    public static void initialize(){
        totalAccounts++;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public void deposit(double amount){
       balance += amount;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else
            System.out.println("insufficient amount");

    }
    public double getBalance(){
        return balance;
    }
    public BankAccount(double initialBalance){
        balance = initialBalance;
        initialize();
    }

    public static void main(String[]args){
        BankAccount bankAccount1= new BankAccount(20000);
        bankAccount1.deposit(5000);
        bankAccount1.withdraw(3000);

        System.out.println(bankAccount1.getBalance());
        System.out.println(BankAccount.getTotalAccounts());

    }

}
