import java.util.List;

public interface Sortable {

    void sortByMovieName(List<Movie> movies);
    void sortByYear(List<Movie>movies);
    void sortByDirector(List<Movie>movies);

    void sortByMovieName(List<Movie> movies, String name);

    void sortByYear(List<Movie> movies, int year);

    void sortByDirector(List<Movie> movies, String director);
}
