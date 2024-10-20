package Assignment4.observer;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Sport".equals(newsCategory)) {
            System.out.println("Smartphone subscriber received sports news: " + news);
        }
    }
}
