package com.omega.user.service;

import com.omega.user.entity.User;
import com.omega.user.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ENGCARVALHO
 */

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public Optional<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }
    
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
}
