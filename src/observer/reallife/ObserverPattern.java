package observer.reallife;

public class ObserverPattern {

    public static void main(String args[]) {

	Youtuber movies = new Youtuber("Dysney+ fans");

	Youtuber tSeries = new Youtuber("HBO fans");

	Subscriber vaibhav = new Subscriber("vaibhav");

	Subscriber gaurav = new Subscriber("Gaurav");

	Subscriber joy = new Subscriber("Joy");

	Subscriber vega = new Subscriber("Vega");

	movies.subscribe(vaibhav);

	movies.subscribe(joy);

	tSeries.subscribe(gaurav);

	tSeries.subscribe(vega);

	movies.videoName("Star Wars Spoilers");

	tSeries.videoName("Game of thrones new Episode");

	movies.subscribe(joy);

    }
}
