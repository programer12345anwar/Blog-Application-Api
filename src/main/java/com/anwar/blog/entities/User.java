package com.anwar.blog.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users") // Define table name
@Getter
@Setter
@NoArgsConstructor // Required by JPA
@AllArgsConstructor // Optional for convenience
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Primary key with auto-increment
	private int id;
	
	@Column(name = "user_name", nullable = false, length = 100) // so you can change name by using @Column
	private String name;

	private String email;

	private String password;
	
	private String about;
	
	// one user can post multiple posts or list of post
		@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		private List<Post> posts =new ArrayList<>();
}
