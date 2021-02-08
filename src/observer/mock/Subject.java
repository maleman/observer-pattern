package observer.mock;

import java.util.ArrayList;
import java.util.List;

/**
 * Publicador
 * @author maleman
 *
 */
public class Subject {
    
    List<IObserver> observers = new ArrayList<>();
    
    public void attach(IObserver obs) {
	observers.add(obs);
    }
    
    public void detach(IObserver obs) {
	observers.removeIf(o -> o==obs);
    }
    
    public void notifyUpdate(String msg) {
	observers.forEach(o -> o.update(msg));
    }

}
