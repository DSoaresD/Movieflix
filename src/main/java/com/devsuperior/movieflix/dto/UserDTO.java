package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.devsuperior.movieflix.entities.User;


public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;	
	private String name;
	private String email;
	private String password;
	

	private Set<RoleDTO> roles = new HashSet<>();
	
	
	private List<ReviewDTO> reviews = new ArrayList<>();
	
	public UserDTO() {		
	}

	public UserDTO(Long id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		
	}
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}


	public void setPassword(String password) {
		this.password = password;
	}
		
	public Set<RoleDTO> getRoles() {
		return roles;
	}
	

	public List<ReviewDTO> getReviews() {
		return reviews;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(id, other.id);
	}
}
