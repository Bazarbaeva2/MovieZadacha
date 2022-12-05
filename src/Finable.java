import java.util.List;

public interface Finable {

    int compareTo(Movie o);

    List<Movie>getAllMovies(List<Movie> movies);
    void findMovieByName(List<Movie>movies,String movie);
    void findMovieByActorName(List<Movie>movies,String actor);
    void findMovieByYear(List<Movie>movies,int year);
    void findMovieByDirector(List<Movie>movies,String director);
    void findMovieByDescription(List<Movie>movies,String name);
    void findMovieByRole(List<Movie>movies,String role);
}
