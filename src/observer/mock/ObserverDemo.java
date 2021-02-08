package observer.mock;

public class ObserverDemo {
    
    public static void main(String...strings ) throws InterruptedException {
	   Subject subject = new Subject();
	    
	    IObserver observer1 = new Observer1();
	    IObserver observer2 = new Observer2();
	    
	    subject.attach(observer1);
	    subject.attach(observer2);
	    
	    subject.notifyUpdate("Actualizando...");
	    
	    Thread.sleep(1000);
	    
	    subject.detach(observer2);
	    
	    subject.notifyUpdate("Otra Actualizacion...");
    }
    
    

}
