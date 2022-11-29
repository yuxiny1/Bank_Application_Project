public class Savings extends Account {
    // list properties sppecific to the saving account
    int safetyDepositeBoxID;
    int safetyDepositeBoxKey;
    //double rate; not needed because it is already in the parent class

    // constructors to initlaize setting for the savigns properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositeBox();
    }

    private void setSafetyDepositeBox() {
        safetyDepositeBoxID = (int) (Math.random() * Math.pow(10, 3));
        System.out.println("safetyDepositeBoxID: " + safetyDepositeBoxID);

        safetyDepositeBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        // overriding the method from the parent class
        System.out.println("Account Type: Savings");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\n Safety Deposit Box ID: " + safetyDepositeBoxID +
                        "\n Safety Deposit Box Key: " + safetyDepositeBoxKey);
    }
    @Override
    public void setRate(){
        rate=getBaseRate()*0.25;
    }
}