package cogent1.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent1.com.entities.User;

@Repository
public interface UserRepositories extends JpaRepository<User, Long>{

}
