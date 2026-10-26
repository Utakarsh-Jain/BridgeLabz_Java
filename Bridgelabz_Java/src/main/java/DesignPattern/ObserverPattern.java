
/*
Program 19: Observer Design Pattern

Purpose:
Observer Pattern notifies multiple objects when the state
of another object changes.
Here, subscribers receive notifications when a channel uploads a video.
*/

import java.util.ArrayList;
import java.util.List;

// Observer interface defines the notification method
interface Observer {
    void update(String video);
}

// Subject interface manages observers and sends notifications
interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String video);
}

// Concrete subject represents a video channel
class YouTubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        // Register a new subscriber
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // Remove a subscriber
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String video) {
        // Notify every registered subscriber
        for (Observer observer : subscribers) {
            observer.update(video);
        }
    }

    public void uploadVideo(String video) {
        System.out.println("New video uploaded: " + video);

        // Inform all subscribers about the new video
        notifyObservers(video);
    }
}

// Concrete observer represents a channel subscriber
class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String video) {
        System.out.println(name + " received notification: " + video);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        // Create a channel and its subscribers
        YouTubeChannel channel = new YouTubeChannel();

        Observer subscriber1 = new Subscriber("Utkarsh");
        Observer subscriber2 = new Subscriber("Rahul");

        // Register both subscribers with the channel
        channel.addObserver(subscriber1);
        channel.addObserver(subscriber2);

        // Upload a video and notify the subscribers
        channel.uploadVideo("Java Design Patterns");
    }
}
