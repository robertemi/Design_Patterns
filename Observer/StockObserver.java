package Observer;

public class StockObserver implements Observer{
    private String name;

    public StockObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }

    public String getName(){
        return name;
    }
    
}