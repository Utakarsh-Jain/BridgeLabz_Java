
/*
Program 17: Mediator Design Pattern

Purpose:
Mediator Pattern centralizes communication between objects.
Here, users communicate through a ChatRoom instead of
directly managing communication with each other.
*/

// Mediator interface defines the communication method
interface ChatMediator {
    void sendMessage(String message, User sender);
}

// Colleague class represents a chat user
class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    // Send a message through the mediator
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    // Receive a message from another user
    public void receive(String message, String senderName) {
        System.out.println(
                name + " received from " + senderName + ": " + message
        );
    }

    public String getName() {
        return name;
    }
}

// Concrete mediator manages communication among users
class ChatRoom implements ChatMediator {
    private java.util.List<User> users = new java.util.ArrayList<>();

    // Register a user in the chat room
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        // Deliver the message to everyone except the sender
        for (User user : users) {
            if (user != sender) {
                user.receive(message, sender.getName());
            }
        }
    }
}

public class MediatorPattern {
    public static void main(String[] args) {
        // Create the central mediator
        ChatRoom chatRoom = new ChatRoom();

        // Create users connected to the same chat room
        User user1 = new User("Utkarsh", chatRoom);
        User user2 = new User("Rahul", chatRoom);
        User user3 = new User("Aman", chatRoom);

        // Register users with the mediator
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        // Send a message through the chat room
        user1.send("Hello everyone!");
    }
}
