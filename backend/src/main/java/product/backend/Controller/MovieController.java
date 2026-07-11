package product.backend.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import product.backend.Model.Movie;
import product.backend.Service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController
{
    @Autowired
    private MovieService movieService;

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie)
    {
        return movieService.addMovie(movie);
    }
    @GetMapping
    public ResponseEntity<List<Movie>> all()
    {
        return new ResponseEntity<List<Movie>>(movieService.AllMovies(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> singleMovie(@PathVariable ObjectId id)
    {
        return new ResponseEntity<Movie>(movieService.movieById(id),HttpStatus.OK);

    }
}

