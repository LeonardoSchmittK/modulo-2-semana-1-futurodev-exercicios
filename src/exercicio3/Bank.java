package exercicio3;

import java.util.ArrayList;

public class Bank {

  ArrayList<Account> accounts = new ArrayList<Account>();

  void transferValue(
    String originAccountName,
    String destinyAccountname,
    double amount
  ) {
    Boolean doesOriginAccountExists = false;
    Boolean doesDestinyAccountExists = false;
    int destinyAccountId = 0;
    int originAccountId = 0;
    for (int id = 0; id < accounts.size(); ++id) {
      if (accounts.get(id).accountNumber.equals(originAccountName)) {
        doesOriginAccountExists = true;
        originAccountId = id;
      }

      if (accounts.get(id).accountNumber.equals(destinyAccountname)) {
        doesDestinyAccountExists = true;
        originAccountId = id;
      }
    }

    if (doesDestinyAccountExists && doesOriginAccountExists) {
      accounts.get(destinyAccountId).balance =
        accounts.get(destinyAccountId).balance - amount;
      accounts.get(originAccountId).balance =
        accounts.get(originAccountId).balance + amount;
    } else System.out.println("Error: account not found");
  }

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
