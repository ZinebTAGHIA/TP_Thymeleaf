package ma.taghia.tp_thymeleaf.repositories;

import ma.taghia.tp_thymeleaf.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
