package com.omega.oauth.model;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author ENGCARVALHO
 */
@Data
public class RoleVO implements Serializable{
    
    private Long id;
    
    private String roleName;
}
