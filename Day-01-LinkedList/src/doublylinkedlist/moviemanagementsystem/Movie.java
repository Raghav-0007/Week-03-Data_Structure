package doublylinkedlist.moviemanagementsystem;

public class Movie {
    // data fields of movie
    private String title;
    private String director;
    private String releaseYear;
    private float rating;

    // next and previos pointer
    Movie next, prev;

    // constructor
    public Movie(String title, String director, String releaseYear, float rating){
        this.title=title;
        this.director=director;
        this.releaseYear=releaseYear;
        this.rating=rating;
        next=prev=null;
    }

    // getter
    public String getTitle() {
        return title;
    }

    // getter
    public float getRating() {
        return rating;
    }

    // setter
    public void setRating(float rating) {
        this.rating = rating;
    }

    // method to get details
    public void getDetails(){
        System.out.println("title: "+title);
        System.out.println("director: "+director);
        System.out.println("releaseYear: "+releaseYear);
        System.out.println("rating: "+rating);
        System.out.println();
    }
}
