package Observer;

import java.util.ArrayList;
import java.util.List;

public class StockMonitorApp implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        observers.add(o);    
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        observers.
            forEach(obs -> obs.update(message));
    }

    public void printObservers(){
        for (StockObserver o: observers){
            System.out.println(o.getName());
        }
    }

}