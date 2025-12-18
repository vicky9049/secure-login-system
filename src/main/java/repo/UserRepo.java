package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.jwtDemo.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {
     Users findByUsername(String username);

}
