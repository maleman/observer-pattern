package observer.javaapi;

import java.util.Observable;
import java.util.Observer;

public class SecondNewsReader implements Observer {

    @Override
    public void update(Observable o, Object arg) {
	// TODO Auto-generated method stub
	System.out.println("SecondNewsReader : "+(String) arg);
    }
    

}
