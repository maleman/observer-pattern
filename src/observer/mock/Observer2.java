package observer.mock;

public class Observer2 implements IObserver{

    @Override
    public void update(String msg) {
	// TODO Auto-generated method stub
	System.out.println("Observer2 :"+msg);
    }
}
