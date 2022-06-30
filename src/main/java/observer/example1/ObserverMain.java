package observer.example1;

public class ObserverMain {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer); //add subscriber
        observable.addObserver(observer);

        observable.setNews("news");


        System.out.println(observer.getNews());
        System.out.println(observable.getChannels().size());

    }
}
