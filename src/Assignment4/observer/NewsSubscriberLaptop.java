package Assignment4.observer;

public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Science".equals(newsCategory)) {
            System.out.println("Laptop subscriber received science news: " + news);
        }
    }
}
