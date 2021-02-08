package observer.reallife;

public class Subscriber implements Observer{

    private String subscriberName;

    public Subscriber(String subscriberName) {
	this.subscriberName = subscriberName;
    }

    public void update(String youtuberName, String videoName) {

	System.out.println(subscriberName + " you have to see an amazing video by " + youtuberName
		+ " whose video's name is " + videoName);
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
