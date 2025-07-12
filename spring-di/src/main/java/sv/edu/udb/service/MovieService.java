package sv.edu.udb.service;
import sv.edu.udb.repository.domain.Movie;
public interface MovieService {

    Movie findMovieById(final Long id);
}