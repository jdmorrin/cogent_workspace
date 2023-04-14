package april14.cogent.challenge.moviemanager.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import april14.cogent.challenge.moviemanager.entities.Movie;

@Repository
public interface MovieRepo extends CrudRepository<Movie, Integer>{
	Movie findByName(String name);
}
