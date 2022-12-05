import java.util.*;

public class Main {
    public static void main(String[] args) {



        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie("Birtuganchik",2015,"Comedy",new Director("Bakyt","Osmonkanov"),List.of(new Cast("Mairambek uulu Jenish","Inisi")));
        Movie movie2 = new Movie("Naparnikter",2016,"Comedy", new Director("Bayt","Osmonkanov"),List.of(new Cast("Mairambek uulu Jenish","Naparnik")));
        Movie movie3 = new Movie("Naparnikter 2",2017,"Comedy",new Director("Ruslan","Akun"),List.of(new Cast("Mairambek uulu Jenish","Naparnik")));
        Movie movie4 = new Movie("Nasledniki",2015,"TV Darama",new Director("Chan","Gi sang"),List.of(new Cast("Lee Min Ho","Kim Tan Queen")));
        Movie movie5 =new Movie("Malchiki posle yagoda",2011,"TV Darama",new Director("Kim","U bin"),List.of(new Cast("Lee Min Ho","Gu Jun Pe Queen")));
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);





        //Collections.sort(movies);





        for (Movie m:movies) {
            System.out.println(movies);





        }











    }
}
