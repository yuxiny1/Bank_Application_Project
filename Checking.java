public class Checking extends Account{
    //list checking account 

    int debitCardNumber;
    int debitCardPIN;
    //double rate; not needed because it is already in the parent class
    
    public Checking(String name,String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber= "2" + accountNumber;
        setDebitCard();
      //  System.out.println("Account Number: " + this.accountNumber);
//        System.out.println("name is :" + name);
    }
    private void setDebitCard(){
        //local to this class 
        debitCardNumber= (int)(Math.random()*Math.pow(10,12));
        debitCardPIN = (int)(Math.random()*Math.pow(10,4));
        
    }
    //properties specific to checking account
    // contruscotr to initilalze checking account properties
    // list any methods specific to checking account
    public void showInfo(){
        //overriding the method from the parent class
        super.showInfo();
        System.out.println("Your checking account featrues" +
        "\nDebit Card Number: " + debitCardNumber +
        "\nDebit Card PIN: " + debitCardPIN);
    }

    @Override
    public void setRate() {
        // TODO Auto-generated method stub
        rate = getBaseRate() * .15;
    }
}