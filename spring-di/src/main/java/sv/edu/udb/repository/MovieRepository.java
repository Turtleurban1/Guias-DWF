package sv.edu.udb.repository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import sv.edu.udb.repository.domain.Movie;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * Clase que simulara el acceso a un banco de datos
 * pudiendo ser estos, una base de dato,un archivo de texto,
 * un archivo excel, etc.
 */
@Component
public class MovieRepository {
    //Lista de peliculas en memoria
    private List<Movie> listOfMovies;
    /**
     * Metodo que inicializa los objetos
     * en este caso la lista de peliculas
     */
    @PostConstruct
    private void init() {
        final Movie movie_1 = Movie
                .builder()
                .id(1L)
                .name("Inception")
                .type("Science Fiction")
                .releaseYear(2010)
                .build();
        final Movie movie_2 = Movie
                .builder()
                .id(2L)
                .name("Butterfly effect")
                .type("Science Fiction Thriller")
                .releaseYear(2004)
                .build();
        final Movie movie_3 = Movie
                .builder()
                .id(3L)
                .name("Interstellar")
                .type("Science Fiction")
                .releaseYear(2014)
                .build();
        this.listOfMovies = List.of(movie_1, movie_2, movie_3);
    }
    /**
     * Metodo para la busqueda de peliculas por id.
     *
     * @param id identificador de la pelicula
     * @return la pelicula sino una error que no existe la pelicula
     */
    public Movie findMovieById(final Long id) {
        return this.listOfMovies
                .stream()
                .filter(movie -> id.equals(movie.getId()))
                .findFirst()
                .orElseThrow
                        (() -> new NoSuchElementException("Movie doesn't exists"));
    }
}