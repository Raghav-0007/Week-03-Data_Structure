package singlylinkedlist.socialmediafriendconnections;

class FriendList {
    int friendID;
    FriendList next;

    public FriendList(int friendID) {
        this.friendID = friendID;
        this.next = null;
    }
}

