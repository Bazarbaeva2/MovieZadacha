import java.util.Comparator;
import java.util.List;

public class Movie implements Finable,Sortable {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }



    @Override
    public int compareTo(Movie o) {

        return year - o.year;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {

        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies, String movie) {
        for (Movie m : movies) {
            if (m.name.equals(name)) {
                System.out.println(m);

            }/*else System.out.println("Myndai kino jok");
            return;*/

        }

    }

    @Override
    public void findMovieByActorName(List<Movie> movies, String actor) {
        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                if (cast.getActorFullName().equals(actor)) {
                    System.out.println(movie);

                }/*else System.out.println("Myndai actor jok");
                return;*/


            }

        }

    }

    @Override
    public void findMovieByYear(List<Movie> movies, int year) {
        for (Movie number : movies) {
            int num = year;
            if (number.year == num)
                System.out.println(number);

        }/*else System.out.println("Bul jyly myndai kino chygarylgan jok");
        return;*/

    }


    @Override
    public void findMovieByDirector(List<Movie> movies, String director) {
        for (Movie m : movies) {
            if (m.director.getName2().equals(director))
                System.out.println(m);


        }/*else System.out.println("Myndai director jok");
        return;*/

    }



    @Override
    public void findMovieByDescription(List<Movie> movies, String des) {
        for (Movie m:movies) {
            if (m.description.equals(des))
                System.out.println(m);


        }/*else System.out.println("Myndai des kino jok");
        return;*/
    }

    @Override
    public void findMovieByRole(List<Movie> movies, String role) {
        for (Movie m:movies) {
            for (Cast cast:m.getCast()) {
                if (cast.getRole().equals(role))
                    System.out.println(m);

            }/*else System.out.println("Myndai role jok");
            return;*/

        }

    }

    @Override
    public void sortByMovieName(List<Movie> movies) {

    }

    @Override
    public void sortByYear(List<Movie> movies) {

    }

    @Override
    public void sortByDirector(List<Movie> movies) {

    }

    @Override
    public void sortByMovieName(List<Movie> movies, String name) {

    }

    @Override
    public void sortByYear(List<Movie> movies, int year) {

    }

    @Override
    public void sortByDirector(List<Movie> movies, String director) {

    }
    @Override
    public String toString() {
        return return "\n===========================================================" +
                "\nMovie name: " + name +
                "\nyear: " + year +
                "\ndescription: " + description +
                "\ndirector: " + director +
                "\ncast: " + cast;


    }

    public static Comparator<Movie> sortByName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie> sortByYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };
    public static Comparator<Director> sortByDirector = new Comparator<Director>() {
        @Override
        public int compare(Director o1, Director o2) {
            return o1.getName2().compareTo((Movie) o2.getName2());

        }
    };
}







