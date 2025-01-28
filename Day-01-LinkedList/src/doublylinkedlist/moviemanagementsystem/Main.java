package doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieLinkedList list=new MovieLinkedList();

        // adding movies in list
        list.addAtBeginning("3 Idiots", "Rajkumar Hirani", "2009", 8.4f);
        list.addAtBeginning("Dangal", "Nitesh Tiwari", "2016", 8.3f);
        list.addAtEnd("Baahubali: The Beginning", "S.S. Rajamouli", "2015", 8.0f);
        list.addAtEnd("Lagaan", "Ashutosh Gowariker", "2001", 8.1f);
        list.addAtEnd("Swades", "Ashutosh Gowariker", "2004", 8.2f);
        list.addAtPosition("Sholay", "Ramesh Sippy", "1975", 8.1f, 1);
        list.addAtPosition("RRR", "S.S. Rajamouli", "2022", 8.0f, 4);

        list.displayForward();

        // update the rating
        list.updateRating("Baahubali: The Beginning", 9.0f);
        list.displayForward();

        // search by rating
        list.searchByRating(8.4f);

        // remove by title
        list.removeByTitle("Lagaan");

        // display the reverse movies
        list.displayReverse();
    }
}
