package observer.generic;

public interface ISubject<T> {
    
    void attach(IObserver obs);
    void detach(IObserver obs);
    void notifyUpdate(T t);

}
