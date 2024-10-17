import java.util.Scanner;


 class BankingApp {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
      
        System.out.println("Enter number of test cases:");
        int testcase = sn.nextInt();
        
        for (int i = 0; i < testcase; i++) {
         
            System.out.println("Enter initial  balance:");
            double initial = sn.nextDouble();
            SavingsAccount account = new SavingsAccount(initial);

            while (sn.hasNext()) {
                String action = sn.next(); //action string
                if (action.equalsIgnoreCase("Deposit")) {
                    double amount = sn.nextDouble();
                    account.deposit(amount);
                    System.out.println("Current  Balance after Deposit: " + account.getBalance());
                } else if (action.equalsIgnoreCase("Withdraw")) {
                    double amount = sn.nextDouble();
                    account.withdraw(amount);
                    System.out.println("Current  Balance after Withdraw: " + account.getBalance());
                } else {
                    break;
                }
            }
        }
       
    }
}

abstract class BankAccount {
    protected double balance;//keep it safe

    public BankAccount(double initial) {
        this.balance = initial;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}


class SavingsAccount extends BankAccount {

    public SavingsAccount(double initial) {
        super(initial);
    }

 
    public void deposit(double amount) {
        balance += amount;
    }

  
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdraw limit exceeded");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}