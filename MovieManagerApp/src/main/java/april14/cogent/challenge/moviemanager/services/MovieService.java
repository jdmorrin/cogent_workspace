package april14.cogent.challenge.moviemanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import april14.cogent.challenge.moviemanager.entities.Movie;
import april14.cogent.challenge.moviemanager.repos.MovieRepo;

@Service
public class MovieService {
	@Autowired
	MovieRepo repo;
	
	public Optional<Movie> get(Integer id){
		return repo.findById(id);
	}
	
	public Movie update(Movie movie) {
		return repo.save(movie);
	}
	
	public List<Movie> getAll(){
		return (List<Movie>)repo.findAll();
	}
	
	public void delete(Movie movie) {
		repo.delete(movie);
	}
}
