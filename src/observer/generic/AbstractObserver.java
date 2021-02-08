package observer.generic;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObserver<T> {
    
    protected List<IObserver> observers = new ArrayList<>();
    
    public void attach(IObserver obs) {
	// TODO Auto-generated method stub
	observers.add(obs);
    }

    public void detach(IObserver obs) {
	// TODO Auto-generated method stub
	observers.removeIf(o -> o==obs);
    }

     public abstract void notifyUpdate(T t);
    
} 
