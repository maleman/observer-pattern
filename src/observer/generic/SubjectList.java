package observer.generic;

import java.util.ArrayList;
import java.util.List;

public class SubjectList implements ISubject<List<String>> {

    List<IObserver> observers = new ArrayList<>();
    
    @Override
    public void attach(IObserver obs) {
	// TODO Auto-generated method stub
	observers.add(obs);
    }

    @Override
    public void detach(IObserver obs) {
	// TODO Auto-generated method stub
	observers.removeIf(o -> o==obs);
    }

    @Override
    public void notifyUpdate(List<String> t) {
	// TODO Auto-generated method stub
	observers.forEach(s -> s.update(t));
    }

}
