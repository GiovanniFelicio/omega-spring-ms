package com.omega.user.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author ENGCARVALHO
 */

@Data
@Entity
@Table(name="OMG_USER")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    
    @Column(name = "NAME")
    private String name;
    
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "USERNAME")
    private String username;
    
    @Column(name = "PASSWORD")
    private String password;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "OMG_USER_ROLE", 
            joinColumns = {@JoinColumn(name = "ID_USER")},
            inverseJoinColumns = {@JoinColumn(name = "ID_ROLE")})
    private Set<Role> roles; 
}
