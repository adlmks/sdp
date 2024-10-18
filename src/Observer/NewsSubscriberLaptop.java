package BehavioralPatterns2.Observer;

public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Science")) {
            System.out.println("Laptop: " + news);
        }
    }
}
