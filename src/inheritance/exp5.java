package inheritance;

public class exp5 {
//    Write a Java program to create a class known as "BankAccount"
//    with methods called deposit() and withdraw(). Create a subclass
//    called SavingsAccount that overrides the withdraw() method to prevent
//    withdrawals if the account balance falls below one hundred.

    public  static class  BankAccount{
        private String AccountNumber;
        private double Balance;

        public BankAccount(String accountNumber, double balance) {
            AccountNumber = accountNumber;
            Balance = balance;
        }

        public void deposit(double amount){
            Balance+=amount;

        }
        public void withdraw(double amount){
            if (Balance>=amount){
                Balance-=amount;
            }else System.out.println("insufficient balance");

        }

        public double getBalance() {
            return Balance;
        }
    }
    public static class SavingAccount extends BankAccount{

        public SavingAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public void withdraw(double amount) {
            if (getBalance()-amount<100){
                System.out.println("minimum balance of $100 required");
            }else

                super.withdraw(amount);
        }
    }
    public static void main(String[] args) {

        System.out.println("Create a banck Account object (Ac no.bBA1234) with intial balance of $500");
        BankAccount BA1234 = new BankAccount("BA1234",500);

//        deposit 1000 int  account
        System.out.println("Deposit 1000  into account");
        BA1234.deposit(1000);
        System.out.println("new balance after depoist is: "+BA1234.getBalance());


//        withdrow 600
        System.out.println("withdraw 600 from account");
        BA1234.withdraw(600);
        System.out.println("new balance after withdraw is: "+BA1234.getBalance());

//        create a saving account
        System.out.println("createing new saving account");
        SavingAccount SA1234 = new SavingAccount("SA1234",450);


//        withdraw 300
        SA1234.withdraw(300);
        System.out.println("blance after withdraw 300 from saving account: "+SA1234.getBalance());

    }
}
