package april14.cogent.challenge.moviemanager.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import april14.cogent.challenge.moviemanager.entities.Favorite;
import april14.cogent.challenge.moviemanager.entities.Movie;
import april14.cogent.challenge.moviemanager.services.FavoriteService;
import april14.cogent.challenge.moviemanager.services.MovieService;

@RestController
public class FavoritesController {
	@Autowired
	FavoriteService service;
	
	@Autowired
	MovieService movieService;
	
	@PostMapping("/favorites")
	public Favorite add(@RequestParam(value = "movie_id") Integer id) {
		Optional<Movie> i = movieService.get(id);
		Favorite fav = new Favorite();
		fav.setMovie(i.get());
		return service.update(fav);
	}
	
	@GetMapping("/favorites")
	public List<Favorite> listAll(){
		return (List<Favorite>)service.getAll(); 
	}
	
	// Idk how to do this one here
	// I'm stuck on this one here
	@PutMapping("/favorites")
	public Favorite update(@RequestBody Favorite fav) {
		return service.update(fav);
	}
	
	@DeleteMapping("/favorites")
	public String delete(@RequestParam(value = "id") Integer id) {
		Optional<Favorite> i = service.get(id);
		service.delete(i.get());
		return "MovieID["+id+"] has been removed from favorites";
	}
	
	
}
