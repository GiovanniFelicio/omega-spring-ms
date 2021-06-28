package com.omega.oauth.feignclient;

import com.omega.oauth.model.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ENGCARVALHO
 */

@Component
@FeignClient(name = "user", path = "/api/v1/ms/user")
public interface UserFeignClient {
    
    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserVO> search(@RequestParam("username") String username);
    
}
