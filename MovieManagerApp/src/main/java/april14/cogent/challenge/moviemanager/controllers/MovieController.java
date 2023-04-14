package april14.cogent.challenge.moviemanager.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import april14.cogent.challenge.moviemanager.entities.Movie;
import april14.cogent.challenge.moviemanager.services.MovieService;

@RestController
//@RequestMapping(name = "/api")
public class MovieController {
	@Autowired
	MovieService service;
	
	// Add movies to the db
	@PostMapping("/movies")
	public Movie add(@RequestBody Movie movie) {
		return service.update(movie);
	}
	
	// Gte movies by id
	@GetMapping("/movies")
	public Movie getById(@RequestParam(value = "id") Integer id) {
		Optional<Movie> i = service.get(id);
		return i.get();
	}
	
	// Get movies by name
	@GetMapping("/movies/get")
	public Movie getByName(@RequestParam(value = "name") String name) {
		List <Movie> movies = this.listAll();
		Movie mo = movies.stream().filter(m -> m.getName().equals(name)).findFirst().get();
		return mo;
	}
	
	// Get movies all
	@GetMapping("/movies/all")
	public List<Movie> listAll(){
		return service.getAll();
	}
	
	//Get movies by gnere
	@GetMapping("/genre/all")
	public List<Movie> getGenreList(@RequestParam(value = "genre") String genre){
		List <Movie> genreMovies = new ArrayList<>();
		
		for(Movie m : this.listAll()) {
			if(m.getGenre().equals(genre)) {
				genreMovies.add(m);
			}
		}
		
		return genreMovies;
	}
	
	// I think this one should also request parameter of tyoe ID
	@PutMapping("/movies")
	public Movie update(@RequestParam(value = "id") Integer id, @RequestBody String releaseDate) {
		Optional<Movie> i = service.get(id);
		Movie updatedMovie = i.get();
		updatedMovie.setReleaseDate(releaseDate);
		
		return service.update(updatedMovie);
	}
	
	@DeleteMapping("/movies")
	public String delete(@RequestParam(value = "id") Integer id) {
		Optional<Movie> i = service.get(id);
		service.delete(i.get());
		return "Deletion of object with id["+id+"] completed";
	}
}
