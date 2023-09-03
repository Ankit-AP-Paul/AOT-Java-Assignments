class Account {
    String customerName;
    int accountNumber;
    double balance;

    Account(String customerName, int accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs. " + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void displayBalance() {
        System.out.println("Account Balance: Rs. " + balance);
    }

    void computeInterest() {
        System.out.println("Interest calculation is not available for this account type.");
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs. " + amount + " successful.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

class Curr_Acct extends Account {
    final double MINIMUM_BALANCE = 1000;
    final double SERVICE_CHARGE = 100;

    Curr_Acct(String customerName, int accountNumber) {
        super(customerName, accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal of Rs. " + amount + " successful.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void checkMinimumBalance() {
        if (balance < MINIMUM_BALANCE) {
            balance -= SERVICE_CHARGE;
            System.out.println("Minimum balance not maintained. Service charge of Rs. " + SERVICE_CHARGE + " imposed.");
        }
    }
}

class Savn_Acct extends Account {
    final double INTEREST_RATE = 0.05;

    public Savn_Acct(String customerName, int accountNumber) {
        super(customerName, accountNumber);
    }

    @Override
    public void computeInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest of Rs. " + interest + " added to the account.");
    }
}

class BankAccountSystem {
    public static void main(String[] args) {

        // Create a savings account and a current account
        Savn_Acct savingsAccount = new Savn_Acct("John", 101);
        Curr_Acct currentAccount = new Curr_Acct("Alice", 201);

        // Deposit and display balance for savings account
        savingsAccount.deposit(5000);
        savingsAccount.displayBalance();
        savingsAccount.computeInterest();
        savingsAccount.displayBalance();

        // Deposit and display balance for current account
        currentAccount.deposit(3000);
        currentAccount.displayBalance();

        // Withdraw from current account
        currentAccount.withdraw(2000);
        currentAccount.displayBalance();
        currentAccount.checkMinimumBalance(); // Check and impose service charge

        // Withdraw more than current balance from current account
        currentAccount.withdraw(3000);
        currentAccount.displayBalance();

    }
}
