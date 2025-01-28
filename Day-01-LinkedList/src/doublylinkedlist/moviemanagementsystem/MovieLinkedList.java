package doublylinkedlist.moviemanagementsystem;

public class MovieLinkedList {
    Movie head, tail;

    // method to add at beginning
    public void addAtBeginning(String title, String director, String releaseYear, float rating){
        Movie movie=new Movie(title, director, releaseYear, rating);

        if(head==null){
            head=tail=movie;
            return;
        }
        movie.next=head;
        head=movie;
    }

    // method to add at end
    public void addAtEnd(String title, String director, String releaseYear, float rating){
        Movie movie=new Movie(title, director, releaseYear, rating);

        if(head==null){
            head=tail=movie;
            return;
        }
        movie.prev=tail;
        tail.next=movie;
        tail=movie;
    }

    // method to at specific position
    public void addAtPosition(String title, String director, String releaseYear, float rating, int index){
        Movie movie=new Movie(title, director, releaseYear, rating);

        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(index==1){
            movie.next=head;
            head=movie;
            return;
        }
        Movie temp=head;
        for(int i=1; i<index-1 && temp!=null; i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("invalid index number");
            return;
        }
        if(temp.next==null){
            temp.next=movie;
            movie.prev=temp;
            tail=movie;
            return;
        }
        movie.next=temp.next;
        movie.prev=temp;
        temp.next.prev=movie;
        temp.next=movie;
    }

    // method to remove by title
    public  void removeByTitle(String title){
        Movie temp=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while (temp!=null && !temp.getTitle().equals(title)){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("not found this title movie");
            return;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        System.out.println("deleted successfuly");
    }

    // method to search by rating
    public void searchByRating(float rating){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Movie temp=head;

        while (temp!=null && temp.getRating()!=rating){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("not found!");
            return;
        }
        System.out.println("searched successful....");
        temp.getDetails();
    }

    // update rating
    public void updateRating(String title, float rating){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Movie temp=head;

        while (temp!=null && !temp.getTitle().equals(title)){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("not found!");
            return;
        }
        temp.setRating(rating);
    }

    // forward display
    public void displayForward(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Movie temp=head;
        while (temp!=null){
            temp.getDetails();
            temp=temp.next;
        }
    }

    // reverse display
    public void displayReverse(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Movie temp=tail;
        while (temp!=null){
            temp.getDetails();
            temp=temp.prev;
        }
    }
}
