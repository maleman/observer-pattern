package observer.mock;

public class Observer1 implements IObserver{

    @Override
    public void update(String msg) {
	// TODO Auto-generated method stub
	System.out.println("Observer1 :"+msg);
    }

}
