package exercicio1;

public class Account{
    private String accountNumber;
    private double balance;

    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    } 
    void setAccountBalance(double accountBalance){
        this.balance = accountBalance;
    } 

    double getAccountBalance(){
        return this.balance;
    }

    String getAccountNumber(){
        return this.accountNumber;
    }
}
