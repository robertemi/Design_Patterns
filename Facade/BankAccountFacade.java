package Facade;
import Facade.*;

public class BankAccountFacade{
    public void withdraw(){
        System.out.println("Provide neccessary credentials:");
        double amount = 22.3;
        String number = "qwej223";
        AccountChecker ac = new AccountChecker(number);
        BalanceChecker bc = new BalanceChecker(amount);
        BalanceWithdrawal bw = new BalanceWithdrawal(amount, bc);

        // further logic
    }
}