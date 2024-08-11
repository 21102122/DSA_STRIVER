package Abstract;

public class exp1 {
    //    Write a Java program to create an abstract class BankAccount with
//    abstract methods deposit() and withdraw().
//    Create subclasses: SavingsAccount and
//    CurrentAccount that extend the BankAccount class and implement the respective
//    methods to handle deposits and withdrawals for each account type.

    public static abstract class BankAccount{
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }
        protected void setBalance(double balance){
            this.balance = balance;
        }
        public abstract void deposit(double amount);
        public abstract void withdraw(double amount);
    }

    public static class  savingAccount extends BankAccount{
        public savingAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public void deposit(double amount) {
            setBalance(getBalance()+amount);
            System.out.println("Deposite of $"+ amount+" successful. current balance: $"+getBalance());

        }

        @Override
        public void withdraw(double amount) {
            if (getBalance()>=amount){
                setBalance(getBalance()-amount);
                System.out.println("Withdrawl of $"+amount+" successful. current balance is: $"+getBalance());

            }else System.out.println("insufficient funds. withrwal failed");

        }
    }
    public static class currentAccount extends BankAccount {
        public currentAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public void deposit(double amount) {
            setBalance(getBalance()+amount);
            System.out.println("Deposite of $"+ amount+" successful. current balance: $"+getBalance());

        }

        @Override
        public void withdraw(double amount) {
            if (getBalance()>=amount){
                setBalance(getBalance()-amount);
                System.out.println("Deposite of $"+ amount+" successful. current balance: $"+getBalance());

            }else{
                System.out.println("insufficient funds. withrwal failed");
            }

        }
    }



    public static void main(String[] args) {

        double ibal, damt,wamt;
        ibal = 10000.00;
        savingAccount savingAccount = new savingAccount("SA100",ibal);
        System.out.println("Saving a/c: Initial balance: $"+ibal);
        damt = 500;
        savingAccount.deposit(damt);
        wamt = 250;
        savingAccount.withdraw(wamt);
        wamt =1600.00;
        System.out.println("\nTry to withDraw: $"+wamt);
        savingAccount.withdraw(wamt);


        System.out.println();
        ibal = 5000.00;
        currentAccount currentAccount = new currentAccount("CA100",ibal);
        System.out.println("currentAccount a/c: Initial balance: $"+ibal);
        damt= 2500;
        currentAccount.deposit(damt);
        wamt= 1259;
        currentAccount.withdraw(wamt);
        System.out.println(savingAccount.getBalance());


    }


}
