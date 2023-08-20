class Bank {
    String name;
    long accountNo;
    String accountType;
    double balance;
    Bank( String name, long accountNo, String accountType, double balance) {
        this.name=name;
        this.accountNo=accountNo;
        this.accountType=accountType;
        this.balance=balance;
    }
    void deposit(double amount) {
        balance+=amount;
    }
    void withdraw(double amount) {
        if(balance<amount) {
            System.out.println("Low Balance");
        } else {
            balance-=amount;
            System.out.println("Balance Left = "+balance);
        }
    }
    void display() {
        System.out.println("Name = "+name);
        System.out.println("Balance = "+balance);
    }
}