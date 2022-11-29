public abstract class Account implements IBaseRate {
    // list common properties fo savings and checking accounts
    // constructor to set base properteis and initialize the account
    private String name;
    private String sSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    // unic because it is static
    private static int index = 10000;

    public Account(String name, String sSN, double initDeposit) {
        // super class
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit + 100;

        // System.out.println("Name: " + name + " SSN: " + sSN + " Balance: " +
        // balance);

        index++;
        this.accountNumber = setAccountNumber();
        System.out.println(getBaseRate());

        setRate(); // this is the abstract method, you have to call other wise the rate is 0
    }

    public abstract void setRate();
    // abstract has the general things general outline, but it leaves the
    // implementation to the subclases, with that, we can have an abstract method,
    // which in a similar way, we're not defining anything here.

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // list common methods - transaction
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Tranferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println(
                "Name: " + name +
                        "\nAccount Number:  " + accountNumber
                        + "\nBalance: " + balance
                        + "\nRate: " + rate + "%");
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + 
        accruedInterest);
    }
}