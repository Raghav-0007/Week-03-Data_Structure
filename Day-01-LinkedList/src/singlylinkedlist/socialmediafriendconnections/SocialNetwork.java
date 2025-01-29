package singlylinkedlist.socialmediafriendconnections;

class SocialNetwork {
    private User head = null;

    // Add a new user
    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Search for a user by ID
    public User findUserByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search for a user by Name
    public User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            user1.addFriend(userID2);
            user2.addFriend(userID1);
            System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            user1.removeFriend(userID2);
            user2.removeFriend(userID1);
            System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        System.out.print("Mutual friends of " + user1.name + " and " + user2.name + ": ");
        FriendList temp1 = user1.friends;
        boolean found = false;

        while (temp1 != null) {
            FriendList temp2 = user2.friends;
            while (temp2 != null) {
                if (temp1.friendID == temp2.friendID) {
                    System.out.print(temp1.friendID + " ");
                    found = true;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }

        if (!found) System.out.print("None");
        System.out.println();
    }

    // Display all users and their friends
    public void displayAllUsers() {
        User temp = head;
        while (temp != null) {
            temp.displayFriends();
            temp = temp.next;
        }
    }
}

