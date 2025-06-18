package Proxy;

public class Client{
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.setMoney(1000.0);
        atm.setState("Valid");

        ATMProxy proxy = new ATMProxy(atm);
        System.out.println(proxy.getMoney());
        System.out.println(proxy.getState());
    }
}