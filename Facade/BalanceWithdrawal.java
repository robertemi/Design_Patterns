package Facade;
import Facade.BalanceChecker;

public class BalanceWithdrawal{
    private double amountToWithdraw;
    private BalanceChecker checker;

    public BalanceWithdrawal(double amount, BalanceChecker newChecker){
        this.amountToWithdraw = amount;
        this.checker = newChecker;
    }

    public double withdraw(){
        if (this.checker.checkAmount(amountToWithdraw)) {return amountToWithdraw;}
        else {System.out.println("Invalid"); return 0;}
    }
}