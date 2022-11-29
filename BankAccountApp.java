public class BankAccountApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
        // read a csv file then create new accounts based on that data
        Savings savacc1 = new Savings("Rich lowe", "987313232", 2500);
        
        savacc1.showInfo(); 
        System.out.println("************************");
        chkacc1.showInfo();    

        
        savacc1.deposit(5000);
        savacc1.withdraw(200);
        savacc1.transfer("Brokerage", 3000);
        
        savacc1.compound();
    }

}
