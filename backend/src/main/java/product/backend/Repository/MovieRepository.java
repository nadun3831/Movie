package product.backend.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import product.backend.Model.Movie;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {


}
