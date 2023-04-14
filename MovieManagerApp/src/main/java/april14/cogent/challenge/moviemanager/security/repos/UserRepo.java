package april14.cogent.challenge.moviemanager.security.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import april14.cogent.challenge.moviemanager.security.roles.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{
	User findByUsername(String username);
}
