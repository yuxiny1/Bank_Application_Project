import java.io.File;
import java.util.LinkedList;
import java.util.List;
import utilities.CSV;

public class BankAccountApp {

  public static void main(String[] args) {
    List<Account> accounts = new LinkedList<Account>();

    // TODO Auto-generated method stub
    // Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
    // // read a csv file then create new accounts based on that data
    // Savings savacc1 = new Savings("Rich lowe", "987313232", 2500);

    // savacc1.showInfo();
    // System.out.println("************************");
    // chkacc1.showInfo();
    // savacc1.deposit(5000);
    // savacc1.withdraw(200);
    // savacc1.transfer("Brokerage", 3000);

    // savacc1.compound();

    // read a csv file then create new accounts based on that data
    String file = "csv_files/1a9ca4fa-8057-4c19-8ee8-3a4543547763.csv";
    // path to the file

    List<String[]> newAccountHolders = utilities.CSV.read(file);
    for (String[] accountHoler : newAccountHolders) {
      // System.out.println("NEW ACCOUNT");
      String name = accountHoler[0];
      String sSn = accountHoler[1];
      String accountType = accountHoler[2];
      double initDeposit = Double.parseDouble(accountHoler[3]);
      System.out.println(
        name + " " + sSn + " " + accountType + " $" + initDeposit
      );
      if (accountType.equals("Savings")) {
        accounts.add(new Savings(name, sSn, initDeposit));
        // System.out.println("OPEN A SAVING ACCOUNT");
      } else if (accountType.equals("Checking")) {
        // System.out.println("OPEN A CHECKING ACCOUNT");
        accounts.add(new Checking(name, sSn, initDeposit));
      } else {
        System.out.println("ERROR READING ACCOUNT TYPE");
      }
    }

    //test one element
    //accounts.get(0).showInfo();

    for (Account acc : accounts) {
      System.out.println("********");
      acc.showInfo();
    }
  }
}
