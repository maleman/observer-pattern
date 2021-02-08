package observer.reallife;

import java.util.ArrayList;

public class Youtuber implements Subject {

    private String youtuberName;

    private ArrayList<Observer> subscribers; // List of subscribers

    public Youtuber(String youtuberName){

	this.youtuberName = youtuberName;

	subscribers = new ArrayList<Observer>();
    }

    @Override

    public void subscribe(Observer observer) {

	subscribers.add(observer);
    }

    @Override

    public void unsubscribe(Observer observer) {

	subscribers.remove(observer);
    }

    @Override

    public void notifyObservers(String videoName) {

	for (Observer subscriber : subscribers)

	    subscriber.update(youtuberName, videoName);

    }

    public void videoName(String videoName) {

	System.out.println(youtuberName + " has uploaded " + videoName + "video on his channel");

	notifyObservers(videoName);

    }
}
