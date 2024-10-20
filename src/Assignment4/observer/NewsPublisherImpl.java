package Assignment4.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private final List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String newsCategory, String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(newsCategory, news);
        }
    }

    public void publishNews(String newsCategory, String news) {
        System.out.println("Publishing news in category: " + newsCategory);
        notifyObservers(newsCategory, news);
    }
}
