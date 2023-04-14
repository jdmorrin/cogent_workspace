package april14.cogent.challenge.moviemanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import april14.cogent.challenge.moviemanager.entities.Favorite;
import april14.cogent.challenge.moviemanager.repos.FavoritesRepo;

@Service
public class FavoriteService {
	@Autowired
	FavoritesRepo repo;
	
	public Optional<Favorite> get(Integer id){
		return repo.findById(id);
	}
	
	public Favorite update(Favorite fav) {
		return repo.save(fav);
	}
	
	public List<Favorite> getAll(){
		return (List<Favorite>)repo.findAll();
	}
	
	public void delete(Favorite fav) {
		repo.delete(fav);
	}
}
