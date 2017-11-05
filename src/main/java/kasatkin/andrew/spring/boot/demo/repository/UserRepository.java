package kasatkin.andrew.spring.boot.demo.repository;

import kasatkin.andrew.spring.boot.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}
