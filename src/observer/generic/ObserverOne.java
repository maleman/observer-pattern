package observer.generic;

public class ObserverOne implements IObserver{

    @Override
    public <T> void update(T t) {
	// TODO Auto-generated method stub
	System.out.println(t);
    }

}
