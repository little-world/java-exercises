package io.littleworld.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Observer {

    public static void main(String[] args) {
       Publisher publisher = new Publisher();
       Subscriber subscriber = new NewsSubscriber();

       publisher.addObserver(subscriber);
       publisher.publish("hello, world");

    }
}

class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addObserver(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeObserver(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    void publish(String news) {
        for(Subscriber subscriber: subscribers)
            subscriber.update(news);
    }
}

interface Subscriber {
    void update(Object o);
}

class NewsSubscriber implements Subscriber {
    String news;
    @Override
    public void update(Object obj) {
        news = (String) obj;
        print();
    }

    void print() {
        System.out.println(news);
    }

}
