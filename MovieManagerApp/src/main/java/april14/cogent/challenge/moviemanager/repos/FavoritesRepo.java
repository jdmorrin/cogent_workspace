package april14.cogent.challenge.moviemanager.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import april14.cogent.challenge.moviemanager.entities.Favorite;

@Repository
public interface FavoritesRepo extends CrudRepository<Favorite, Integer>{

}
