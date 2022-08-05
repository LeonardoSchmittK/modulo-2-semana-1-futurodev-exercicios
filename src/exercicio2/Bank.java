package exercicio2;

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
}
