package Assignment4.observer;

public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        System.out.println("Tablet subscriber received news: " + news);
    }
}
