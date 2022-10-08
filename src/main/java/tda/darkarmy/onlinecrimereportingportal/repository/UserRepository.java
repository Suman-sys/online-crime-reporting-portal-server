package tda.darkarmy.onlinecrimereportingportal.repository;

import tda.darkarmy.onlinecrimereportingportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    
}
