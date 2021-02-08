package observer.generic;

public interface IObserver {
    <T> void update(T t);
}
