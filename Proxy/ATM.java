package Proxy;

public class ATM implements ATMState{
    private String state;
    private double money;
    private String credentials;
    
    @Override
    public String getState() {
        return this.state;
    }
    @Override
    public double getMoney() {
        return this.money;
    }

    public String getCredentials(){
        return this.credentials;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setMoney(double money){
        this.money = money;
    }
    
}