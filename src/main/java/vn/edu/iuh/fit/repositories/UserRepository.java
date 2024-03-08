package vn.edu.iuh.fit.repositories;

import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.models.User;

public interface UserRepository extends CrudRepository<User, String> {
}
