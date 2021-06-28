package com.omega.user.resource.ms;

import com.omega.user.resource.*;
import com.omega.user.entity.User;
import com.omega.user.service.UserService;
import java.util.Optional;
import javax.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ENGCARVALHO
 */

@RefreshScope
@RestController
@RequestMapping(path = "/api/v1/ms/user", method = RequestMethod.GET)
public class UserResourceMS {
    
    @Autowired
    private UserService service;
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> find(@PathVariable("id") Long id) {
        
        Optional<User> optional = service.findById(id);
        
        return new ResponseEntity<>(optional.get(), HttpStatus.ACCEPTED);
    }
    
    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> search(@RequestParam("username") String username) {
        
        Optional<User> optional = service.findByUsername(username);
        
        return new ResponseEntity<>(optional.get(), HttpStatus.ACCEPTED);
    }
}
