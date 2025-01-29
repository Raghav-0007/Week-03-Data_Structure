package singlylinkedlist.socialmediafriendconnections;

class User {
    int userID, age;
    String name;
    FriendList friends;
    User next;

    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }

    // Add friend to the user's friend list
    public void addFriend(int friendID) {
        FriendList newFriend = new FriendList(friendID);
        newFriend.next = friends;
        friends = newFriend;
    }

    // Remove a friend from the user's friend list
    public void removeFriend(int friendID) {
        FriendList temp = friends, prev = null;
        while (temp != null && temp.friendID != friendID) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return; // Friend not found

        if (prev == null) friends = temp.next; // Remove first friend
        else prev.next = temp.next;
    }

    // Display all friends of the user
    public void displayFriends() {
        System.out.print("Friends of " + name + " (ID: " + userID + "): ");
        FriendList temp = friends;
        if (temp == null) {
            System.out.println("No friends.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.friendID + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Count the number of friends
    public int countFriends() {
        int count = 0;
        FriendList temp = friends;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

