package Assignment4.observer;

public interface NewsPublisher {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String newsCategory, String news);
    void publishNews(String newsCategory, String news); // Add this line
}
