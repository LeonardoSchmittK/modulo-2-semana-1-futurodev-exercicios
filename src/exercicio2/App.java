package exercicio2;

public class App {

  public static void main(String args[]) {
    Bank bank = new Bank();

    Account conta1 = new Account();
    conta1.accountNumber = "Eskx$";
    conta1.balance = 10;

    Account conta2 = new Account();
    conta2.accountNumber = "leoD)x";
    conta2.balance = 20;

    bank.accounts.add(conta1);
    bank.accounts.add(conta2);

    bank.transferValue("Eskxee$", "leoD)x", 50);

    bank.accounts.forEach(item -> System.out.println(item.balance));
  }
}
