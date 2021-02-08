package observer.generic;

import java.util.HashMap;

public class SubjectHashMap extends AbstractObserver<HashMap<Integer,String>>{

    @Override
    public void notifyUpdate(HashMap<Integer, String> t) {
	// TODO Auto-generated method stub
	observers.forEach(o -> o.update(t));
    }

}
