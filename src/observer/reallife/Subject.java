package observer.reallife;

public interface Subject {
    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers(String message);
}
