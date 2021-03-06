package com.omega.user.repository;

import com.omega.user.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ENGCARVALHO
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
    @Query(value = "SELECT u FROM User u WHERE u.username = :username")
    Optional<User> findByUsername(@Param("username") String username);
    
}
