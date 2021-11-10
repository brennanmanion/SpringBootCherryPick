package com.brennanmanion.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User extends BaseModel{		
    
    @Getter
    @Setter
    @Column(name = "username", length = 128)
	public String username;	
	
    @Getter
    @Setter
    @Column(name = "password", length = 128)
	public String password;

    @Getter
    @Setter
    @Column(name = "enabled")
	public Boolean enabled;    
    
}