package Facade;

public class AccountChecker{
    private String accountNumber;

    public AccountChecker(String number){
        this.accountNumber = number;
    }
    
    public boolean checkNumber(String number){
        //logic to check
        return true;
    }
}