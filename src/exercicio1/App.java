package exercicio1;

public class App {
    
    static public void main(String args[]){
        Bank bancoFuturoDev = new Bank();

        Account conta1 = new Account();
        conta1.setAccountBalance(50);
        conta1.setAccountNumber("X04vnI:");
        Account conta2 = new Account();
        conta2.setAccountBalance(100.40123);
        conta2.setAccountNumber("Oi$cips:");

        bancoFuturoDev.accounts.add(conta1);
        bancoFuturoDev.accounts.add(conta2);

        
        for(int i =0;i<bancoFuturoDev.accounts.size();++i){
        System.out.println(bancoFuturoDev.accounts.get(i).getAccountBalance());
        }

    } 
}
