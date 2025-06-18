package Proxy;

public class ATMProxy implements ATMState{
    private ATM atm;

    public ATMProxy(ATM atm){
        this.atm = atm;
    }

    @Override
    public String getState() {
        return atm.getState();
    }

    @Override
    public double getMoney() {
        return atm.getMoney();
    }

}