package product.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product.backend.Model.Movie;
import product.backend.Repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;


    public Movie addMovie(Movie movie)
    {
        return movieRepository.save(movie);
    }

   public List<Movie> AllMovies()
    {
        return movieRepository.findAll();
    }


}
