//package movies;
//
//import util.Input;
//
public class MoviesApplication {
    public static void main(String[] args) {
         Input input = new Input();



    }
        public static Movie[] movies = MoviesArray.findAll();

    public static void showMovie(Movie movie) {
        System.out.println(movie);
    }

    public static void showMovies() {
        for(Movie movie : movies) {
            showMovie(movie);
        }
    }

    public static void showMovies(String category) {
        for(Movie movie : movies) {
            if (! movie.catGetter().equals(category)) {
                continue;
            }
            showMovie(movie);
        }
    }

    public void options() {
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view musicals");
            System.out.println("3 - add a movie");

         int userChoice = Input.getInt();

            switch (userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    showMovies();
                    break;
                case 2:
                    showMovies("animated");
                    break;
                case 3:
                    showMovies("horror");
                    break;
                    case 4:
                    showMovies("scifi");
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } while(true);
    }




}
