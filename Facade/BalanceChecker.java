package Facade;

public class BalanceChecker{
    private double amountToWithdraw;

    public BalanceChecker(double amount){
        this.amountToWithdraw = amount;
    }

    public boolean checkAmount(double amount){
        //logic to check
        return true;
    }

}