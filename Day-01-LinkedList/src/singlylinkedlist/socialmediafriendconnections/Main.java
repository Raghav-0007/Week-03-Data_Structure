package singlylinkedlist.socialmediafriendconnections;

public class Main {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        // Adding users
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 30);
        network.addUser(3, "Charlie", 28);
        network.addUser(4, "David", 22);

        // Adding friend connections
        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 4);
        network.addFriendConnection(3, 4);

        // Display all users and their friends
        System.out.println("\nAll Users and Friends:");
        network.displayAllUsers();

        // Find mutual friends
        System.out.println("\nFinding Mutual Friends:");
        network.findMutualFriends(1, 4);

        // Removing a friend connection
        System.out.println("\nRemoving a Friend Connection:");
        network.removeFriendConnection(1, 3);
        network.displayAllUsers();

        // Search for a user
        System.out.println("\nSearching for Bob:");
        User foundUser = network.findUserByName("Bob");
        if (foundUser != null) {
            System.out.println("User Found: " + foundUser.name + " (ID: " + foundUser.userID + ")");
        } else {
            System.out.println("User not found.");
        }
    }
}

