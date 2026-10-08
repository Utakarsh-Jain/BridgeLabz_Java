/*

Social Media Friend Connections
Problem Statement: Create a system to manage social media friend connections using a singly linked list. Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
Add a friend connection between two users.
Remove a friend connection.
Find mutual friends between two users.
Display all friends of a specific user.
Search for a user by Name or User ID.
Count the number of friends for each user.
Hint:
Use a singly linked list where each node contains a list of friends (which can be another linked list or array of Friend IDs).
For mutual friends, traverse both lists and compare the Friend IDs.
The List of Friend IDs for each user can be implemented as a nested linked list or array.

Name : Utakarsh Jain
Date : 6/10/2026

*/
package main.java.LinkedList;
public class SocialMedia {

    // FriendNode stores the ID of one friend
    static class FriendNode {
        int friendId;
        FriendNode next;

        FriendNode(int friendId) {
            this.friendId = friendId;
        }
    }

    // UserNode stores user details and their friend list
    static class UserNode {
        int userId;
        String name;
        int age;

        // Each user has a separate linked list of friends
        FriendNode friends;

        // Points to the next user
        UserNode next;

        UserNode(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
        }
    }

    // Head points to the first user in the social media list
    UserNode head;

    // Add a new user at the end of the user list
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);

        // If there are no users, new user becomes head
        if (head == null) {
            head = newUser;
            return;
        }

        UserNode current = head;

        // Traverse to the last user
        while (current.next != null) {
            current = current.next;
        }

        current.next = newUser;
    }

    // Search and return a user using User ID
    UserNode findUser(int id) {
        UserNode current = head;

        while (current != null) {
            if (current.userId == id) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    // Create a two-way friendship between two users
    void addFriend(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        // Both users must exist before creating friendship
        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        // Add each user to the other's friend list
        addFriendToList(user1, userId2);
        addFriendToList(user2, userId1);

        System.out.println("Friend connection added");
    }

    // Add a friend ID to a user's friend linked list
    void addFriendToList(UserNode user, int friendId) {

        // Avoid duplicate friendship
        if (isFriend(user, friendId)) {
            return;
        }

        FriendNode newFriend = new FriendNode(friendId);

        // If friend list is empty, new friend becomes first friend
        if (user.friends == null) {
            user.friends = newFriend;
            return;
        }

        FriendNode current = user.friends;

        // Traverse to the end of the friend list
        while (current.next != null) {
            current = current.next;
        }

        current.next = newFriend;
    }

    // Check whether a user already has a particular friend
    boolean isFriend(UserNode user, int friendId) {
        FriendNode current = user.friends;

        while (current != null) {
            if (current.friendId == friendId) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Remove friendship between two users
    void removeFriend(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            return;
        }

        // Remove each user from the other's friend list
        removeFriendFromList(user1, userId2);
        removeFriendFromList(user2, userId1);

        System.out.println("Friend connection removed");
    }

    // Remove a friend ID from a user's friend linked list
    void removeFriendFromList(UserNode user, int friendId) {

        // No friends to remove
        if (user.friends == null) {
            return;
        }

        // If the first friend is the one to remove
        if (user.friends.friendId == friendId) {
            user.friends = user.friends.next;
            return;
        }

        FriendNode current = user.friends;

        // Find the node before the friend to be removed
        while (current.next != null) {
            if (current.next.friendId == friendId) {

                // Skip the friend node
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    // Display all friends of a particular user
    void displayFriends(int userId) {
        UserNode user = findUser(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");

        FriendNode current = user.friends;

        // Traverse the user's friend list
        while (current != null) {
            UserNode friend = findUser(current.friendId);

            if (friend != null) {
                System.out.println(
                        friend.userId + " - " + friend.name
                );
            }

            current = current.next;
        }
    }

    // Find friends common to both users
    void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        FriendNode current = user1.friends;

        System.out.println("Mutual Friends:");

        // Check every friend of user1
        // and see whether user2 also has that friend
        while (current != null) {
            if (isFriend(user2, current.friendId)) {
                UserNode mutual = findUser(current.friendId);

                if (mutual != null) {
                    System.out.println(mutual.name);
                }
            }

            current = current.next;
        }
    }

    // Search user by User ID
    void searchUserById(int id) {
        UserNode user = findUser(id);

        if (user != null) {
            displayUser(user);
        } else {
            System.out.println("User not found");
        }
    }

    // Search users by name
    void searchUserByName(String name) {
        UserNode current = head;

        while (current != null) {
            // Ignore uppercase/lowercase differences
            if (current.name.equalsIgnoreCase(name)) {
                displayUser(current);
            }

            current = current.next;
        }
    }

    // Display details of a user
    void displayUser(UserNode user) {
        System.out.println(
                "User ID: " + user.userId +
                ", Name: " + user.name +
                ", Age: " + user.age
        );
    }

    // Count the total number of friends of a user
    void countFriends(int userId) {
        UserNode user = findUser(userId);

        if (user == null) {
            return;
        }

        int count = 0;
        FriendNode current = user.friends;

        // Traverse the friend list and count each node
        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.println(
                user.name + " has " + count + " friends."
        );
    }

    public static void main(String[] args) {

        // Create SocialMedia object
        SocialMedia socialMedia = new SocialMedia();

        // Add users
        socialMedia.addUser(1, "Rahul", 20);
        socialMedia.addUser(2, "Aman", 21);
        socialMedia.addUser(3, "Riya", 20);
        socialMedia.addUser(4, "Neha", 22);

        // Create friend connections
        socialMedia.addFriend(1, 2);
        socialMedia.addFriend(1, 3);
        socialMedia.addFriend(2, 3);
        socialMedia.addFriend(2, 4);

        // Display friends of Rahul
        System.out.println();
        socialMedia.displayFriends(1);

        // Find common friends between Rahul and Aman
        System.out.println();
        socialMedia.findMutualFriends(1, 2);

        // Count Aman’s friends
        System.out.println();
        socialMedia.countFriends(2);

        // Search user by name
        System.out.println();
        socialMedia.searchUserByName("Riya");

        // Remove friendship between Rahul and Riya
        System.out.println();
        socialMedia.removeFriend(1, 3);

        // Display Rahul's updated friend list
        socialMedia.displayFriends(1);
    }
}

